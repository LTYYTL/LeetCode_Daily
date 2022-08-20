package com.offerII.L020;

public class PalindromicSubstringsTest {
    public static void main(String[] args) {
        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
        /*
          示例 1：
          输入：s = "abc"
          输出：3
          解释：三个回文子串: "a", "b", "c"
         */
        System.out.println(palindromicSubstrings.countSubstrings("abc"));
        /*
          示例 2：
          输入：s = "aaa"
          输出：6
          解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
         */
        System.out.println(palindromicSubstrings.countSubstrings("aaa"));
    }
}
