package com.leetcode.L401_500.L0460;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * 460. LFU 缓存
 * 请你为 最不经常使用（LFU）缓存算法设计并实现数据结构。
 * 实现 LFUCache 类：
 * （1）LFUCache(int capacity) - 用数据结构的容量 capacity 初始化对象
 * （2）int get(int key) - 如果键存在于缓存中，则获取键的值，否则返回 -1。
 * （3）void put(int key, int value) - 如果键已存在，则变更其值；如果键不存在，请插入键值对。当缓存达到其容量时，则应该在插入新项之前，使最不经常使用的项无效。
 * 在此问题中，当存在平局（即两个或更多个键具有相同使用频率）时，应该去除 最近最久未使用 的键。
 * 注意「项的使用次数」就是自插入该项以来对其调用 get 和 put 函数的次数之和。使用次数会在对应项被移除后置为 0 。
 * 为了确定最不常使用的键，可以为缓存中的每个键维护一个 使用计数器 。使用计数最小的键是最久未使用的键。
 * 当一个键首次插入到缓存中时，它的使用计数器被设置为 1 (由于 put 操作)。对缓存中的键执行 get 或 put 操作，使用计数器的值将会递增。
 *
 * 示例：
 * 输入：
 * ["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
 * 输出：
 * [null, null, null, 1, null, -1, 3, null, -1, 3, 4]
 * 解释：
 * // cnt(x) = 键 x 的使用计数
 * // cache=[] 将显示最后一次使用的顺序（最左边的元素是最近的）
 * LFUCache lFUCache = new LFUCache(2);
 * lFUCache.put(1, 1);   // cache=[1,_], cnt(1)=1
 * lFUCache.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
 * lFUCache.get(1);      // 返回 1
 *                       // cache=[1,2], cnt(2)=1, cnt(1)=2
 * lFUCache.put(3, 3);   // 去除键 2 ，因为 cnt(2)=1 ，使用计数最小
 *                       // cache=[3,1], cnt(3)=1, cnt(1)=2
 * lFUCache.get(2);      // 返回 -1（未找到）
 * lFUCache.get(3);      // 返回 3
 *                       // cache=[3,1], cnt(3)=2, cnt(1)=2
 * lFUCache.put(4, 4);   // 去除键 1 ，1 和 3 的 cnt 相同，但 1 最久未使用
 *                       // cache=[4,3], cnt(4)=1, cnt(3)=2
 * lFUCache.get(1);      // 返回 -1（未找到）
 * lFUCache.get(3);      // 返回 3
 *                       // cache=[3,4], cnt(4)=1, cnt(3)=3
 * lFUCache.get(4);      // 返回 4
 *                       // cache=[3,4], cnt(4)=2, cnt(3)=3
 *
 * 提示：
 * 0 <= capacity, key, value <= 104
 * 最多调用 105 次 get 和 put 方法
 * 进阶：你可以为这两种操作设计时间复杂度为 O(1) 的实现吗？
 */
public class LFUCache {
    //长度
    int size;
    //key-value关系
    Map<Integer,Integer> key_value;
    //key-访问次数关系
    Map<Integer,Integer> key_fre;
    //访问次数-key关系
    Map<Integer, LinkedHashSet<Integer>> fre_key;
    //最小访问次数
    int minFre = 0;

    public LFUCache(int capacity) {
        this.size = capacity;
        this.key_value = new HashMap<>();
        this.key_fre = new HashMap<>();
        this.fre_key = new HashMap<>();
    }

    public int get(int key) {
        //不存在
        if (!key_value.containsKey(key)){
            return -1;
        }
        //存在，改变访问次数
        insertFre(key);
        //返回值
        return key_value.get(key);
    }



    public void put(int key, int value) {
        //空置情况
        if (size <= 0)
            return;
        //如果key存在，改变value
        if (key_value.containsKey(key)){
            //改变访问次数
            insertFre(key);
            //改变值
            key_value.put(key,value);
            return;
        }

        //容量已满情况，移除访问次数最少且最早的元素
        if (size <= key_value.size()){
            removeFre();
        }
        //更新key-value
        key_value.put(key,value);
        //更新key的访问次数为1
        key_fre.put(key,1);
        //检查访问次数是1的集合是否存在，不存在创建
        fre_key.putIfAbsent(1,new LinkedHashSet<>());
        //将其加入访问次数为1的集合
        fre_key.get(1).add(key);
        //此时访问次数最小为1
        minFre = 1;
    }

    /**
     * 更新访问次数
     * @param key
     */
    private void insertFre(int key) {
        //获取当前key的访问次数
        Integer fre = key_fre.get(key);
        //将当前key的访问次数+1
        key_fre.put(key,fre+1);
        //移除原来访问次数中的key
        fre_key.get(fre).remove(key);
        //检查访问次数+1的集合是否存在，不存在创建
        fre_key.putIfAbsent(fre+1,new LinkedHashSet<>());
        //将其加入访问次数为+1的集合
        fre_key.get(fre+1).add(key);
        //移除key之后，此访问次数下是否还有值
        if (fre_key.get(fre).isEmpty()){
            fre_key.remove(fre);//没有直接移除
            if (fre == minFre)//判断此次被移除的是否为最小的访问次数
                minFre++;
        }
    }

    /**
     * 移除访问次数最少且最早的元素
     */
    private void removeFre() {
        //获取访问次数最少的集合
        LinkedHashSet<Integer> set = fre_key.get(minFre);
        //获取第一个要被删除的元素
        Integer deleteKey = set.iterator().next();
        //在集合中移除
        set.remove(deleteKey);
        //移除key之后，此访问次数下是否还有值
        if (set.isEmpty())
            fre_key.remove(minFre);
        //移除key对应的value
        key_value.remove(deleteKey);
        //移除key对应的访问次数
        key_fre.remove(deleteKey);
    }
}
