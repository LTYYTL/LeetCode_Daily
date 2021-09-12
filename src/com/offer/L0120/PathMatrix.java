package com.offer.L0120;

/**
 * 剑指 Offer 12. 矩阵中的路径
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。
 *
 * 示例 1：
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 *
 * 示例 2：
 * 输入：board = [["a","b"],["c","d"]], word = "abcd"
 * 输出：false
 *
 * 提示：
 * 1 <= board.length <= 200
 * 1 <= board[i].length <= 200
 * board 和 word 仅由大小写英文字母组成
 *
 * 注意：本题与主站 79 题相同：https://leetcode-cn.com/problems/word-search/
 */
public class PathMatrix {
    /**
     * 深度优先搜索
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; ++i){
            for (int j = 0; j <board[0].length; j++)
                //从[i,j]这个坐标开始查找
                if (dsf(board,words,i,j,0))
                    return true;
        }
        return false;
    }

    /**
     * 深度优先搜索
     * @param board 单词表[][]
     * @param words 查找单词的char[]数组
     * @param i     横坐标
     * @param j     纵坐标
     * @param index 查找到字符串word的第几个字符
     * @return
     */
    private boolean dsf(char[][] board, char[] words, int i, int j, int index) {
        //边界的判断，如果越界直接返回false。index表示的是查找到字符串word的第几个字符，
        //如果这个字符不等于board[i][j]，说明验证这个坐标路径是走不通的，直接返回false
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != words[index])
            return false;
        //如果word的每个字符都查找完了，直接返回true
        if (index == words.length - 1)
            return true;
        //把当前坐标的值保存下来，为了在最后复原
        char temp = board[i][j];
        //然后修改当前坐标的值
        board[i][j] = '.';
        //走递归，沿着当前坐标的上、下、左、右4个方向查找
        boolean res = dsf(board, words, i+1, j, index+1) || dsf(board, words, i-1, j, index+1) ||
                dsf(board, words, i, j-1, index+1) || dsf(board, words, i, j+1, index+1);
        //递归之后再把当前的坐标复原
        board[i][j] = temp;
        return res;
    }
}
