package com.leetcode.L401_500.L0472;

public class ConcatenatedWordsTest {
    public static void main(String[] args) {
        ConcatenatedWords concatenatedWords = new ConcatenatedWords();
        /**
         * 示例 1：
         * 输入：words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
         * 输出：["catsdogcats","dogcatsdog","ratcatdogcat"]
         * 解释："catsdogcats" 由 "cats", "dog" 和 "cats" 组成;
         *      "dogcatsdog" 由 "dog", "cats" 和 "dog" 组成;
         *      "ratcatdogcat" 由 "rat", "cat", "dog" 和 "cat" 组成。
         */
        System.out.println(concatenatedWords.findAllConcatenatedWordsInADict(new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"}));
        /**
         * 示例 2：
         * 输入：words = ["cat","dog","catdog"]
         * 输出：["catdog"]
         */
        System.out.println(concatenatedWords.findAllConcatenatedWordsInADict(new String[]{"cat", "dog", "catdog"}));
    }
}
