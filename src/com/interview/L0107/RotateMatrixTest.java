package com.interview.L0107;

import java.util.Arrays;

public class RotateMatrixTest {
    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();
        /**
         * 示例 1:
         * 给定 matrix =
         * [
         *   [1,2,3],
         *   [4,5,6],
         *   [7,8,9]
         * ],
         *
         * 原地旋转输入矩阵，使其变为:
         * [
         *   [7,4,1],
         *   [8,5,2],
         *   [9,6,3]
         * ]
         */
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateMatrix.rotate(arr);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        /**
         * 示例 2:
         * 给定 matrix =
         * [
         *   [ 5, 1, 9,11],
         *   [ 2, 4, 8,10],
         *   [13, 3, 6, 7],
         *   [15,14,12,16]
         * ],
         *
         * 原地旋转输入矩阵，使其变为:
         * [
         *   [15,13, 2, 5],
         *   [14, 3, 4, 1],
         *   [12, 6, 8, 9],
         *   [16, 7,10,11]
         * ]
         */
        arr = new int[][]{
                { 5, 1, 9,11},
                {2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        rotateMatrix.rotate(arr);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
