package com.leetcode.L801_900.L0862;

/**
 * 862. 和至少为 K 的最短子数组
 * 给你一个整数数组 nums 和一个整数 k ，找出 nums 中和至少为 k 的 最短非空子数组 ，并返回该子数组的长度。如果不存在这样的 子数组 ，返回 -1 。
 * 子数组 是数组中 连续 的一部分。
 * <p>
 * 示例 1：
 * 输入：nums = [1], k = 1
 * 输出：1
 * <p>
 * 示例 2：
 * 输入：nums = [1,2], k = 4
 * 输出：-1
 * <p>
 * 示例 3：
 * 输入：nums = [2,-1,2], k = 3
 * 输出：3
 * <p>
 * 提示：
 * 1 <= nums.length <= 105
 * -105 <= nums[i] <= 105
 * 1 <= k <= 109
 */
public class ShortSubSumK {
    public int shortestSubarray(int[] nums, int k) {
        int[] pre = new int[nums.length];
        pre[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }

        return 0;
    }
}
