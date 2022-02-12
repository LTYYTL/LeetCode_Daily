package com.leetcode.L601_700.L0694;

import java.util.HashSet;
import java.util.Set;

public class NumberDistinctIslands {
    /**
     * 方法：深度优先搜索
     * @param grid
     * @return
     */
    public int numDistinctIslands(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        // 记录所有岛屿的序列化结果
        Set<String> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // 淹掉这个岛屿，同时存储岛屿的序列化结果
                    StringBuilder sb = new StringBuilder();
                    // 初始的方向可以随便写，不影响正确性
                    dfs(grid, i, j, sb, 666);
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }

    /**
     * 深度优先搜索，进行序列化
     * @param grid
     * @param i
     * @param j
     * @param sb
     * @param dir
     */
    private void dfs(int[][] grid, int i, int j, StringBuilder sb, int dir) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n
                || grid[i][j] == 0) {
            return;
        }
        // 前序遍历位置：进入 (i, j)
        grid[i][j] = 0;
        sb.append(dir).append(',');

        dfs(grid, i - 1, j, sb, 1); // 上
        dfs(grid, i + 1, j, sb, 2); // 下
        dfs(grid, i, j - 1, sb, 3); // 左
        dfs(grid, i, j + 1, sb, 4); // 右

        // 后序遍历位置：离开 (i, j)
        sb.append(-dir).append(',');
    }
}
