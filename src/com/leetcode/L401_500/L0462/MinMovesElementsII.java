package com.leetcode.L401_500.L0462;

import java.util.Arrays;

/**
 * 462. 最少移动次数使数组元素相等 II
 * 给你一个长度为 n 的整数数组 nums ，返回使所有数组元素相等需要的最少移动数。
 * 在一步操作中，你可以使数组中的一个元素加 1 或者减 1 。
 * <p>
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：2
 * 解释：
 * 只需要两步操作（每步操作指南使一个元素加 1 或减 1）：
 * [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
 * <p>
 * 示例 2：
 * 输入：nums = [1,10,2,9]
 * 输出：16
 * <p>
 * 提示：
 * n == nums.length
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class MinMovesElementsII {
    /**
     * 方法：数学
     *
     * @param nums
     * @return
     */
    public int minMoves2(int[] nums) {
        //排序
        Arrays.sort(nums);
        //长度
        int n = nums.length;
        //中位值
        int mid = nums[n / 2];
        //结果
        int res = 0;
        //遍历
        for (int num : nums) {
            //计算差值和
            res += Math.abs(num - mid);
        }

        return res;
    }
}
