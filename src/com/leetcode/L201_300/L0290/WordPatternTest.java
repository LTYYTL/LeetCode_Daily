package com.leetcode.L201_300.L0290;

public class WordPatternTest {
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        /*
          示例1:
          输入: pattern = "abba", str = "dog cat cat dog"
          输出: true
         */
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
        /*
          示例 2:
          输入:pattern = "abba", str = "dog cat cat fish"
          输出: false
         */
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat fish"));
        /*
          示例 3:
          输入: pattern = "aaaa", str = "dog cat cat dog"
          输出: false
         */
        System.out.println(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
        /*
          示例 4:
          输入: pattern = "abba", str = "dog dog dog dog"
          输出: false
         */
        System.out.println(wordPattern.wordPattern("abba", "dog dog dog dog"));
    }
}
