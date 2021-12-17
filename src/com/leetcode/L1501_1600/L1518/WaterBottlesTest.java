package com.leetcode.L1501_1600.L1518;

public class WaterBottlesTest {
    public static void main(String[] args) {
        WaterBottles waterBottles = new WaterBottles();
        /**
         * 示例 1：
         * 输入：numBottles = 9, numExchange = 3
         * 输出：13
         * 解释：你可以用 3 个空酒瓶兑换 1 瓶酒。
         * 所以最多能喝到 9 + 3 + 1 = 13 瓶酒。
         */
        System.out.println(waterBottles.numWaterBottles(9, 3));
        /**
         * 示例 2：
         * 输入：numBottles = 15, numExchange = 4
         * 输出：19
         * 解释：你可以用 4 个空酒瓶兑换 1 瓶酒。
         * 所以最多能喝到 15 + 3 + 1 = 19 瓶酒。
         */
        System.out.println(waterBottles.numWaterBottles(15, 4));
        /**
         * 示例 3：
         * 输入：numBottles = 5, numExchange = 5
         * 输出：6
         */
        System.out.println(waterBottles.numWaterBottles(5, 5));
        /**
         * 示例 4：
         * 输入：numBottles = 2, numExchange = 3
         * 输出：2
         */
        System.out.println(waterBottles.numWaterBottles(2, 3));
    }
}
