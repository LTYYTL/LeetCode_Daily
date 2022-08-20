package com.offerII.L105;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer II 105. 岛屿的最大面积
 * 给定一个由 0 和 1 组成的非空二维数组 grid ，用来表示海洋岛屿地图。
 * 一个 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在水平或者竖直方向上相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。
 * 找到给定的二维数组中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。
 *
 * 示例 1:
 * 输入: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * 输出: 6
 * 解释: 对于上面这个给定矩阵应返回 6。注意答案不应该是 11 ，因为岛屿只能包含水平或垂直的四个方向的 1 。
 *
 * 示例 2:
 * 输入: grid = [[0,0,0,0,0,0,0,0]]
 * 输出: 0
 *
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 50
 * grid[i][j] is either 0 or 1
 *
 * 注意：本题与主站 695 题相同： <a href="https://leetcode-cn.com/problems/max-area-of-island/">https://leetcode-cn.com/problems/max-area-of-island/</a>
 */
public class MaxAreaIsland {
    //四个方向
    int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};
    //长度
    int m;
    int n;

    /**
     * 方法一：广度优先搜索
     * @param grid
     * @return
     */
    public int maxAreaOfIsland(int[][] grid) {
        //结果
        int res = 0;
        m = grid.length;
        n = grid[0].length;
        //用于存储位置信息
        Queue<int[]> queue = new LinkedList<>();
        //标记是否访问
        boolean[][] vis = new boolean[m][n];
        //遍历
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //当前是土地并且没有访问过
                if (grid[i][j] != 0 && !vis[i][j]){
                    //加入队列
                    queue.add(new int[]{i,j});
                    //变成已访问
                    vis[i][j] = true;
                    //广度优先搜索
                    int area = bfs(grid,vis,queue);
                    //获取最大值
                    res = Math.max(res,area);
                }
            }
        }
        return res;
    }

    /**
     * 广度优先搜索
     * @param grid
     * @param vis
     * @param queue
     * @return
     */
    private int bfs(int[][] grid, boolean[][] vis, Queue<int[]> queue){
        //初始队列中的是一块陆地
        int area = 1;
        //遍历
        while (!queue.isEmpty()) {
            //获取队首土地
            int[] cur = queue.poll();
            //遍历土地的四个方向
            for (int k = 0; k < 4; k++) {
                //新坐标
                int x = cur[0] + dis[k][0];
                int y = cur[1] + dis[k][1];
                //越界、被访问、是水都结束
                if (x < 0 || y < 0 || x >= m || y >= n || vis[x][y] || grid[x][y] == 0)
                    continue;
                //存入新土地信息
                queue.add(new int[]{x, y});
                //标记已访问
                vis[x][y] = true;
                //增大面积
                area++;
            }
        }
        return area;
    }

    /**
     * 方法二：深度优先搜索
     * @param grid
     * @return
     */
    public int maxAreaOfIsland_dfs(int[][] grid) {
        //结果
        int res = 0;
        m = grid.length;
        n = grid[0].length;
        //遍历
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //当前是土地并且没有访问过
                if (grid[i][j] != 0){
                    //深度优先搜索
                    int area = dfs(grid,i,j);
                    //获取最大值
                    res = Math.max(res,area);
                }
            }
        }
        return res;
    }

    /**
     * 深度优先搜索
     * @param grid
     * @param i
     * @param j
     * @return
     */
    private int dfs(int[][] grid,int i, int j){
        //被访问过直接变成0
        grid[i][j] = 0;
        int area = 1;
        for (int k = 0; k < 4; k++) {
            //新坐标
            int x = i + dis[k][0];
            int y = j + dis[k][1];
            //越界、是水都结束
            if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 0)
                continue;
            //增大面积
            area += dfs(grid, x, y);
        }
        return area;
    }
}
