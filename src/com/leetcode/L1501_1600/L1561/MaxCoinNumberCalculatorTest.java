package com.leetcode.L1501_1600.L1561;

public class MaxCoinNumberCalculatorTest {
    public static void main(String[] args) {
        MaxCoinNumberCalculator maxCoinNumberCalculator = new MaxCoinNumberCalculator();
        /*
         * 示例 1：
         * 输入：piles = [2,4,1,2,7,8]
         * 输出：9
         * 解释：选出 (2, 7, 8) ，Alice 取走 8 枚硬币的那堆，你取走 7 枚硬币的那堆，Bob 取走最后一堆。
         * 选出 (1, 2, 4) , Alice 取走 4 枚硬币的那堆，你取走 2 枚硬币的那堆，Bob 取走最后一堆。
         * 你可以获得的最大硬币数目：7 + 2 = 9.
         * 考虑另外一种情况，如果选出的是 (1, 2, 8) 和 (2, 4, 7) ，你就只能得到 2 + 4 = 6 枚硬币，这不是最优解。
         */
        System.out.println(maxCoinNumberCalculator.maxCoins(new int[]{2, 4, 1, 2, 7, 8}));
        /*
         * 示例 2：
         * 输入：piles = [2,4,5]
         * 输出：4
         */
        System.out.println(maxCoinNumberCalculator.maxCoins(new int[]{2, 4, 5}));
        /*
         * 示例 3：
         * 输入：piles = [9,8,7,6,5,1,2,3,4]
         * 输出：18
         */
        System.out.println(maxCoinNumberCalculator.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}));
    }
}
