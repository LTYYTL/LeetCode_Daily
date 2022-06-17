package com.leetcode.L401_500.L0498;

import java.util.Arrays;

public class DiagonalTraverseTest {
    public static void main(String[] args) {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        /**
         * 示例 1：
         * 输入：mat = [[1,2,3],[4,5,6],[7,8,9]]
         * 输出：[1,2,4,7,5,3,6,8,9]
         */
        System.out.println(Arrays.toString(diagonalTraverse.findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        /**
         * 示例 2：
         * 输入：mat = [[1,2],[3,4]]
         * 输出：[1,2,3,4]
         */
        System.out.println(Arrays.toString(diagonalTraverse.findDiagonalOrder(new int[][]{{1, 2}, {3, 4}})));
    }
}
