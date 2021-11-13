package com.interview.L0108;

import java.util.Arrays;

public class ZeroMatrixTest {
    public static void main(String[] args) {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        /**
         * 示例 1：
         * 输入：
         * [
         *   [1,1,1],
         *   [1,0,1],
         *   [1,1,1]
         * ]
         * 输出：
         * [
         *   [1,0,1],
         *   [0,0,0],
         *   [1,0,1]
         * ]
         */
        int[][] arr = new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1},
        };
        zeroMatrix.setZeroes(arr);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        /**
         * 示例 2：
         * 输入：
         * [
         *   [0,1,2,0],
         *   [3,4,5,2],
         *   [1,3,1,5]
         * ]
         * 输出：
         * [
         *   [0,0,0,0],
         *   [0,4,5,0],
         *   [0,3,1,0]
         * ]
         */
        arr = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5},
        };
        zeroMatrix.setZeroes(arr);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
