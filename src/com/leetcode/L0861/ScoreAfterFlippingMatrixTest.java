package com.leetcode.L0861;

public class ScoreAfterFlippingMatrixTest {
    public static void main(String[] args) {
        ScoreAfterFlippingMatrix scoreAfterFlippingMatrix = new ScoreAfterFlippingMatrix();
        /**
         * 示例：
         * 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
         * 输出：39
         * 解释：
         * 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
         * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
         */
        int[][] A = {
                {0,0,1,1},
                {1,0,1,0},
                {1,1,0,0}
        };
        System.out.println(scoreAfterFlippingMatrix.matrixScore(A));
    }
}
