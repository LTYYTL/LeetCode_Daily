package com.leetcode.L1886;

public class DetermineWhetherMatrixRotationTest {
    public static void main(String[] args) {
        DetermineWhetherMatrixRotation determineWhetherMatrixRotation = new DetermineWhetherMatrixRotation();
        /**
         * 示例 1：
         * 输入：mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
         * 输出：true
         * 解释：顺时针轮转 90 度一次可以使 mat 和 target 一致。
         */
        System.out.println(determineWhetherMatrixRotation.findRotation(new int[][]{{0, 1}, {1, 0}}, new int[][]{{1, 0}, {0, 1}}));
        /**
         * 示例 2：
         * 输入：mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
         * 输出：false
         * 解释：无法通过轮转矩阵中的元素使 equal 与 target 一致。
         */
        System.out.println(determineWhetherMatrixRotation.findRotation(new int[][]{{0, 1}, {1, 1}}, new int[][]{{1, 0}, {0, 1}}));
        /**
         * 示例 3：
         * 输入：mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
         * 输出：true
         * 解释：顺时针轮转 90 度两次可以使 mat 和 target 一致。
         */
        System.out.println(determineWhetherMatrixRotation.findRotation(new int[][]{{0, 0, 0}, {0, 1, 0},{1, 1, 1}}, new int[][]{{1, 1, 1}, {0, 1, 0},{0, 0, 0}}));
    }
}
