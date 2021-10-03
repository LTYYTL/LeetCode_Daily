package com.leetcode.L1_100.L0041;

public class FirstMissingPositiveTest {
    public static void main(String[] args) {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        /** * 示例 1：
         * 输入：nums = [1,2,0]
         * 输出：3
         */
        System.out.println(firstMissingPositive.firstMissingPositive(new int[]{1, 2, 0}));
        /**
         * 示例 2：
         * 输入：nums = [3,4,-1,1]
         * 输出：2
         */
        System.out.println(firstMissingPositive.firstMissingPositive(new int[]{3,4,-1,1}));
        /**
         * 示例 3：
         * 输入：nums = [7,8,9,11,12]
         * 输出：1
         */
        System.out.println(firstMissingPositive.firstMissingPositive(new int[]{7,8,9,11,12}));
    }
}
