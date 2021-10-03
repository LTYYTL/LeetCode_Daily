package com.leetcode.L1801_1900.L1881;

public class MaximumValueInsertionTest {
    public static void main(String[] args) {
        MaximumValueInsertion maximumValueInsertion = new MaximumValueInsertion();
        /**
         * 示例 1：
         * 输入：n = "99", x = 9
         * 输出："999"
         * 解释：不管在哪里插入 9 ，结果都是相同的。
         */
        System.out.println(maximumValueInsertion.maxValue("99", 9));
        /**
         * 示例 2：
         * 输入：n = "-13", x = 2
         * 输出："-123"
         * 解释：向 n 中插入 x 可以得到 -213、-123 或者 -132 ，三者中最大的是 -123 。
         */
        System.out.println(maximumValueInsertion.maxValue("-13", 2));
    }
}
