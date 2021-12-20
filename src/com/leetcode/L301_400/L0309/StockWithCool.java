package com.leetcode.L301_400.L0309;

/**
 * 309. 最佳买卖股票时机含冷冻期
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 *
 * 示例:
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 */
public class StockWithCool {
    /**
     * 方法：动态规划
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        //长度
        int n = prices.length;
        //dp[i][0]:表示第i天不持有股票
        //dp[i][1]:表示第i天持有股票
        int[][] dp = new int[n][2];
        //遍历
        for (int i = 0; i < n; i++) {
            //i == 0的情况
            if (i - 1 == -1){
                //不持有
                dp[i][0] = 0;
                //第0天买进
                dp[i][1] = -prices[i];
                continue;
            }
            if (i - 2 == -1){
                dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i-1][1],-prices[i]);
                continue;
            }
            //第i天没有持有：（1）前一天就没持有 （2）前一天持有，这天卖掉
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //第i天持有：（1）前一天就持有 （2）前一天没持有，这天买入
            dp[i][1] = Math.max(dp[i-1][1],dp[i-2][0] - prices[i]);
        }
        //最后一天没持有
        return dp[n-1][0];
    }
}
