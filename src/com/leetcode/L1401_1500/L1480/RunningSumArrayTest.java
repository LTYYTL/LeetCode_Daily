package com.leetcode.L1401_1500.L1480;

import java.util.Arrays;

public class RunningSumArrayTest {
    public static void main(String[] args) {
        RunningSumArray runningSumArray = new RunningSumArray();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3,4]
         * 输出：[1,3,6,10]
         * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
         */
        System.out.println(Arrays.toString(runningSumArray.runningSum(new int[]{1, 2, 3, 4})));
        /**
         * 示例 2：
         * 输入：nums = [1,1,1,1,1]
         * 输出：[1,2,3,4,5]
         * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
         */
        System.out.println(Arrays.toString(runningSumArray.runningSum(new int[]{1, 1, 1, 1, 1})));
        /**
         * 示例 3：
         * 输入：nums = [3,1,2,10,1]
         * 输出：[3,4,6,16,17]
         */
        System.out.println(Arrays.toString(runningSumArray.runningSum(new int[]{3, 1, 2, 10, 1})));
    }
}
