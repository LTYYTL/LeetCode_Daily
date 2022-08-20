package com.interview.L0812;

public class EightQueensTest {
    public static void main(String[] args) {
        EightQueens eightQueens = new EightQueens();
        /* * 示例:
           输入：4
           输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
           解释: 4 皇后问题存在如下两个不同的解法。
          [
           [".Q..",  // 解法 1
            "...Q",
            "Q...",
            "..Q."],

           ["..Q.",  // 解法 2
            "Q...",
            "...Q",
            ".Q.."]
          ]
         */
        System.out.println(eightQueens.solveNQueens(4));
    }
}
