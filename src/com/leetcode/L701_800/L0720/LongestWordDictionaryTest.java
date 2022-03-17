package com.leetcode.L701_800.L0720;

public class LongestWordDictionaryTest {
    public static void main(String[] args) {
        LongestWordDictionary longestWordDictionary = new LongestWordDictionary();
        /**
         * 示例 1：
         * 输入：words = ["w","wo","wor","worl", "world"]
         * 输出："world"
         * 解释： 单词"world"可由"w", "wo", "wor", 和 "worl"逐步添加一个字母组成。
         */
        System.out.println(longestWordDictionary.longestWord(new String[]{"w", "wo", "wor", "worl", "world"}));
        /**
         * 示例 2：
         * 输入：words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
         * 输出："apple"
         * 解释："apply" 和 "apple" 都能由词典中的单词组成。但是 "apple" 的字典序小于 "apply"
         */
        System.out.println(longestWordDictionary.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }
}
