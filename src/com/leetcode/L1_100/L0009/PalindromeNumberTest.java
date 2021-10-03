package com.leetcode.L1_100.L0009;

public class PalindromeNumberTest {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        /**
         * 示例 1：
         * 输入：x = 121
         * 输出：true
         */
        System.out.println(palindromeNumber.isPalindrome(121));
        /**
         * 示例 2：
         * 输入：x = -121
         * 输出：false
         * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
         */
        System.out.println(palindromeNumber.isPalindrome(-121));
        /**
         * 示例 3：
         * 输入：x = 10
         * 输出：false
         * 解释：从右向左读, 为 01 。因此它不是一个回文数。
         */
        System.out.println(palindromeNumber.isPalindrome(10));
        /**
         * 示例 4：
         * 输入：x = -101
         * 输出：false
         */
        System.out.println(palindromeNumber.isPalindrome(-101));
    }
}
