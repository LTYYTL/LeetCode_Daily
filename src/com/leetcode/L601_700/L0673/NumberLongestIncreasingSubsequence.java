package com.leetcode.L601_700.L0673;

import java.util.Arrays;

/**
 * 673. 最长递增子序列的个数
 * 给定一个未排序的整数数组，找到最长递增子序列的个数。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,4,7]
 * 输出: 2
 * 解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
 * 示例 2:
 *
 * 输入: [2,2,2,2,2]
 * 输出: 5
 * 解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
 * 注意: 给定的数组长度不超过 2000 并且结果一定是32位有符号整数。
 */
public class NumberLongestIncreasingSubsequence {
    /**
     * 方法：动态规划
     * @param nums
     * @return
     */
    public int findNumberOfLIS(int[] nums) {
        //特殊情况
        if (nums.length <= 1)
            return nums.length;
        //以i-1结尾的子序列的长度
        int[] dp = new int[nums.length];
        //最小为1
        Arrays.fill(dp,1);
        //以i-1为结尾的子序列的个数
        int[] count = new int[nums.length];
        //最少为1
        Arrays.fill(count,1);
        //最大长度
        int max = 0;
        //遍历
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                //当nums[i] > nums[j]时
                if (nums[i] > nums[j]){
                    //以j结尾
                    if (dp[j]+1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    }else if (dp[j] + 1 == dp[i]){
                        count[i] += count[j];
                    }
                }
                //改变最大长度
                if (dp[i] > max)
                    max = dp[i];
            }
        }
        //结果
        int res = 0;
        //遍历
        for (int i = 0; i < count.length; i++) {
            //最大长度
            if (dp[i] == max)
                res += count[i];
        }

        return res;
    }
}
