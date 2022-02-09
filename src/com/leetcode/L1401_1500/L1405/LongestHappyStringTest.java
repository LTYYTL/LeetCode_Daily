package com.leetcode.L1401_1500.L1405;

public class LongestHappyStringTest {
    public static void main(String[] args) {
        LongestHappyString longestHappyString = new LongestHappyString();
        /**
         * 示例 1：
         * 输入：a = 1, b = 1, c = 7
         * 输出："ccaccbcc"
         * 解释："ccbccacc" 也是一种正确答案。
         */
        System.out.println(longestHappyString.longestDiverseString(1, 1, 7));
        /**
         * 示例 2：
         * 输入：a = 2, b = 2, c = 1
         * 输出："aabbc"
         */
        System.out.println(longestHappyString.longestDiverseString(2, 2, 1));
        /**
         * 示例 3：
         * 输入：a = 7, b = 1, c = 0
         * 输出："aabaa"
         * 解释：这是该测试用例的唯一正确答案。
         */
        System.out.println(longestHappyString.longestDiverseString(7, 1, 0));
    }
}
