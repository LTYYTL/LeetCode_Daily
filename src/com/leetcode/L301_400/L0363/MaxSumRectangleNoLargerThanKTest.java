package com.leetcode.L301_400.L0363;

public class MaxSumRectangleNoLargerThanKTest {
    public static void main(String[] args) {
        MaxSumRectangleNoLargerThanK maxSumRectangleNoLargerThanK = new MaxSumRectangleNoLargerThanK();
        /*
          示例 1：
          输入：matrix = [[1,0,1],[0,-2,3]], k = 2
          输出：2
          解释：蓝色边框圈出来的矩形区域 [[0, 1], [-2, 3]] 的数值和是 2，且 2 是不超过 k 的最大数字（k = 2）。
         */
        int[][] matrix = {
                {1, 0, 1},
                {0, -2, 3}
        };
        System.out.println(maxSumRectangleNoLargerThanK.maxSumSubmatrix(matrix, 2));
        /*
          示例 2：
          输入：matrix = [[2,2,-1]], k = 3
          输出：3
         */
    }
}
