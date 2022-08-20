package com.leetcode.L1_100.L0003;

public class NoRepeatLongestStrTest {
    public static void main(String[] args) {
        NoRepeatLongestStr noRepeatLongestStr = new NoRepeatLongestStr();
        /*
          示例 1:
          输入: "abcabcbb"
          输出: 3
          解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
         */
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring_Map("abcabcbb"));
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring_window("abcabcbb"));
        /*
          示例 2:
          输入: "bbbbb"
          输出: 1
          解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
         */
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring("bbbbb"));
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring_Map("bbbbb"));
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring_window("bbbbb"));
        /*
          示例 3:
          输入: "pwwkew"
          输出: 3
         */
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring("pwwkew"));
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring_Map("pwwkew"));
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring_window("pwwkew"));
    }
}
