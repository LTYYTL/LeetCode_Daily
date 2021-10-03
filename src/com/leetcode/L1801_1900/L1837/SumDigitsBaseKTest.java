package com.leetcode.L1801_1900.L1837;

public class SumDigitsBaseKTest {
    public static void main(String[] args) {
        SumDigitsBaseK sumDigitsBaseK = new SumDigitsBaseK();
        /**
         * 示例 1：
         * 输入：n = 34, k = 6
         * 输出：9
         * 解释：34 (10 进制) 在 6 进制下表示为 54 。5 + 4 = 9 。
         */
        System.out.println(sumDigitsBaseK.sumBase(34, 6));
        /**
         * 示例 2：
         * 输入：n = 10, k = 10
         * 输出：1
         * 解释：n 本身就是 10 进制。 1 + 0 = 1 。
         */
        System.out.println(sumDigitsBaseK.sumBase(10, 10));
    }
}
