package com.leetcode.L301_400.L0397;

public class IntegerReplacementTest {
    public static void main(String[] args) {
        IntegerReplacement integerReplacement = new IntegerReplacement();
        /**
         * 示例 1：
         * 输入：n = 8
         * 输出：3
         * 解释：8 -> 4 -> 2 -> 1
         */
        System.out.println(integerReplacement.integerReplacement(8));
        /**
         * 示例 2：
         * 输入：n = 7
         * 输出：4
         * 解释：7 -> 8 -> 4 -> 2 -> 1
         * 或 7 -> 6 -> 3 -> 2 -> 1
         */
        System.out.println(integerReplacement.integerReplacement(7));
        /**
         * 示例 3：
         * 输入：n = 4
         * 输出：2
         */
        System.out.println(integerReplacement.integerReplacement(4));
    }
}
