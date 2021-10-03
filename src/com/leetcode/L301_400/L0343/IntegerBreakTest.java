package com.leetcode.L301_400.L0343;

public class IntegerBreakTest {
    public static void main(String[] args) {
        IntegerBreak integerBreak = new IntegerBreak();
        /**
         * 示例 1:
         * 输入: 2
         * 输出: 1
         * 解释: 2 = 1 + 1, 1 × 1 = 1。
         */
        System.out.println(integerBreak.integerBreak(2));
        /**
         * 示例 2:
         * 输入: 10
         * 输出: 36
         * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
         * 说明: 你可以假设 n 不小于 2 且不大于 58。
         */
        System.out.println(integerBreak.integerBreak(10));
    }
}
