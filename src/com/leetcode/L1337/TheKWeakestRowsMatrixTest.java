package com.leetcode.L1337;

import java.util.Arrays;

public class TheKWeakestRowsMatrixTest {
    public static void main(String[] args) {
        TheKWeakestRowsMatrix theKWeakestRowsMatrix = new TheKWeakestRowsMatrix();
        /**
         * 示例 1：
         * 输入：mat =
         * [[1,1,0,0,0],
         *  [1,1,1,1,0],
         *  [1,0,0,0,0],
         *  [1,1,0,0,0],
         *  [1,1,1,1,1]],
         * k = 3
         * 输出：[2,0,3]
         * 解释：
         * 每行中的军人数目：
         * 行 0 -> 2
         * 行 1 -> 4
         * 行 2 -> 1
         * 行 3 -> 2
         * 行 4 -> 5
         * 从最弱到最强对这些行排序后得到 [2,0,3,1,4]
         */
        int[][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1},
        };
        System.out.println(Arrays.toString(theKWeakestRowsMatrix.kWeakestRows(mat, 3)));
        System.out.println(Arrays.toString(theKWeakestRowsMatrix.kWeakestRows_brinary(mat, 3)));
    }
}
