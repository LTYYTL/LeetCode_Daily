package com.leetcode.L801_900.L0891;

import java.util.Arrays;

/**
 * 891. 子序列宽度之和
 * 一个序列的 宽度 定义为该序列中最大元素和最小元素的差值。
 * 给你一个整数数组 nums ，返回 nums 的所有非空 子序列 的 宽度之和 。由于答案可能非常大，请返回对 109 + 7 取余 后的结果。
 * 子序列 定义为从一个数组里删除一些（或者不删除）元素，但不改变剩下元素的顺序得到的数组。例如，[3,6,2,7] 就是数组 [0,3,1,6,2,2,7] 的一个子序列。
 * <p>
 * 示例 1：
 * 输入：nums = [2,1,3]
 * 输出：6
 * 解释：子序列为 [1], [2], [3], [2,1], [2,3], [1,3], [2,1,3] 。
 * 相应的宽度是 0, 0, 0, 1, 1, 2, 2 。
 * 宽度之和是 6 。
 * <p>
 * 示例 2：
 * 输入：nums = [2]
 * 输出：0
 * <p>
 * 提示：
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 */
public class SumSubWidths {
    /**
     * 方法：数学
     * 解题思路：https://leetcode.cn/problems/sum-of-subsequence-widths/solution/by-muse-77-f6s5/
     */
    public int sumSubseqWidths(int[] nums) {
        // 排序
        Arrays.sort(nums);
        // 模
        int mod = (int) (1e9 + 7);
        // 长度
        int n = nums.length;

        // 结果
        long res = 0;
        // 2的幂数
        long[] pow = new long[n];
        // 初始化
        pow[0] = 1;
        // 遍历
        for (int i = 1; i < n; i++) {
            // 计算幂数
            pow[i] = (pow[i - 1] << 1) % mod;
        }

        // 计算结果
        for (int i = 0; i < n; i++) {
            res = (res + (pow[i] - pow[n - i - 1]) * nums[i] % mod) % mod;
        }

        return (int) res;
    }
}
