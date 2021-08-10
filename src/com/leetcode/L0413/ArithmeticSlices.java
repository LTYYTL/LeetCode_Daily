package com.leetcode.L0413;

/**
 * 413. 等差数列划分
 * 如果一个数列 至少有三个元素 ，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 * 例如，[1,3,5,7,9]、[7,7,7,7] 和 [3,-1,-5,-9] 都是等差数列。
 * 给你一个整数数组 nums ，返回数组 nums 中所有为等差数组的 子数组 个数。
 *
 * 子数组 是数组中的一个连续序列。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,4]
 * 输出：3
 * 解释：nums 中有三个子等差数组：[1, 2, 3]、[2, 3, 4] 和 [1,2,3,4] 自身。
 *
 * 示例 2：
 * 输入：nums = [1]
 * 输出：0
 *
 * 提示：
 * 1 <= nums.length <= 5000
 * -1000 <= nums[i] <= 1000
 */
public class ArithmeticSlices {
    /**
     * 方法一：动态规划
     * @param nums
     * @return
     */
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        //小于3不构成等差数列
        if (n < 3)
            return 0;
        //以nums[i]为结尾的等差数列个数
        int[] dp = new int[n];
        //数列个数
        int res = 0;
        int diff = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == diff){
                //如果当前数字和前面的可以构成等差数列，
                //就更新dp和count的值
                dp[i] = dp[i-1] + 1;
                res += dp[i];
            }else {
                //如果不能和前面的构成等差数列，要重新计算diff
                diff = nums[i] - nums[i - 1];
            }
        }
        return  res;
    }
}
