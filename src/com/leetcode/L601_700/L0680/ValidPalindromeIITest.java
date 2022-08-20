package com.leetcode.L601_700.L0680;

public class ValidPalindromeIITest {
    public static void main(String[] args) {
        ValidPalindromeII validPalindromeII = new ValidPalindromeII();
        /*
          示例 1:
          输入: s = "aba"
          输出: true
         */
        System.out.println(validPalindromeII.validPalindrome("aba"));
        /*
          示例 2:
          输入: s = "abca"
          输出: true
          解释: 你可以删除c字符。
         */
        System.out.println(validPalindromeII.validPalindrome("abca"));
        /*
          示例 3:
          输入: s = "abc"
          输出: false
         */
        System.out.println(validPalindromeII.validPalindrome("abc"));
    }
}
