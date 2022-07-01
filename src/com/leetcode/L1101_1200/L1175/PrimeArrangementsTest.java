package com.leetcode.L1101_1200.L1175;

public class PrimeArrangementsTest {
    public static void main(String[] args) {
        PrimeArrangements primeArrangements = new PrimeArrangements();
        /**
         * 示例 1：
         * 输入：n = 5
         * 输出：12
         * 解释：举个例子，[1,2,5,4,3] 是一个有效的排列，但 [5,2,3,4,1] 不是，因为在第二种情况里质数 5 被错误地放在索引为 1 的位置上。
         */
        System.out.println(primeArrangements.numPrimeArrangements(5));
        /**
         * 示例 2：
         * 输入：n = 100
         * 输出：682289015
         */
        System.out.println(primeArrangements.numPrimeArrangements(100));
    }
}
