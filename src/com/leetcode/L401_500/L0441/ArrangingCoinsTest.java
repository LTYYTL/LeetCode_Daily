package com.leetcode.L401_500.L0441;

public class ArrangingCoinsTest {
    public static void main(String[] args) {
        ArrangingCoins arrangingCoins = new ArrangingCoins();
        /*
          示例 1：
          输入：n = 5
          输出：2
          解释：因为第三行不完整，所以返回 2 。
         */
        System.out.println(arrangingCoins.arrangeCoins(5));
        /*
          示例 2：
          输入：n = 8
          输出：3
          解释：因为第四行不完整，所以返回 3 。
         */
        System.out.println(arrangingCoins.arrangeCoins(8));
    }
}
