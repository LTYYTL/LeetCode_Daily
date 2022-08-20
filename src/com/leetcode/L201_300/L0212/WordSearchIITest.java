package com.leetcode.L201_300.L0212;

public class WordSearchIITest {
    public static void main(String[] args) {
        WordSearchII wordSearchII = new WordSearchII();
        /*
          示例 1：
          输入：board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
          输出：["eat","oath"]
         */
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        System.out.println(wordSearchII.findWords(board, new String[]{"oath", "pea", "eat", "rain"}).toString());
        /*
          示例 2：
          输入：board = [["a","b"],["c","d"]], words = ["abcb"]
          输出：[]
         */
        System.out.println(wordSearchII.findWords(new char[][]{{'a', 'b'}, {'c', 'd'}}, new String[]{"abcd"}).toString());
    }
}
