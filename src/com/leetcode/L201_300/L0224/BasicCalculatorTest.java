package com.leetcode.L201_300.L0224;

public class BasicCalculatorTest {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        /**
         * 示例 1：
         * 输入：s = "1 + 1"
         * 输出：2
         */
        System.out.println(basicCalculator.calculate("1 + 1"));
        /**
         * 示例 2：
         * 输入：s = " 2-1 + 2 "
         * 输出：3
         */
        System.out.println(basicCalculator.calculate(" 2-1 + 2 "));
        /**
         * 示例 3：
         * 输入：s = "(1+(4+5+2)-3)+(6+8)"
         * 输出：23
         */
        System.out.println(basicCalculator.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}
