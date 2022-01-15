package com.leetcode.L1701_1800.L1716;

public class CalculateMoneyTest {
    public static void main(String[] args) {
        CalculateMoney calculateMoney = new CalculateMoney();
        /**
         * 示例 1：
         * 输入：n = 4
         * 输出：10
         * 解释：第 4 天后，总额为 1 + 2 + 3 + 4 = 10 。
         */
        System.out.println(calculateMoney.totalMoney(4));
        /**
         * 示例 2：
         * 输入：n = 10
         * 输出：37
         * 解释：第 10 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37 。注意到第二个星期一，Hercy 存入 2 块钱。
         */
        System.out.println(calculateMoney.totalMoney(10));
        /**
         * 示例 3：
         * 输入：n = 20
         * 输出：96
         * 解释：第 20 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96 。
         */
        System.out.println(calculateMoney.totalMoney(20));
    }
}
