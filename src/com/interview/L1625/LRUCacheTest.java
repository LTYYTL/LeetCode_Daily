package com.interview.L1625;

public class LRUCacheTest {
    public static void main(String[] args) {
        /**
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
         */
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.get(1));
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.get(2));
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.get(1));
        System.out.println(lRUCache.get(3));
        System.out.println(lRUCache.get(4));
    }
}
