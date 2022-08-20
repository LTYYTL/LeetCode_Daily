package com.offer.L0420;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 *
 * 示例1:
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 提示：
 * 1 <= arr.length <= 10^5
 * -100 <= arr[i] <= 100
 * 注意：本题与主站 53 题相同：<a href="https://leetcode-cn.com/problems/maximum-subarray/">https://leetcode-cn.com/problems/maximum-subarray/</a>
 *
 *
 */
public class MaxSequenceSum {
    /**
     * 方法一：动态规划
     * 时间复杂度：O(N)。
     * 空间复杂度：O(N)
     * @param nums  整数数组
     * @return  最大和
     */
    public int maxSubArray(int[] nums) {
        //数组为空的情况
        if (nums.length == 0)
            return 0;
        //状态定义，dp[i]为以 nums[i] 结尾的连续子数组的最大和
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        //最大和
        int sum = dp[0];
        //遍历得出dp
        for (int i = 1; i < nums.length; i++){
            //dp[i]情况
            //1、没有加nums[i]时，dp[i-1]为负数，dp[i] = nums[i]
            //2、没有加nums[i]时，dp[i-1]为正数，dp[i] = dp[i-1]+nums[i]
            //即:状态方程为dp[i] = nums[i]和dp[i-1]中大的那个
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            //取出dp中最大和
            sum = Math.max(sum,dp[i]);
        }

        return sum;
    }

    /**
     * 方法二：动态规划 + 空间规划（原地修改）
     * 时间复杂度：O(N)。
     * 空间复杂度：O(1)
     *
     * 空间优化：一直往前走，不会回头所以直接修改nums[]，不用新开辟dp[]
     *
     * @param nums  整数数组
     * @return  最大和
     */
    public int maxSubArray_zeroStructure(int[] nums) {
        //数组为空的情况
        if (nums.length == 0)
            return 0;
        //状态定义，dp[i]为以 nums[i] 结尾的连续子数组的最大和
        //以nums[]代替dp[]
        //dp[0] = nums[0];
        //最大和
        int sum = nums[0];
        //遍历得出dp
        for (int i = 1; i < nums.length; i++){
            //dp[i]情况
            //1、没有加nums[i]时，dp[i-1]为负数，dp[i] = nums[i]
            //2、没有加nums[i]时，dp[i-1]为正数，dp[i] = dp[i-1]+nums[i]
            //即:状态方程为dp[i] = nums[i]和dp[i-1]中大的那个
            nums[i] = Math.max(nums[i], nums[i - 1] + nums[i]);
            //取出dp中最大和
            sum = Math.max(sum,nums[i]);
        }

        return sum;
    }
}
