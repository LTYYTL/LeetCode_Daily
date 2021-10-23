package com.offerII.L062;

public class TrieTest {
    public static void main(String[] args) {
        /** * 示例：
         * 输入
         * inputs = ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
         * inputs = [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
         * 输出
         * [null, null, true, false, true, null, true]
         * 解释
         * Trie trie = new Trie();
         * trie.insert("apple");
         * trie.search("apple");   // 返回 True
         * trie.search("app");     // 返回 False
         * trie.startsWith("app"); // 返回 True
         * trie.insert("app");
         * trie.search("app");     // 返回 True
         */
         Trie trie = new Trie();
         trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
