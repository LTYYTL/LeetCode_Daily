package com.leetcode.L101_200.L0146;

import java.util.LinkedHashMap;

/**
 * 146. LRU 缓存机制
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制 。
 * 实现 LRUCache 类：
 * （1）LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
 * （2）int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * （3）void put(int key, int value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值」。
 *     当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 *
 * 进阶：你是否可以在 O(1) 时间复杂度内完成这两种操作？
 *
 * 示例：
 * 输入
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * 输出
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 * 解释
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // 缓存是 {1=1}
 * lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
 * lRUCache.get(1);    // 返回 1
 * lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
 * lRUCache.get(2);    // 返回 -1 (未找到)
 * lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
 * lRUCache.get(1);    // 返回 -1 (未找到)
 * lRUCache.get(3);    // 返回 3
 * lRUCache.get(4);    // 返回 4
 *
 * 提示：
 * 1 <= capacity <= 3000
 * 0 <= key <= 10000
 * 0 <= value <= 105
 * 最多调用 2 * 105 次 get 和 put
 */
public class LRUCache {
    /**
     * 方法：设计
     */
    int size;
    LinkedHashMap<Integer,Integer> cache;

    public LRUCache(int capacity) {
        this.size = capacity;
        this.cache = new LinkedHashMap<>();
    }

    public int get(int key) {
        //如果不存在直接返回-1
        if (!cache.containsKey(key))
            return -1;
        //存在将其改为最近访问
        matchCache(key);
        //返回值
        return cache.get(key);
    }

    public void put(int key, int value) {
        //存在情况
        if (cache.containsKey(key)){
            //修改缓存中的值
            cache.put(key,value);
            //将其改为最近访问
            matchCache(key);
            return;
        }
        //超出容量
        if (cache.size() >= this.size){
            //获取队首元素，即很久没有访问的元素
            Integer old = cache.keySet().iterator().next();
            //移除缓存
            cache.remove(old);
        }
        //将新点加入缓存
        cache.put(key,value);

    }

    //修改访问
    private void matchCache(int key) {
        //获取value
        int value = cache.get(key);
        //在缓存中移除
        cache.remove(key);
        //将其加回缓存中，变成最近访问
        cache.put(key,value);
    }
}
