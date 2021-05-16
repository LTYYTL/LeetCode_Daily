package com.leetcode.L0300;

/**
 * 300. 最长递增子序列
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 * 示例:
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 *
 * 说明:
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。
 * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 */
public class LongestAscSequence {
    /**
     * 方法：动态规划
     *
     * 1、如果nums[i]比前面的所有元素都小，那么dp[i]等于1（即它本身）（该结论正确）
     * 2、如果nums[i]前面存在比他小的元素nums[j]，那么dp[i]就等于dp[j]+1（该结论错误，比如nums[3]>nums[0]，即9>1,但是dp[3]并不等于dp[0]+1）
     * dp[i] = max(dp[j]+1，dp[k]+1，dp[p]+1，.....)
     * 注：并未强调必须是连续的
     *
     * @param nums  数组
     * @return  最长子序的长度
     */
    public int lengthOfLIS(int[] nums) {
        //数组为空的情况
        if(nums.length == 0)
            return 0;
        //动态数组
        int[] dp = new int[nums.length];
        dp[0] = 1;
        //最长的长度
        int longest = 1;
        for (int i = 1; i < dp.length; i++){
            //临时变量
            int temp = 0;
            //比较当前元素比前面元素大的最大长度
            for (int j = 0;j < i; j++){
                if (nums[i] > nums[j]){
                    temp = Math.max(temp , dp[j]);
                }
            }
            //最大值加本身
            dp[i] = temp + 1;
            longest = Math.max(longest , dp[i]);
        }
        return  longest;
    }
}
