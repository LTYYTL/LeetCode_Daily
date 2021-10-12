package com.offerII.L016;

public class NoRepeatLongestStrTest {
    public static void main(String[] args) {
        NoRepeatLongestStr noRepeatLongestStr = new NoRepeatLongestStr();
        /**
         * 示例 1:
         * 输入: s = "abcabcbb"
         * 输出: 3
         * 解释: 因为无重复字符的最长子字符串是 "abc"，所以其长度为 3。
         */
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring("abcabcbb"));
        /**
         * 示例 2:
         * 输入: s = "bbbbb"
         * 输出: 1
         * 解释: 因为无重复字符的最长子字符串是 "b"，所以其长度为 1。
         */
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring("bbbbb"));
        /**
         * 示例 3:
         * 输入: s = "pwwkew"
         * 输出: 3
         * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
         *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
         */
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring("pwwkew"));
        /**
         * 示例 4:
         * 输入: s = ""
         * 输出: 0
         */
        System.out.println(noRepeatLongestStr.lengthOfLongestSubstring(""));
    }
}
