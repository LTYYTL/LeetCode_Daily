package com.leetcode.L5709;

public class MaximumAscendingSubarraySumTest {
    public static void main(String[] args) {
        MaximumAscendingSubarraySum maximumAscendingSubarraySum = new MaximumAscendingSubarraySum();
        /*** 示例 1：
         * 输入：nums = [10,20,30,5,10,50]
         * 输出：65
         * 解释：[5,10,50] 是元素和最大的升序子数组，最大元素和为 65 。
         */
        System.out.println(maximumAscendingSubarraySum.maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}));
        /**
         * 示例 2：
         * 输入：nums = [10,20,30,40,50]
         * 输出：150
         * 解释：[10,20,30,40,50] 是元素和最大的升序子数组，最大元素和为 150 。
         */
        System.out.println(maximumAscendingSubarraySum.maxAscendingSum(new int[]{10,20,30,40,50}));
        /**
         * 示例 3：
         * 输入：nums = [12,17,15,13,10,11,12]
         * 输出：33
         * 解释：[10,11,12] 是元素和最大的升序子数组，最大元素和为 33 。
         */
        System.out.println(maximumAscendingSubarraySum.maxAscendingSum(new int[]{12,17,15,13,10,11,12}));
        /**
         * 示例 4：
         * 输入：nums = [100,10,1]
         * 输出：100
         */
        System.out.println(maximumAscendingSubarraySum.maxAscendingSum(new int[]{100,10,1}));
    }
}
