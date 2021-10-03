package com.leetcode.L501_600.L0518;

public class CoinChange2Test {
    public static void main(String[] args) {
        CoinChange2 coinChange2 = new CoinChange2();
        /** * 示例 1:
         * 输入: amount = 5, coins = [1, 2, 5]
         * 输出: 4
         * 解释: 有四种方式可以凑成总金额:
         * 5=5
         * 5=2+2+1
         * 5=2+1+1+1
         * 5=1+1+1+1+1
         */
        System.out.println(coinChange2.change(5, new int[]{1, 2, 5}));
        /**
         * 示例 2:
         * 输入: amount = 3, coins = [2]
         * 输出: 0
         * 解释: 只用面额2的硬币不能凑成总金额3。
         */
        System.out.println(coinChange2.change(3, new int[]{2}));
        /**
         * 示例 3:
         * 输入: amount = 10, coins = [10]
         * 输出: 1
         */
        System.out.println(coinChange2.change(10, new int[]{10}));
    }
}
