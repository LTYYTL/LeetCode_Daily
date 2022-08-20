package com.leetcode.L1_100.L0005;

public class LongestPalindromicSubstringTest {
    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        /*
          示例 1：
          输入：s = "babad"
          输出："bab"
          解释："aba" 同样是符合题意的答案。
         */
        System.out.println(longestPalindromicSubstring.longestPalindrome("babad"));
        /*
          示例 2：
          输入：s = "cbbd"
          输出："bb"
         */
        System.out.println(longestPalindromicSubstring.longestPalindrome("cbbd"));
        /*
          示例 3：
          输入：s = "a"
          输出："a"
         */
        System.out.println(longestPalindromicSubstring.longestPalindrome("a"));
        /*
          示例 4：
          输入：s = "ac"
          输出："a"
         */
        System.out.println(longestPalindromicSubstring.longestPalindrome("ac"));
    }
}
