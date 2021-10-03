package com.leetcode.L1401_1500.L1438;

public class LongestContinuousSubarrayWithAbsoluteDiffLessEqualLimitTest {
    public static void main(String[] args) {
        LongestContinuousSubarrayWithAbsoluteDiffLessEqualLimit longestContinuousSubarrayWithAbsoluteDiffLessEqualLimit = new LongestContinuousSubarrayWithAbsoluteDiffLessEqualLimit();
        /**
         * 示例 1：
         * 输入：nums = [8,2,4,7], limit = 4
         * 输出：2
         * 解释：所有子数组如下：
         * [8] 最大绝对差 |8-8| = 0 <= 4.
         * [8,2] 最大绝对差 |8-2| = 6 > 4.
         * [8,2,4] 最大绝对差 |8-2| = 6 > 4.
         * [8,2,4,7] 最大绝对差 |8-2| = 6 > 4.
         * [2] 最大绝对差 |2-2| = 0 <= 4.
         * [2,4] 最大绝对差 |2-4| = 2 <= 4.
         * [2,4,7] 最大绝对差 |2-7| = 5 > 4.
         * [4] 最大绝对差 |4-4| = 0 <= 4.
         * [4,7] 最大绝对差 |4-7| = 3 <= 4.
         * [7] 最大绝对差 |7-7| = 0 <= 4.
         * 因此，满足题意的最长子数组的长度为 2 。
         */
        int[] nums = new int[]{8,2,4,7};
        System.out.println(longestContinuousSubarrayWithAbsoluteDiffLessEqualLimit.longestSubarray(nums,4));
    }
}
