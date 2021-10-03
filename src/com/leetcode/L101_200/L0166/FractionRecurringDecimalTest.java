package com.leetcode.L101_200.L0166;

public class FractionRecurringDecimalTest {
    public static void main(String[] args) {
        FractionRecurringDecimal fractionRecurringDecimal = new FractionRecurringDecimal();
        /**
         * 示例 1：
         * 输入：numerator = 1, denominator = 2
         * 输出："0.5"
         */
        System.out.println(fractionRecurringDecimal.fractionToDecimal(1, 2));
        /**
         * 示例 2：
         * 输入：numerator = 2, denominator = 1
         * 输出："2"
         */
        System.out.println(fractionRecurringDecimal.fractionToDecimal(2, 1));
        /**
         * 示例 3：
         * 输入：numerator = 2, denominator = 3
         * 输出："0.(6)"
         */
        System.out.println(fractionRecurringDecimal.fractionToDecimal(2, 3));
        /**
         * 示例 4：
         * 输入：numerator = 4, denominator = 333
         * 输出："0.(012)"
         */
        System.out.println(fractionRecurringDecimal.fractionToDecimal(4, 333));
        /**
         * 示例 5：
         * 输入：numerator = 1, denominator = 5
         * 输出："0.2"
         */
        System.out.println(fractionRecurringDecimal.fractionToDecimal(1, 5));
    }
}
