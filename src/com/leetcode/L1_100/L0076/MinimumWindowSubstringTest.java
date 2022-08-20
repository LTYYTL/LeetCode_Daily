package com.leetcode.L1_100.L0076;

public class MinimumWindowSubstringTest {
    public static void main(String[] args) {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        /* * 示例 1：
          输入：s = "ADOBECODEBANC", t = "ABC"
          输出："BANC"
         */
        System.out.println(minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
        /*
          示例 2：
          输入：s = "a", t = "a"
          输出："a"
         */
        System.out.println(minimumWindowSubstring.minWindow("a", "a"));
    }
}
