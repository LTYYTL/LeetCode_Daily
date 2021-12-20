package com.leetcode.L101_200.L0122;

public class StockIITest {
    public static void main(String[] args) {
        StockII stockII = new StockII();
        /** * 示例 3:
         * 输入: [7,6,4,3,1]
         * 输出: 0
         * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
         */
        int[] prices = {7,1,5,3,6,4};
        System.out.println(stockII.maxProfit(prices));
        System.out.println(stockII.maxProfit_dp(prices));
    }
}
