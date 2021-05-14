package com.leetcode.L0012;

public class IntegerRomanTest {
    public static void main(String[] args) {
        IntegerRoman integerRoman = new IntegerRoman();
        /**
         * 示例 1:
         * 输入: num = 3
         * 输出: "III"
         */
        System.out.println(integerRoman.intToRoman(3));
        /**
         * 示例 2:
         * 输入: num = 4
         * 输出: "IV"
         */
        System.out.println(integerRoman.intToRoman(4));
        /**
         * 示例 3:
         * 输入: num = 9
         * 输出: "IX"
         */
        System.out.println(integerRoman.intToRoman(9));
        /**
         * 示例 4:
         * 输入: num = 58
         * 输出: "LVIII"
         * 解释: L = 50, V = 5, III = 3.
         */
        System.out.println(integerRoman.intToRoman(58));
        /**
         * 示例 5:
         * 输入: num = 1994
         * 输出: "MCMXCIV"
         * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
         */
        System.out.println(integerRoman.intToRoman(1994));
    }
}
