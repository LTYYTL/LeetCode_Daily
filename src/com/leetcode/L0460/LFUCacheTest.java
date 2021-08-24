package com.leetcode.L0460;

public class LFUCacheTest {
    public static void main(String[] args) {
        LFUCache lFUCache = new LFUCache(2);
        lFUCache.put(1, 1);   // cache=[1,_], cnt(1)=1
        lFUCache.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
        System.out.println(lFUCache.get(1));
        lFUCache.put(3, 3);   // 去除键 2 ，因为 cnt(2)=1 ，使用计数最小 cache=[3,1], cnt(3)=1, cnt(1)=2
        System.out.println(lFUCache.get(2));
        System.out.println(lFUCache.get(3));
        lFUCache.put(4, 4);   // 去除键 1 ，1 和 3 的 cnt 相同，但 1 最久未使用  cache=[4,3], cnt(4)=1, cnt(3)=2
        System.out.println(lFUCache.get(1));
        System.out.println(lFUCache.get(3));
        System.out.println(lFUCache.get(4));
    }
}
