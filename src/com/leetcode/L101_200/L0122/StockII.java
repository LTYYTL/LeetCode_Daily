package com.leetcode.L101_200.L0122;

/**
 * 122. 买卖股票的最佳时机 II
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 *
 * 示例 2:
 * 输入: [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 * 注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
 * 因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 *
 * 示例 3:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 提示：
 * 1 <= prices.length <= 3 * 10 ^ 4
 * 0 <= prices[i] <= 10 ^ 4
 */
public class StockII {
    /**
     * 方法：贪心算法
     * @param prices 股票价格数组
     * @return 最大收益
     */
    public int maxProfit(int[] prices) {
        //最大收益
       int max = 0;
       //遍历股票价格数组
       for (int i = 1; i < prices.length ; i++){
           //当今天价格比昨天价格高的时候，即是低买高出，获得收益
           //例：[1,2,3,4,5]
           //①prices[1]>prices[0](2>1),max = 1
           //②prices[2]>prices[1](3>2),max = 2
           //③prices[3]>prices[2](4>3),max = 3
           //④prices[4]>prices[3](5>4),max = 4
           //即：prices[4]-prices[0],max = 4(连续的增加可看作是最高与最低的差)
           //
           //例：[7,1,5,3,6,4]
           //①prices[1]<prices[0](1<7),max = 0
           //②prices[2]>prices[1](5>1),max = 5-1=4
           //③prices[3]<prices[2](5>3),max = 4
           //④prices[4]>prices[3](6>3),max = 7
           //④prices[5]<prices[4](6>4),max = 7
           if (prices[i]>prices[i-1]){
               //最大利益
               max += prices[i] - prices[i-1];
           }
       }
        return max;
    }

    /**
     * 方法二：动态规划
     * @param prices
     * @return
     */
    public int maxProfit_dp(int[] prices) {
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
