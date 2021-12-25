package com.leetcode.L501_600.L0507;

public class PerfectNumberTest {
    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        /**
         * 示例 1：
         * 输入：num = 28
         * 输出：true
         * 解释：28 = 1 + 2 + 4 + 7 + 14
         * 1, 2, 4, 7, 和 14 是 28 的所有正因子。
         */
        System.out.println(perfectNumber.checkPerfectNumber(28));
        /**
         * 示例 2：
         * 输入：num = 6
         * 输出：true
         */
        System.out.println(perfectNumber.checkPerfectNumber(6));
        /**
         * 示例 3：
         * 输入：num = 496
         * 输出：true
         */
        System.out.println(perfectNumber.checkPerfectNumber(496));
        /**
         * 示例 4：
         * 输入：num = 8128
         * 输出：true
         */
        System.out.println(perfectNumber.checkPerfectNumber(8128));
        /**
         * 示例 5：
         * 输入：num = 2
         * 输出：false
         */
        System.out.println(perfectNumber.checkPerfectNumber(2));
    }
}
