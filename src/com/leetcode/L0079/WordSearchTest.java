package com.leetcode.L0079;

public class WordSearchTest {
    public static void main(String[] args) {
        WordSearch  wordSearch = new WordSearch();
        /**
         * 示例:
         * board =
         * [
         *   ['A','B','C','E'],
         *   ['S','F','C','S'],
         *   ['A','D','E','E']
         * ]
         * 给定 word = "ABCCED", 返回 true
         * 给定 word = "SEE", 返回 true
         * 给定 word = "ABCB", 返回 false
         */
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(wordSearch.exist(board,"ABCCED"));
        System.out.println(wordSearch.exist(board,"SEE"));
        System.out.println(wordSearch.exist(board,"ABCB"));
    }
}
