package com.leetcode.L201_300.L0221;

public class MaxSquareTest {
    public static void main(String[] args) {
        MaxSquare maxSquare = new MaxSquare();
        /** *
         * 示例 1：
         * 输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
         * 输出：4
         */
        System.out.println(maxSquare.maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'},
        }));
        /**
         * 示例 2：
         * 输入：matrix = [["0","1"],["1","0"]]
         * 输出：1
         */
        System.out.println(maxSquare.maximalSquare(new char[][]{
                {'0', '1'},
                {'1', '0'},
        }));
        /**
         * 示例 3：
         * 输入：matrix = [["0"]]
         * 输出：0
         */
        System.out.println(maxSquare.maximalSquare(new char[][]{
                {'0'}
        }));
    }
}
