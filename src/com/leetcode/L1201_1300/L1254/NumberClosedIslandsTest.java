package com.leetcode.L1201_1300.L1254;

public class NumberClosedIslandsTest {
    public static void main(String[] args) {
        NumberClosedIslands numberClosedIslands = new NumberClosedIslands();
        /**
         * 示例 1：
         * 输入：grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
         * 输出：2
         * 解释：
         * 灰色区域的岛屿是封闭岛屿，因为这座岛屿完全被水域包围（即被 1 区域包围）。
         */
        System.out.println(numberClosedIslands.closedIsland(new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0}
        }));
        /**
         * 示例 2：
         * 输入：grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
         * 输出：1
         */
        System.out.println(numberClosedIslands.closedIsland(new int[][]{
                {0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}
        }));
        /**
         * 示例 3：
         * 输入：grid = [[1,1,1,1,1,1,1],
         *              [1,0,0,0,0,0,1],
         *              [1,0,1,1,1,0,1],
         *              [1,0,1,0,1,0,1],
         *              [1,0,1,1,1,0,1],
         *              [1,0,0,0,0,0,1],
         *              [1,1,1,1,1,1,1]]
         * 输出：2
         */
        System.out.println(numberClosedIslands.closedIsland(new int[][]{
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
        }));
    }
}
