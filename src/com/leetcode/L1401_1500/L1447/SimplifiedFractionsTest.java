package com.leetcode.L1401_1500.L1447;

public class SimplifiedFractionsTest {
    public static void main(String[] args) {
        SimplifiedFractions simplifiedFractions = new SimplifiedFractions();
        /**
         * 示例 1：
         * 输入：n = 2
         * 输出：["1/2"]
         * 解释："1/2" 是唯一一个分母小于等于 2 的最简分数。
         */
        System.out.println(simplifiedFractions.simplifiedFractions(2));
        /**
         * 示例 2：
         * 输入：n = 3
         * 输出：["1/2","1/3","2/3"]
         */
        System.out.println(simplifiedFractions.simplifiedFractions(3));
        /**
         * 示例 3：
         * 输入：n = 4
         * 输出：["1/2","1/3","1/4","2/3","3/4"]
         * 解释："2/4" 不是最简分数，因为它可以化简为 "1/2" 。
         */
        System.out.println(simplifiedFractions.simplifiedFractions(4));
        /**
         * 示例 4：
         * 输入：n = 1
         * 输出：[]
         */
        System.out.println(simplifiedFractions.simplifiedFractions(1));
    }
}
