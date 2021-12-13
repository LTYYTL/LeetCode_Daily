package com.leetcode.L601_700.L0689;

/**
 * 689. 三个无重叠子数组的最大和
 * 给你一个整数数组 nums 和一个整数 k ，找出三个长度为 k 、互不重叠、且全部数字和（3 * k 项）最大的子数组，并返回这三个子数组。
 * 以下标的数组形式返回结果，数组中的每一项分别指示每个子数组的起始位置（下标从 0 开始）。如果有多个结果，返回字典序最小的一个。
 *
 * 示例 1：
 * 输入：nums = [1,2,1,2,6,7,5,1], k = 2
 * 输出：[0,3,5]
 * 解释：子数组 [1, 2], [2, 6], [7, 5] 对应的起始下标为 [0, 3, 5]。
 * 也可以取 [2, 1], 但是结果 [1, 3, 5] 在字典序上更大。
 *
 * 示例 2：
 * 输入：nums = [1,2,1,2,1,2,1,2,1], k = 2
 * 输出：[0,2,4]
 */
public class MaxSum3NonOverSub {
    /**
     * 方法：滑动窗口
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        //结果集
        int[] res = new int[3];
        //第一个滑动窗口参数
        int sum1 = 0, maxSum1 = 0, maxSumIndex1 = 0;
        //第二个滑动窗口参数
        int sum2 = 0, maxSum2 = 0, maxSum2Index1 = 0, maxSum2Index2 = 0;
        //第三个滑动窗口参数
        int sum3 = 0, maxTotal = 0;
        //遍历，以第三个滑动窗口为基准
        for (int i = k*2; i < nums.length; i++) {
            //计算第一个滑动窗口内的总值
            sum1 += nums[i-k*2];
            //计算第二个滑动窗口内的总值
            sum2 += nums[i-k];
            //计算第三个滑动窗口内的总值
            sum3 += nums[i];
            //滑动窗口
            if (i >= k*3-1){
                //第一个窗口的和大于第一个窗口的最大和
                if (sum1 > maxSum1) {
                    maxSum1 = sum1;
                    maxSumIndex1 = i - k*3 + 1;
                }
                //前两个窗口的和
                if (maxSum1 + sum2 > maxSum2){
                    maxSum2 = maxSum1 + sum2;
                    maxSum2Index1 = maxSumIndex1;
                    maxSum2Index2 = i - k*2 + 1;
                }
                //前三个窗口的和
                if (maxSum2 + sum3 > maxTotal) {
                    maxTotal = maxSum2 + sum3;
                    res[0] = maxSum2Index1;
                    res[1] = maxSum2Index2;
                    res[2] = i - k + 1;
                }
                //窗口收缩
                sum1 -= nums[i - k * 3 + 1];
                sum2 -= nums[i - k * 2 + 1];
                sum3 -= nums[i - k + 1];

            }
        }
        return res;
    }
}
