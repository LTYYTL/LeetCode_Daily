package com.leetcode.L1_100.L0073;

import java.util.Arrays;

public class SetMatrixZeroesTest {
    public static void main(String[] args) {
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        /**
         * 示例 1：
         * 输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
         * 输出：[[1,0,1],[0,0,0],[1,0,1]]
         */
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setMatrixZeroes.setZeroes(matrix);
        for (int[] ma:matrix) {
            System.out.println(Arrays.toString(ma));
        }
        /**
         * 示例 2：
         * 输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
         * 输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
         */
        System.out.println("------------------------");
        int[][] matrix1 = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setMatrixZeroes.setZeroes(matrix1);
        for (int[] ma:matrix1) {
            System.out.println(Arrays.toString(ma));
        }
    }
}
