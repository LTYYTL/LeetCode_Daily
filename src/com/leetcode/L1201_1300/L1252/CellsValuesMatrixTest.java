package com.leetcode.L1201_1300.L1252;

public class CellsValuesMatrixTest {
    public static void main(String[] args) {
        CellsValuesMatrix cellsValuesMatrix = new CellsValuesMatrix();
        /*
          示例 1：
          输入：m = 2, n = 3, indices = [[0,1],[1,1]]
          输出：6
          解释：最开始的矩阵是 [[0,0,0],[0,0,0]]。
          第一次增量操作后得到 [[1,2,1],[0,1,0]]。
          最后的矩阵是 [[1,3,1],[1,3,1]]，里面有 6 个奇数。
         */
        System.out.println(cellsValuesMatrix.oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
        /*
          示例 2：
          输入：m = 2, n = 2, indices = [[1,1],[0,0]]
          输出：0
          解释：最后的矩阵是 [[2,2],[2,2]]，里面没有奇数。
         */
        System.out.println(cellsValuesMatrix.oddCells(2, 2, new int[][]{{1, 1}, {0, 0}}));
    }
}
