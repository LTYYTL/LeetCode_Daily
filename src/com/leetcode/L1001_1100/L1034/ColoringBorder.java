package com.leetcode.L1001_1100.L1034;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 1034. 边界着色
 * 给你一个大小为 m x n 的整数矩阵 grid ，表示一个网格。另给你三个整数 row、col 和 color 。网格中的每个值表示该位置处的网格块的颜色。
 *
 * 两个网格块属于同一 连通分量 需满足下述全部条件：
 * (1)两个网格块颜色相同
 * (2)在上、下、左、右任意一个方向上相邻
 *
 * 连通分量的边界 是指连通分量中满足下述条件之一的所有网格块：
 * (1)在上、下、左、右四个方向上与不属于同一连通分量的网格块相邻
 * (2)在网格的边界上（第一行/列或最后一行/列）
 *
 * 请你使用指定颜色 color 为所有包含网格块 grid[row][col] 的 连通分量的边界 进行着色，并返回最终的网格 grid 。
 *
 * 示例 1：
 * 输入：grid = [[1,1],[1,2]], row = 0, col = 0, color = 3
 * 输出：[[3,3],[3,2]]
 *
 * 示例 2：
 * 输入：grid = [[1,2,2],[2,3,2]], row = 0, col = 1, color = 3
 * 输出：[[1,3,3],[2,3,3]]
 *
 * 示例 3：
 * 输入：grid = [[1,1,1],[1,1,1],[1,1,1]], row = 1, col = 1, color = 2
 * 输出：[[2,2,2],[2,1,2],[2,2,2]]
 *
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 50
 * 1 <= grid[i][j], color <= 1000
 * 0 <= row < m
 * 0 <= col < n
 *
 */
public class ColoringBorder {
    /**
     * 方法：广度优先搜索
     * @param grid
     * @param row
     * @param col
     * @param color
     * @return
     */
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        //长度
        int m = grid.length;
        int n = grid[0].length;
        //需要染色的坐标
        List<int[]> list = new ArrayList<>();
        //初始颜色
        int init = grid[row][col];
        //队列
        Queue<int[]> queue = new LinkedList<>();
        //放初始化坐标
        queue.add(new int[]{row,col});
        //访问标志
        boolean[][] vis = new boolean[m][n];
        //变成已访问
        vis[row][col] = true;
        //四个方向
        int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};
        //遍历
        while (!queue.isEmpty()){
            //队首元素
            int[] cur = queue.poll();
            //
            boolean isBorder = false;
            //遍历四个方向
            for (int i = 0; i < 4; i++) {
                //新坐标
                int x = cur[0] + dis[i][0];
                int y = cur[1] + dis[i][1];

                if (!(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == init))
                    isBorder = true;
                else if (!vis[x][y]){
                    vis[x][y] = true;
                    queue.add(new int[]{x,y});
                }
            }
            if (isBorder)
                list.add(new int[]{cur[0],cur[1]});
        }

        for (int[] ints : list) {
            int x = ints[0];
            int y = ints[1];
            grid[x][y] = color;
        }
        return grid;
    }
}
