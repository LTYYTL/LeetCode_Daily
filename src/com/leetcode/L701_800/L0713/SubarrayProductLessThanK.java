package com.leetcode.L701_800.L0713;

/**
 * 713. 乘积小于K的子数组
 * 给定一个正整数数组 nums和整数 k 。
 * 请找出该数组内乘积小于 k 的连续的子数组的个数。
 *
 * 示例 1:
 * 输入: nums = [10,5,2,6], k = 100
 * 输出: 8
 * 解释: 8个乘积小于100的子数组分别为: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]。
 * 需要注意的是 [10,5,2] 并不是乘积小于100的子数组。
 *
 * 示例 2:
 * 输入: nums = [1,2,3], k = 0
 * 输出: 0
 *
 * 提示:
 * 1 <= nums.length <= 3 * 104
 * 1 <= nums[i] <= 1000
 * 0 <= k <= 106
 */
public class SubarrayProductLessThanK {
    /**
     * 方法：滑动窗口
     * @param nums
     * @param k
     * @return
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //特殊情况
        if(k <= 1) return 0;
        int n = nums.length;
        int left = 0;
        int right = 0;
        int acc = 1;
        int res = 0;
        while (right < n){
            //窗口内积
            acc *= nums[right];
            //收缩窗口
            while (acc >= k){
                acc /= nums[left++];
            }
            //计算个数
            res += right - left + 1;
            //扩大窗口
            right++;
        }
        return res;
    }
}