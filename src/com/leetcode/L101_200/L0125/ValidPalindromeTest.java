package com.leetcode.L101_200.L0125;


public class ValidPalindromeTest {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        /**
         * 示例 1:
         * 输入: "A man, a plan, a canal: Panama"
         * 输出: true
         */
        //方法一：双指针 + 正则表达式
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        //方法二：双指针
        System.out.println(validPalindrome.isPalindrome_none("A man, a plan, a canal: Panama"));
        /**
         * 示例 2:
         * 输入: "race a car"
         * 输出: false
         */
        //方法一：双指针 + 正则表达式
        System.out.println(validPalindrome.isPalindrome("race a car"));
        //方法二：双指针
        System.out.println(validPalindrome.isPalindrome_none("race a car"));
    }
}
