package com.leetcode.L101_200.L0152;

/**
 * 152. 乘积最大子数组
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 *
 * 示例 1:
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 *
 * 示例 2:
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 */
public class MaxProductSub {
    /**
     * 方法：动态规划
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        //最大值
        int max = Integer.MIN_VALUE;
        //当前最大值
        int imax = 1;
        //当前最小值
        int imin = 1;
        //遍历
        for (int num : nums) {
            //是负数需要反转最小与最大值
            if (num < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            //当前的最大值
            imax = Math.max(imax * num, num);
            //当前最小值
            imin = Math.min(imin * num, num);
            //获取最大值
            max = Math.max(max, imax);
        }

        return max;
    }
}
