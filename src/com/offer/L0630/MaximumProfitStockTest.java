package com.offer.L0630;

public class MaximumProfitStockTest {
    public static void main(String[] args) {
        MaximumProfitStock maximumProfitStock = new MaximumProfitStock();
        /*
          示例 1:
          输入: [7,1,5,3,6,4]
          输出: 5
          解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
               注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
         */
        System.out.println(maximumProfitStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        /*
          示例 2:
          输入: [7,6,4,3,1]
          输出: 0
          解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
         */
        System.out.println(maximumProfitStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
