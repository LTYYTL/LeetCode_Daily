package com.leetcode.L701_800.L0714;

/**
 * 714. 买卖股票的最佳时机含手续费
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
 * 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 * 返回获得利润的最大值。
 *
 * 注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
 *
 * 示例 1:
 * 输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
 * 输出: 8
 * 解释: 能够达到的最大利润:
 * 在此处买入 prices[0] = 1
 * 在此处卖出 prices[3] = 8
 * 在此处买入 prices[4] = 4
 * 在此处卖出 prices[5] = 9
 * 总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 *
 * 注意:
 * 0 < prices.length <= 50000.
 * 0 < prices[i] < 50000.
 * 0 <= fee < 50000.
 */
public class StockWithFee {
    /**
     * 方法：动态规划
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit(int[] prices, int fee) {
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
                dp[i][1] = -prices[i] - fee;
                continue;
            }
            //第i天没有持有：（1）前一天就没持有 （2）前一天持有，这天卖掉
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //第i天持有：（1）前一天就持有 （2）前一天没持有，这天买入
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i] - fee);
        }
        //最后一天没持有
        return dp[n-1][0];
    }
}
