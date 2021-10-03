package com.leetcode.L201_300.L0211;

public class WordDictionaryTest {
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        /**WordDictionary wordDictionary = new WordDictionary();
         * wordDictionary.addWord("bad");
         * wordDictionary.addWord("dad");
         * wordDictionary.addWord("mad");
         * wordDictionary.search("pad"); // return False
         * wordDictionary.search("bad"); // return True
         * wordDictionary.search(".ad"); // return True
         * wordDictionary.search("b.."); // return True
         */
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad")); // return False
        System.out.println(wordDictionary.search("bad")); // return True
        System.out.println(wordDictionary.search(".ad")); // return True
        System.out.println(wordDictionary.search("b..")); // return True
    }
}
