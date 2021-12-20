package com.leetcode.L301_400.L0309;

public class StockWithCoolTest {
    public static void main(String[] args) {
        StockWithCool stockWithCool = new StockWithCool();
        /** *
         * 示例:
         * 输入: [1,2,3,0,2]
         * 输出: 3
         * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
         */
        System.out.println(stockWithCool.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}
