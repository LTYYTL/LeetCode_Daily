package com.leetcode.L101_200.L0188;

/**
 * 188. 买卖股票的最佳时机 IV
 * 给定一个整数数组 prices ，它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 示例 1：
 * 输入：k = 2, prices = [2,4,1]
 * 输出：2
 * 解释：在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
 *
 * 示例 2：
 * 输入：k = 2, prices = [3,2,6,5,0,3]
 * 输出：7
 * 解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
 *      随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。
 *
 * 提示：
 * 0 <= k <= 100
 * 0 <= prices.length <= 1000
 * 0 <= prices[i] <= 1000
 */
public class StockIV {
    /**
     * 方法：动态规划
     * @param prices
     * @return
     */
    public int maxProfit(int k, int[] prices) {
        //长度
        int n = prices.length;
        //空值情况
        if (n <= 0)
            return 0;
        //交易次数
        if (k > n /2){
            return maxProfit(prices);
        }
        //dp[i][0]:表示第i天不持有股票
        //dp[i][1]:表示第i天持有股票
        int[][][] dp = new int[n][k+1][2];
        //遍历
        for (int i = 0; i < n; i++) {
            for (int j = k; j >= 1; j--) {
                //i == 0的情况
                if (i - 1 == -1){
                    //不持有
                    dp[i][j][0] = 0;
                    //第0天买进,交易了j次
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                //第i天没有持有：（1）前一天就没持有 （2）前一天持有，这天卖掉
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1] + prices[i]);
                //第i天持有：（1）前一天就持有 （2）前一天没持有，这天买入
                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0] - prices[i]);
            }

        }
        //最后一天没持有
        return dp[n-1][k][0];
    }

    private int maxProfit(int[] prices) {
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
            //第i天没有持有：（1）前一天就没持有 （2）前一天持有，这天卖掉
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //第i天持有：（1）前一天就持有 （2）前一天没持有，这天买入
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);
        }
        //最后一天没持有
        return dp[n-1][0];
    }
}
