package com.leetcode.L701_800.L0746;

public class MinCostClimbingStairsTest {
    public static void main(String[] args) {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        /**
         * 示例 1:
         * 输入: cost = [10, 15, 20]
         * 输出: 15
         * 解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
         */
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        /**
         * 示例 2:
         * 输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
         * 输出: 6
         * 解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
         */
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
