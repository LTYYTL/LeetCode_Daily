package com.leetcode.L1006;

public class ClumsyFactorialTest {
    public static void main(String[] args) {
        ClumsyFactorial clumsyFactorial = new ClumsyFactorial();
        /*** 示例 1：
         * 输入：4
         * 输出：7
         * 解释：7 = 4 * 3 / 2 + 1
         */
        System.out.println(clumsyFactorial.clumsy(4));
        /**
         * 示例 2：
         * 输入：10
         * 输出：12
         * 解释：12 = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1
         */
        System.out.println(clumsyFactorial.clumsy(10));
    }
}
