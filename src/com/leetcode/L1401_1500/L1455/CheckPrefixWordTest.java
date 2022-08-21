package com.leetcode.L1401_1500.L1455;

public class CheckPrefixWordTest {
    public static void main(String[] args) {
        CheckPrefixWord checkPrefixWord = new CheckPrefixWord();
        /*
          示例 1：
          输入：sentence = "i love eating burger", searchWord = "burg"
          输出：4
          解释："burg" 是 "burger" 的前缀，而 "burger" 是句子中第 4 个单词。
         */
        System.out.println(checkPrefixWord.isPrefixOfWord("i love eating burger", "burg"));
        /*
          示例 2：
          输入：sentence = "this problem is an easy problem", searchWord = "pro"
          输出：2
          解释："pro" 是 "problem" 的前缀，而 "problem" 是句子中第 2 个也是第 6 个单词，但是应该返回最小下标 2 。
         */
        System.out.println(checkPrefixWord.isPrefixOfWord("this problem is an easy problem", "pro"));
        /*
          示例 3：
          输入：sentence = "i am tired", searchWord = "you"
          输出：-1
          解释："you" 不是句子中任何单词的前缀。
         */
        System.out.println(checkPrefixWord.isPrefixOfWord("i am tired", "you"));
    }
}
