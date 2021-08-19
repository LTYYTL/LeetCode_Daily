package com.leetcode.L0446;

public class ArithmeticSlicesII_SubsequenceTest {
    public static void main(String[] args) {
        ArithmeticSlicesII_Subsequence arithmeticSlicesII_subsequence = new ArithmeticSlicesII_Subsequence();
        /** * 示例 1：
         * 输入：nums = [2,4,6,8,10]
         * 输出：7
         * 解释：所有的等差子序列为：
         * [2,4,6]
         * [4,6,8]
         * [6,8,10]
         * [2,4,6,8]
         * [4,6,8,10]
         * [2,4,6,8,10]
         * [2,6,10]
         */
        System.out.println(arithmeticSlicesII_subsequence.numberOfArithmeticSlices(new int[]{2, 4, 6, 8, 10}));
        /**
         * 示例 2：
         * 输入：nums = [7,7,7,7,7]
         * 输出：16
         * 解释：数组中的任意子序列都是等差子序列。
         */
        System.out.println(arithmeticSlicesII_subsequence.numberOfArithmeticSlices(new int[]{7, 7, 7, 7, 7}));
    }
}
