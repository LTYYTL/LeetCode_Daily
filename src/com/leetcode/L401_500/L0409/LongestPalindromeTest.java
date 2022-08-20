package com.leetcode.L401_500.L0409;

public class LongestPalindromeTest {
    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        /*
          示例 1:
          输入:s = "abccccdd"
          输出:7
          解释:
          我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
         */
        System.out.println(longestPalindrome.longestPalindrome("abccccdd"));
        /*
          示例 2:
          输入:s = "a"
          输入:1
         */
        System.out.println(longestPalindrome.longestPalindrome("a"));
        /*
          示例 3:
          输入:s = "bb"
          输入: 2
         */
        System.out.println(longestPalindrome.longestPalindrome("bb"));
    }
}
