package com.leetcode.L1001_1100.L1020;

public class NumberEnclavesTest {
    public static void main(String[] args) {
        NumberEnclaves numberEnclaves = new NumberEnclaves();
        /**
         * 示例 1：
         * 输入：grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
         * 输出：3
         * 解释：有三个 1 被 0 包围。一个 1 没有被包围，因为它在边界上。
         */
        System.out.println(numberEnclaves.numEnclaves(new int[][]{
                {0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}
        }));
        /**
         * 示例 2：
         * 输入：grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
         * 输出：0
         * 解释：所有 1 都在边界上或可以到达边界。
         */
        System.out.println(numberEnclaves.numEnclaves(new int[][]{
                {0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}
        }));
    }
}
