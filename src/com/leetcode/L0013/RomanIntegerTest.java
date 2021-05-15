package com.leetcode.L0013;

public class RomanIntegerTest {
    public static void main(String[] args) {
        RomanInteger romanInteger = new RomanInteger();
        /**
         * 示例 1:
         * 输入: "III"
         * 输出: 3
         */
        System.out.println(romanInteger.romanToInt("III"));
        /**
         * 示例 2:
         * 输入: "IV"
         * 输出: 4
         */
        System.out.println(romanInteger.romanToInt("IV"));
        /**
         * 示例 3:
         * 输入: "IX"
         * 输出: 9
         */
        System.out.println(romanInteger.romanToInt("IX"));
        /**
         * 示例 4:
         * 输入: "LVIII"
         * 输出: 58
         * 解释: L = 50, V= 5, III = 3.
         */
        System.out.println(romanInteger.romanToInt("LVIII"));
        /**
         * 示例 5:
         * 输入: "MCMXCIV"
         * 输出: 1994
         * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
         */
        System.out.println(romanInteger.romanToInt("MCMXCIV"));
    }
}
