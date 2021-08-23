package com.interview.L1625;

import java.util.LinkedHashMap;

/**
 * 面试题 16.25. LRU 缓存
 * 设计和构建一个“最近最少使用”缓存，该缓存会删除最近最少使用的项目。缓存应该从键映射到值(允许你插入和检索特定键对应的值)，并在初始化时指定最大容量。
 * 当缓存被填满时，它应该删除最近最少使用的项目。
 *
 * 它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 *
 * 示例:
 * LRUCache cache = new LRUCache( 2 ）// 缓存容量
 *cache.put(1,1);
 *cache.put(2,2);
 *cache.get(1);       // 返回  1
 *cache.put(3,3);    // 该操作会使得密钥 2 作废
 *cache.get(2);       // 返回 -1 (未找到)
 *cache.put(4,4);    // 该操作会使得密钥 1 作废
 *cache.get(1);       // 返回 -1 (未找到)
 *cache.get(3);       // 返回  3
 *cache.get(4);       // 返回  4
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
