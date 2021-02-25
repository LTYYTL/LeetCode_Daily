package com.leetcode.L0867;


public class TransposeMatrixTest {
    public static void main(String[] args) {
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        /**
         * 示例 2：
         * 输入：matrix = [[1,2,3],[4,5,6]]
         * 输出：[[1,4],[2,5],[3,6]]
         */
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6}
        };
        System.out.println(transposeMatrix.transpose(matrix));
    }
}
