package com.offerII.L099;

/**
 * 剑指 Offer II 099. 最小路径之和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：一个机器人每次只能向下或者向右移动一步。
 *
 * 示例 1：
 * 输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * 输出：7
 * 解释：因为路径 1→3→1→1→1 的总和最小。
 *
 * 示例 2：
 * 输入：grid = [[1,2,3],[4,5,6]]
 * 输出：12
 *
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 200
 * 0 <= grid[i][j] <= 100
 *
 * 注意：本题与主站 64 题相同： https://leetcode-cn.com/problems/minimum-path-sum/
 */
public class MinPathSum {

    /**
     * 方法：动态规划
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        //长度
        int m = grid.length;
        int n = grid[0].length;
        //第一行的每一点路径和，是左边点的路径+本点的和
        for (int i = 1; i < grid[0].length; i++) {
            grid[0][i] += grid[0][i-1];
        }
        //第一列的每一点路径和，是上边点的路径+本点的和
        for (int i = 1; i < grid.length; i++) {
            grid[i][0] += grid[i-1][0];
        }
        //除去第一行和第一列，每个点的路径和是其上点路径和左点路径和的最小值+本点的和
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
