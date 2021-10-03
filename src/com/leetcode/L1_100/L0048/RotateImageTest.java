package com.leetcode.L1_100.L0048;

import java.util.Arrays;

public class RotateImageTest {
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        /**
         * 示例 1:
         * 给定 matrix =
         * [
         *   [1,2,3],
         *   [4,5,6],
         *   [7,8,9]
         * ],
         * 原地旋转输入矩阵，使其变为:
         * [
         *   [7,4,1],
         *   [8,5,2],
         *   [9,6,3]
         * ]
         */
        int[][] n = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotateImage.rotate(n);
        for (int[] i:n){
            System.out.println(Arrays.toString(i));
        }
    }
}
