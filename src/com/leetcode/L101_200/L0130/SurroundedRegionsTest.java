package com.leetcode.L101_200.L0130;

import java.util.Arrays;

public class SurroundedRegionsTest {
    public static void main(String[] args) {
        SurroundedRegions surroundedRegions = new SurroundedRegions();
        /** * 示例 1：
         * 输入：board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
         * 输出：[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
         * 解释：被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。
         * 如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
         */
        char[][] chars = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };
        surroundedRegions.solve(chars);
        for (char[] aChar : chars) {
            System.out.println(Arrays.toString(aChar));
        }
        /**
         * 示例 2：
         * 输入：board = [["X"]]
         * 输出：[["X"]]
         */
        char[][] chars1 = {{'X'}};
        surroundedRegions.solve(chars1);
        for (char[] aChar : chars1) {
            System.out.println(Arrays.toString(aChar));
        }
    }
}
