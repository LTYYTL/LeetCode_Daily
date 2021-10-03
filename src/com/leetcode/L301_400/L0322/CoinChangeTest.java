package com.leetcode.L301_400.L0322;

public class CoinChangeTest {
    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        /**
         * 示例 1：
         * 输入：coins = [1, 2, 5], amount = 11
         * 输出：3
         * 解释：11 = 5 + 5 + 1
         */
        System.out.println(coinChange.coinChange(new int[]{1, 2, 5}, 11));
        /**
         * 示例 2：
         * 输入：coins = [2], amount = 3
         * 输出：-1
         */
        System.out.println(coinChange.coinChange(new int[]{2}, 3));
    }
}
