package com.leetcode.L901_1000.L0912;

import com.util.Quick;

/**
 * 912. 排序数组
 * 给你一个整数数组 nums，请你将该数组升序排列。
 *
 * 示例 1：
 * 输入：nums = [5,2,3,1]
 * 输出：[1,2,3,5]
 *
 * 示例 2：
 * 输入：nums = [5,1,1,2,0,0]
 * 输出：[0,0,1,1,2,5]
 *
 * 提示：
 * 1 <= nums.length <= 5 * 104
 * -5 * 104 <= nums[i] <= 5 * 104
 */
public class SortArray {
    /**
     * 方法：快速排序
     * @param nums
     * @return
     */
    public int[] sortArray(int[] nums) {
        Quick.sort(nums);
        return nums;
    }
}
