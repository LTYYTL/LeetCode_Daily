package com.leetcode.L801_900.L0864;

public class ShortestPathKeysTest {
    public static void main(String[] args) {
        ShortestPathKeys shortestPathKeys = new ShortestPathKeys();
        /*
          示例 1：
          输入：grid = ["@.a.#","###.#","b.A.B"]
          输出：8
          解释：目标是获得所有钥匙，而不是打开所有锁。
         */
        System.out.println(shortestPathKeys.shortestPathAllKeys(new String[]{"@.a.#", "###.#", "b.A.B"}));
        /*
          示例 2：
          输入：grid = ["@..aA","..B#.","....b"]
          输出：6
         */
        System.out.println(shortestPathKeys.shortestPathAllKeys(new String[]{"@..aA", "..B#.", "....b"}));
        /*
          示例 3:
          输入: grid = ["@Aa"]
          输出: -1
         */
        System.out.println(shortestPathKeys.shortestPathAllKeys(new String[]{"@Aa"}));
    }

}
