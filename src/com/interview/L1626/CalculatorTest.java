package com.interview.L1626;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        /**
         * 示例 1:
         * 输入: "3+2*2"
         * 输出: 7
         */
        System.out.println(calculator.calculate("3+2*2"));
        /**
         * 示例 2:
         * 输入: " 3/2 "
         * 输出: 1
         */
        System.out.println(calculator.calculate("3/2"));
        /**
         * 示例 3:
         * 输入: " 3+5 / 2 "
         * 输出: 5
         */
        System.out.println(calculator.calculate(" 3+5 / 2 "));
    }
}
