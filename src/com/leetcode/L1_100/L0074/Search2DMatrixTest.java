package com.leetcode.L1_100.L0074;

public class Search2DMatrixTest {
    public static void main(String[] args) {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        /*
          示例 1：
          输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
          输出：true
         */
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(search2DMatrix.searchMatrix(matrix, 3));
        /*
          示例 2：
          输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
          输出：false
         */
        System.out.println(search2DMatrix.searchMatrix(matrix, 13));
    }
}
