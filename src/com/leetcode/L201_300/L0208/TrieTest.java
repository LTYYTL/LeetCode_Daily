package com.leetcode.L201_300.L0208;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        /**
         * 示例:
         * Trie trie = new Trie();
         * trie.insert("apple");
         * trie.search("apple");   // 返回 true
         * trie.search("app");     // 返回 false
         * trie.startsWith("app"); // 返回 true
         * trie.insert("app");
         * trie.search("app");     // 返回 true
         */
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // 返回 true
        System.out.println(trie.search("app"));     // 返回 false
        System.out.println(trie.startsWith("app")); // 返回 true
        trie.insert("app");
        System.out.println(trie.search("app"));     // 返回 true

    }
}
