package com.leetcode.L801_900.L0862;

import java.util.ArrayDeque;

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
    /**
     * 方法：前缀和+单调队列
     */
    public int shortestSubarray(int[] nums, int k) {
        // 结果
        int res = nums.length + 1;
        // 前缀和
        long[] pre = new long[nums.length + 1];
        pre[0] = 0;
        // 计算前缀和
        for (int i = 1; i <= nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }

        // 双端队列
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // 遍历
        for (int i = 0; i < pre.length; i++) {
            // 当前和
            long cur = pre[i];
            // 优化：s[i]-s[j]>=k,无论之后的数是大还是小，都找不到比i-j更短的，所有s[j]就无效，移除
            while (!queue.isEmpty() && cur - pre[queue.peekFirst()] >= k) {
                res = Math.min(res, i - queue.pollFirst());
            }
            // 优化：如果s[j] > s[i],右x-s[j]>=k,必有x-s[i]>=k,s[i]到x更短，所以s[j]无效，移除
            while (!queue.isEmpty() && pre[queue.peekLast()] >= cur) {
                queue.pollLast();
            }
            queue.addLast(i);
        }

        return res > nums.length ? -1 : res;
    }
}
