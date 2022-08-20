package com.leetcode.L101_200.L0188;

public class StockIVTest {
    public static void main(String[] args) {
        StockIV stockIV = new StockIV();
        /*
          示例 1：
          输入：k = 2, prices = [2,4,1]
          输出：2
          解释：在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
         */
        System.out.println(stockIV.maxProfit(2, new int[]{2, 4, 1}));
        /*
          示例 2：
          输入：k = 2, prices = [3,2,6,5,0,3]
          输出：7
          解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
               随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。
         */
        System.out.println(stockIV.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }
}
