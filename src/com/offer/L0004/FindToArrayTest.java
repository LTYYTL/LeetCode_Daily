package com.offer.L0004;

public class FindToArrayTest {
    public static void main(String[] args) {
        FindToArray findToArray = new FindToArray();
        /**
         * 示例:
         * 现有矩阵 matrix 如下：
         * [
         *   [1,   4,  7, 11, 15],
         *   [2,   5,  8, 12, 19],
         *   [3,   6,  9, 16, 22],
         *   [10, 13, 14, 17, 24],
         *   [18, 21, 23, 26, 30]
         * ]
         * 给定 target = 5，返回 true。
         * 给定 target = 20，返回 false。
         */
        int[][] matrix = new int[][]{
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findToArray.findNumberIn2DArray(matrix, 5));
        System.out.println(findToArray.findNumberIn2DArray(matrix, 20));
        System.out.println(findToArray.findNumberIn2DArray_feature(matrix, 5));
        System.out.println(findToArray.findNumberIn2DArray_feature(matrix, 20));
    }
}
