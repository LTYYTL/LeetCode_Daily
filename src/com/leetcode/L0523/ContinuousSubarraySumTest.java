package com.leetcode.L0523;

public class ContinuousSubarraySumTest {
    public static void main(String[] args) {
        ContinuousSubarraySum continuousSubarraySum = new ContinuousSubarraySum();
        /** * 示例 1：
         * 输入：nums = [23,2,4,6,7], k = 6
         * 输出：true
         * 解释：[2,4] 是一个大小为 2 的子数组，并且和为 6 。
         */
        System.out.println(continuousSubarraySum.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        /**
         * 示例 2：
         * 输入：nums = [23,2,6,4,7], k = 6
         * 输出：true
         * 解释：[23, 2, 6, 4, 7] 是大小为 5 的子数组，并且和为 42 。
         * 42 是 6 的倍数，因为 42 = 7 * 6 且 7 是一个整数。
         */
        System.out.println(continuousSubarraySum.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        /**
         * 示例 3：
         * 输入：nums = [23,2,6,4,7], k = 13
         * 输出：false
         */
        System.out.println(continuousSubarraySum.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 13));
    }
}
