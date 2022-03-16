package com.leetcode.L401_500.L0432;

public class AllOneTest {
    public static void main(String[] args) {

        /** * 示例：
         * 输入
         * ["AllOne", "inc", "inc", "getMaxKey", "getMinKey", "inc", "getMaxKey", "getMinKey"]
         * [[], ["hello"], ["hello"], [], [], ["leet"], [], []]
         * 输出
         * [null, null, null, "hello", "hello", null, "hello", "leet"]
         *
         * 解释
         * AllOne allOne = new AllOne();
         * allOne.inc("hello");
         * allOne.inc("hello");
         * allOne.getMaxKey(); // 返回 "hello"
         * allOne.getMinKey(); // 返回 "hello"
         * allOne.inc("leet");
         * allOne.getMaxKey(); // 返回 "hello"
         * allOne.getMinKey(); // 返回 "leet"
         */
        AllOne allOne = new AllOne();
        allOne.inc("hello");
        allOne.inc("hello");
        System.out.println(allOne.getMaxKey());
        System.out.println(allOne.getMinKey());
        allOne.inc("leet");
        System.out.println(allOne.getMaxKey());
        System.out.println(allOne.getMinKey());

    }
}
