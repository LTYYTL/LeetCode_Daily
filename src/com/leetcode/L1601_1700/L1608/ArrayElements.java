package com.leetcode.L1601_1700.L1608;

import java.util.Arrays;

/**
 * 1608. 特殊数组的特征值
 * 给你一个非负整数数组 nums 。如果存在一个数 x ，使得 nums 中恰好有 x 个元素 大于或者等于 x ，那么就称 nums 是一个 特殊数组 ，而 x 是该数组的 特征值 。
 * 注意： x 不必 是 nums 的中的元素。
 * 如果数组 nums 是一个 特殊数组 ，请返回它的特征值 x 。否则，返回 -1 。可以证明的是，如果 nums 是特殊数组，那么其特征值 x 是 唯一的 。
 * <p>
 * 示例 1：
 * 输入：nums = [3,5]
 * 输出：2
 * 解释：有 2 个元素（3 和 5）大于或等于 2 。
 * <p>
 * 示例 2：
 * 输入：nums = [0,0]
 * 输出：-1
 * 解释：没有满足题目要求的特殊数组，故而也不存在特征值 x 。
 * 如果 x = 0，应该有 0 个元素 >= x，但实际有 2 个。
 * 如果 x = 1，应该有 1 个元素 >= x，但实际有 0 个。
 * 如果 x = 2，应该有 2 个元素 >= x，但实际有 0 个。
 * x 不能取更大的值，因为 nums 中只有两个元素。
 * <p>
 * 示例 3：
 * 输入：nums = [0,4,3,0,4]
 * 输出：3
 * 解释：有 3 个元素大于或等于 3 。
 * <p>
 * 示例 4：
 * 输入：nums = [3,6,7,7,0]
 * 输出：-1
 * <p>
 * 提示：
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 1000
 */
public class ArrayElements {
    /**
     * 方法：排序
     */
    public int specialArray(int[] nums) {
        // 排序
        Arrays.sort(nums);
        // 长度
        int n = nums.length;
        //
        if (nums[0] >= nums.length)
            return n;
        // 遍历
        for (int i = 1; i < nums.length; i++) {
            // 个数
            int res = n - i;
            // 满足条件
            if (nums[i - 1] < res && nums[i] >= res) {
                return res;
            }
        }
        return -1;
    }
}
