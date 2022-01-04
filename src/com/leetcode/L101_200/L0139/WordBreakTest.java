package com.leetcode.L101_200.L0139;

import java.util.ArrayList;

public class WordBreakTest {
    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        /**
         * 示例 1：
         * 输入: s = "leetcode", wordDict = ["leet", "code"]
         * 输出: true
         * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
         */
        System.out.println(wordBreak.wordBreak("leetcode", new ArrayList<String>() {{
            add("leet");
            add("code");
        }}));
        /**
         * 示例 2：
         * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
         * 输出: true
         * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
         *      注意你可以重复使用字典中的单词。
         */
        System.out.println(wordBreak.wordBreak("applepenapple", new ArrayList<String>() {{
            add("apple");
            add("pen");
        }}));
        /**
         * 示例 3：
         * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
         * 输出: false
         */
        System.out.println(wordBreak.wordBreak("catsandog", new ArrayList<String>() {{
            add("cats");
            add("dog");
            add("sand");
            add("and");
            add("cat");
        }}));
    }
}
