package com.offerII.L088;

public class MinCostClimbingStairsTest {
    public static void main(String[] args) {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        /*
          示例 1：
          输入：cost = [10, 15, 20]
          输出：15
          解释：最低花费是从 cost[1] 开始，然后走两步即可到阶梯顶，一共花费 15 。
         */
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        /*
          示例 2：
          输入：cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
          输出：6
          解释：最低花费方式是从 cost[0] 开始，逐个经过那些 1 ，跳过 cost[3] ，一共花费 6 。
         */
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
