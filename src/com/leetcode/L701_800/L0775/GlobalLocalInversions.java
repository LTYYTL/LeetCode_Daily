package com.leetcode.L701_800.L0775;

/**
 * 775. 全局倒置与局部倒置
 * 给你一个长度为 n 的整数数组 nums ，表示由范围 [0, n - 1] 内所有整数组成的一个排列。
 * 全局倒置 的数目等于满足下述条件不同下标对 (i, j) 的数目：
 * (1)0 <= i < j < n
 * (2)nums[i] > nums[j]
 * <p>
 * 局部倒置 的数目等于满足下述条件的下标 i 的数目：
 * (1)0 <= i < n - 1
 * (2)nums[i] > nums[i + 1]
 * 当数组 nums 中 全局倒置 的数量等于 局部倒置 的数量时，返回 true ；否则，返回 false 。
 * <p>
 * 示例 1：
 * 输入：nums = [1,0,2]
 * 输出：true
 * 解释：有 1 个全局倒置，和 1 个局部倒置。
 * <p>
 * 示例 2：
 * 输入：nums = [1,2,0]
 * 输出：false
 * 解释：有 2 个全局倒置，和 1 个局部倒置。
 * <p>
 * 提示：
 * n == nums.length
 * 1 <= n <= 105
 * 0 <= nums[i] < n
 * nums 中的所有整数 互不相同
 * nums 是范围 [0, n - 1] 内所有数字组成的一个排列
 */
public class GlobalLocalInversions {
    /**
     * 方法：数学
     * 解题思路：https://leetcode.cn/problems/global-and-local-inversions/solution/-by-muse-77-q80y/
     */
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }
}
