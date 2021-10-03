package com.leetcode.L601_700.L0643;

/**
 * 643. 子数组最大平均数 I
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 *
 * 示例：
 * 输入：[1,12,-5,-6,50,3], k = 4
 * 输出：12.75
 * 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 *
 * 提示：
 * 1 <= k <= n <= 30,000。
 * 所给数据范围 [-10,000，10,000]。
 */
public class MaximumAverageSubarrayI {
    /**
     * 方法：双指针
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        //计算和
        double sum = 0;
        //计算前k项的和
        for (int i = 0; i < k; ++i){
            sum += nums[i];
        }
        //计算平均数
        double average = sum/k;
        //双指针
        int i = 0;
        int j = k;
        while (j < nums.length){
            //和减去前一项，加上后一项
            sum = sum + nums[j] - nums[i];
            i++;
            j++;
            //最大平均数
            average = Math.max(sum/k,average);
        }
        return average;
    }
}
