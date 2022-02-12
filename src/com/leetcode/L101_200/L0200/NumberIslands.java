package com.leetcode.L101_200.L0200;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 200. 岛屿数量
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 * 示例 1：
 * 输入：grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * 输出：1
 *
 * 示例 2：
 * 输入：grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * 输出：3
 *
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] 的值为 '0' 或 '1'
 */
public class NumberIslands {
    /**
     * 方法：深度优先搜索或广度优先搜索
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        //长度
        int m = grid.length;
        int n = grid[0].length;
        //岛屿数
        int res = 0;
        //遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    // 每发现一个岛屿，岛屿数量加一
                    res++;
                    // 然后使用 DFS 将岛屿淹了
                    //dfs(grid, i, j);
                    // 然后使用 DFS 将岛屿淹了
                    bfs(grid, i, j);
                }
            }
        }
        return res;
    }

    // 使用深度优先搜索，从 (i, j) 开始，将与之相邻的陆地都变成海水
    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) {
            // 超出索引边界
            return;
        }
        if (grid[i][j] == '0') {
            // 已经是海水了
            return;
        }
        // 将 (i, j) 变成海水
        grid[i][j] = '0';
        // 淹没上下左右的陆地
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }

    // 使用广度优先搜索，从 (i, j) 开始，将与之相邻的陆地都变成海水
    private void bfs(char[][] grid, int i, int j) {
        //长度
        int m = grid.length, n = grid[0].length;
        //四个方向
        int[][] dis = {{-1,0},{1,0},{0,-1},{0,1}};
        //队列存储坐标
        Queue<int[]> queue = new LinkedList<>();
        //加入队列
        queue.add(new int[]{i,j});
        //将 (i, j) 变成海水
        grid[i][j] = '0';
        //遍历
        while (!queue.isEmpty()) {
            //队首元素
            int[] cur = queue.poll();
            //遍历四个方向
            for (int k = 0; k < 4; k++) {
                //新坐标
                int newX = cur[0] + dis[k][0];
                int newY = cur[1] + dis[k][1];
                // 已经是海水了或者越界
                if (newX < 0 || newY < 0 || newX >= m || newY >= n || grid[newX][newY] == '0') {
                    continue;
                }
                //新坐标加入队列
                queue.add(new int[]{newX,newY});
                //将 (newX, newY) 变成海水
                grid[newX][newY] = '0';
            }
        }
    }
}
