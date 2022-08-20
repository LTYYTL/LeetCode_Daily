package com.offerII.L018;

public class ValidPalindromeTest {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        /*
          示例 1:
          输入: s = "A man, a plan, a canal: Panama"
          输出: true
          解释："amanaplanacanalpanama" 是回文串
         */
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        /*
          示例 2:
          输入: s = "race a car"
          输出: false
          解释："raceacar" 不是回文串
         */
        System.out.println(validPalindrome.isPalindrome("race a car"));
    }
}
