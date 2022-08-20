package com.offer.L0480;

public class TheLongestSubstringRepeatedCharactersTest {
    public static void main(String[] args) {
        TheLongestSubstringRepeatedCharacters theLongestSubstringRepeatedCharacters = new TheLongestSubstringRepeatedCharacters();
        /* * 示例 1:
          输入: "abcabcbb"
          输出: 3
          解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
         */
        System.out.println(theLongestSubstringRepeatedCharacters.lengthOfLongestSubstring("abcabcbb"));
        /*
          示例 2:
          输入: "bbbbb"
          输出: 1
          解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
         */
        System.out.println(theLongestSubstringRepeatedCharacters.lengthOfLongestSubstring("bbbbb"));
        /*
          示例 3:
          输入: "pwwkew"
          输出: 3
          解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
               请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
         */
        System.out.println(theLongestSubstringRepeatedCharacters.lengthOfLongestSubstring("pwwkew"));
    }
}
