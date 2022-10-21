package com.leetcode.L2401_2500.L2441;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2441. 与对应负数同时存在的最大正整数
 * 给你一个 不包含 任何零的整数数组 nums ，找出自身与对应的负数都在数组中存在的最大正整数 k 。
 * 返回正整数 k ，如果不存在这样的整数，返回 -1 。
 * <p>
 * 示例 1：
 * 输入：nums = [-1,2,-3,3]
 * 输出：3
 * 解释：3 是数组中唯一一个满足题目要求的 k 。
 * <p>
 * 示例 2：
 * 输入：nums = [-1,10,6,7,-7,1]
 * 输出：7
 * 解释：数组中存在 1 和 7 对应的负数，7 的值更大。
 * <p>
 * 示例 3：
 * 输入：nums = [-10,8,6,7,-2,-3]
 * 输出：-1
 * 解释：不存在满足题目要求的 k ，返回 -1 。
 * <p>
 * 提示：
 * 1 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * nums[i] != 0
 */
public class LargestIntegerNegative {
    /**
     * 方法：set集合
     */
    public int findMaxK(int[] nums) {
        // 记录出现的数字
        Set<Integer> set = new HashSet<>();
        // 结果
        int res = -1;

        // 排序
        Arrays.sort(nums);

        // 遍历
        for (int num : nums) {
            // 当前数字的绝对值
            int cur = Math.abs(num);
            // 已存在
            if (set.contains(cur) && num > 0) {
                // 记录最大
                res = Math.max(res, cur);
            }
            // 记录
            if (num < 0) {
                set.add(cur);
            }

        }
        return res;
    }
}
