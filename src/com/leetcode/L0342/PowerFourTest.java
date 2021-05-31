package com.leetcode.L0342;

public class PowerFourTest {
    public static void main(String[] args) {
        PowerFour powerFour = new PowerFour();
        /**
         * 示例 1：
         * 输入：n = 16
         * 输出：true
         */
        System.out.println(powerFour.isPowerOfFour(16));
        System.out.println(powerFour.isPowerOfFour_math(16));
        /**
         * 示例 2：
         * 输入：n = 5
         * 输出：false
         */
        System.out.println(powerFour.isPowerOfFour(5));
        System.out.println(powerFour.isPowerOfFour_math(5));
        /**
         * 示例 3：
         * 输入：n = 1
         * 输出：true
         */
        System.out.println(powerFour.isPowerOfFour(1));
        System.out.println(powerFour.isPowerOfFour_math(1));
    }
}
