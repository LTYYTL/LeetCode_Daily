package com.offer.L0290;


import java.util.Arrays;

public class SpiralMatrixTest {
    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        /*
          示例 1：
          输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
          输出：[1,2,3,6,9,8,7,4,5]
         */
        System.out.println(Arrays.toString(spiralMatrix.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        /*
          示例 2：
          输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
          输出：[1,2,3,4,8,12,11,10,9,5,6,7]
         */
        System.out.println(Arrays.toString(spiralMatrix.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})));
    }
}
