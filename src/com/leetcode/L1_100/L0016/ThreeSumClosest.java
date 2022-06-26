package com.leetcode.L1_100.L0016;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * 返回这三个数的和。
 * 假定每组输入只存在恰好一个解。
 * <p>
 * 示例 1：
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * <p>
 * 示例 2：
 * 输入：nums = [0,0,0], target = 1
 * 输出：0
 * <p>
 * 提示：
 * 3 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * -104 <= target <= 104
 */
public class ThreeSumClosest {
    /**
     * 方法：双指针
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        //长度不够
        if (nums.length < 3)
            return 0;
        //排序
        Arrays.sort(nums);
        //差值
        int delta = Integer.MAX_VALUE;
        //遍历
        for (int i = 0; i < nums.length; i++) {
            //和值，固定第一个数，寻找二和三
            int sum = nums[i] + twoSum(nums, i + 1, target - nums[i]);
            //记录最小差值
            if (Math.abs(delta) > Math.abs(target - sum))
                delta = target - sum;
        }
        return target - delta;
    }

    /**
     * 两数之和
     *
     * @param nums
     * @param start
     * @param target
     * @return
     */
    private int twoSum(int[] nums, int start, int target) {
        //双指针
        int lo = start;
        int hi = nums.length - 1;
        //差值
        int delta = Integer.MAX_VALUE;
        //二分查找
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (Math.abs(delta) > Math.abs(target - sum))
                delta = target - sum;
            if (sum < target)
                lo++;
            else
                hi--;
        }
        return target - delta;
    }
}
