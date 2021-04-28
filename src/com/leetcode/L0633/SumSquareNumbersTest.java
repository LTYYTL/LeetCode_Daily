package com.leetcode.L0633;

public class SumSquareNumbersTest {
    public static void main(String[] args) {
        SumSquareNumbers sumSquareNumbers = new SumSquareNumbers();
        /** * 示例 1：
         * 输入：c = 5
         * 输出：true
         * 解释：1 * 1 + 2 * 2 = 5
         */
        System.out.println(sumSquareNumbers.judgeSquareSum(5));
        /**
         * 示例 2：
         * 输入：c = 3
         * 输出：false
         */
        System.out.println(sumSquareNumbers.judgeSquareSum(3));
        /**
         * 示例 3：
         * 输入：c = 4
         * 输出：true
         */
        System.out.println(sumSquareNumbers.judgeSquareSum(4));
        /**
         * 示例 4：
         * 输入：c = 2
         * 输出：true
         */
        System.out.println(sumSquareNumbers.judgeSquareSum(2));
        /**
         * 示例 5：
         * 输入：c = 1
         * 输出：true
         */
        System.out.println(sumSquareNumbers.judgeSquareSum(1));
    }
}
