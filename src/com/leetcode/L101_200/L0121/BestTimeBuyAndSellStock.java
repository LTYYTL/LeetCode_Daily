package com.leetcode.L101_200.L0121;

/**
 * 121. 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * 示例 1：
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 *
 * 示例 2：
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 提示：
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */
public class BestTimeBuyAndSellStock {
    /**
     * 方法一：模拟
     */
    public int maxProfit(int[] prices) {
        //最大收益
        int max = 0;
        if (prices.length == 0)
            return max;
        //最小值
        int min = prices[0];
        //遍历
        for (int i = 1; i < prices.length; i++) {
            //当前与最小值的差值是否更大
            if (prices[i] - min > max){
                max = prices[i] - min;
            }else if (prices[i] < min){//判断当前值是否是最小值
                min = prices[i];
            }
        }
        return max;
    }

    /**
     * 方法二：动态规划
     */
    public int maxProfit_dp(int[] prices){
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
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);
        }
        //最后一天没持有
        return dp[n-1][0];
    }
}
