package com.leetcode.L1_100.L0052;

public class NQueensIITest {
    public static void main(String[] args) {
        NQueensII nQueensII = new NQueensII();
        /**
         * 示例：
         * 输入：4
         * 输出：[
         *  [".Q..",  // 解法 1
         *   "...Q",
         *   "Q...",
         *   "..Q."],
         *
         *  ["..Q.",  // 解法 2
         *   "Q...",
         *   "...Q",
         *   ".Q.."]
         * ]
         * 解释: 4 皇后问题存在两个不同的解法。
         */
        System.out.println(nQueensII.totalNQueens(4));
    }
}
