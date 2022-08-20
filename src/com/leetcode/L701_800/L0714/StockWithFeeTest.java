package com.leetcode.L701_800.L0714;

public class StockWithFeeTest {
    public static void main(String[] args) {
        StockWithFee stockWithFee = new StockWithFee();
        /*
          示例 1:
          输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
          输出: 8
         */
        System.out.println(stockWithFee.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }
}
