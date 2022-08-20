package com.leetcode.L1501_1600.L1572;

public class MatrixDiagonalSumTest {
    public static void main(String[] args) {
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        /* 示例  1：
         输入：mat = [[1,2,3],
         [4,5,6],
         [7,8,9]]
         输出：25
         解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
         请注意，元素 mat[1][1] = 5 只会被计算一次。
         */
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrixDiagonalSum.diagonalSum(mat));
        /*
          示例  2：
          输入：mat = [[1,1,1,1],
                      [1,1,1,1],
                      [1,1,1,1],
                      [1,1,1,1]]
          输出：8
         */
        int[][] mat1 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(matrixDiagonalSum.diagonalSum(mat1));
        /*
          示例 3：
          输入：mat = [[5]]
          输出：5
         */
        int[][] mat2 = {{5}};
        System.out.println(matrixDiagonalSum.diagonalSum(mat2));
    }
}
