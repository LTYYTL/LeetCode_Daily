package com.leetcode.L201_300.L0209;

public class MinimumSizeSubarraySumTest {
    public static void main(String[] args) {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        /**
         * 示例 1：
         * 输入：target = 7, nums = [2,3,1,2,4,3]
         * 输出：2
         * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
         */
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        /**
         * 示例 2：
         * 输入：target = 4, nums = [1,4,4]
         * 输出：1
         */
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(4, new int[]{1, 4, 4}));
        /**
         * 示例 3：
         * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
         * 输出：0
         */
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
    }
}
