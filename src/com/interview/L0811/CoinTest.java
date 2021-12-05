package com.interview.L0811;

public class CoinTest {
    public static void main(String[] args) {
        Coin coin = new Coin();
        /**
         * 示例1:
         *  输入: n = 5
         *  输出：2
         *  解释: 有两种方式可以凑成总金额:
         * 5=5
         * 5=1+1+1+1+1
         */
        System.out.println(coin.waysToChange(5));
        /**
         * 示例2:
         *  输入: n = 10
         *  输出：4
         *  解释: 有四种方式可以凑成总金额:
         * 10=10
         * 10=5+5
         * 10=5+1+1+1+1+1
         * 10=1+1+1+1+1+1+1+1+1+1
         */
        System.out.println(coin.waysToChange(10));
    }
}
