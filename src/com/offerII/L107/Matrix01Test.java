package com.offerII.L107;

import java.util.Arrays;

public class Matrix01Test {
    public static void main(String[] args) {
        Matrix01 matrix01 = new Matrix01();
        /*
          示例 1：
          输入：mat = [[0,0,0],[0,1,0],[0,0,0]]
          输出：[[0,0,0],[0,1,0],[0,0,0]]
         */
        for (int[] ints : matrix01.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}})) {
            System.out.println(Arrays.toString(ints));
        }
        /*
          示例 2：
          输入：mat = [[0,0,0],[0,1,0],[1,1,1]]
          输出：[[0,0,0],[0,1,0],[1,2,1]]
         */
        for (int[] ints : matrix01.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}})) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
