package com.leetcode.L301_400.L0357;

public class CountUniqueDigitsTest {
    public static void main(String[] args) {
        CountUniqueDigits countUniqueDigits = new CountUniqueDigits();
        /**
         * 示例 1：
         * 输入：n = 2
         * 输出：91
         * 解释：答案应为除去 11、22、33、44、55、66、77、88、99 外，在 0 ≤ x < 100 范围内的所有数字。
         */
        System.out.println(countUniqueDigits.countNumbersWithUniqueDigits(2));
        /**
         * 示例 2：
         * 输入：n = 0
         * 输出：1
         */
        System.out.println(countUniqueDigits.countNumbersWithUniqueDigits(0));
    }
}
