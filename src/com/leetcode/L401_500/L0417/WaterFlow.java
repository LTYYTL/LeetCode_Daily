package com.leetcode.L401_500.L0417;

import java.util.ArrayList;
import java.util.List;

/**
 * 417. 太平洋大西洋水流问题
 * 有一个 m × n 的矩形岛屿，与 太平洋 和 大西洋 相邻。 “太平洋” 处于大陆的左边界和上边界，而 “大西洋” 处于大陆的右边界和下边界。
 * 这个岛被分割成一个由若干方形单元格组成的网格。给定一个 m x n 的整数矩阵 heights ， heights[r][c] 表示坐标 (r, c) 上单元格 高于海平面的高度 。
 * 岛上雨水较多，如果相邻单元格的高度 小于或等于 当前单元格的高度，雨水可以直接向北、南、东、西流向相邻单元格。水可以从海洋附近的任何单元格流入海洋。
 * 返回 网格坐标 result 的 2D列表 ，其中 result[i] = [ri, ci] 表示雨水可以从单元格 (ri, ci) 流向 太平洋和大西洋 。
 * <p>
 * 示例 1：
 * 输入: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
 * 输出: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
 * <p>
 * 示例 2：
 * 输入: heights = [[2,1],[1,2]]
 * 输出: [[0,0],[0,1],[1,0],[1,1]]
 * <p>
 * 提示：
 * m == heights.length
 * n == heights[r].length
 * 1 <= m, n <= 200
 * 0 <= heights[r][c] <= 105
 */
public class WaterFlow {
    /**
     * 方法：深度优先搜索
     *
     * @param heights
     * @return
     */
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        //长度
        int m = heights.length;
        int n = heights[0].length;
        //记录可以流入太平洋的点
        boolean[][] pacific = new boolean[m][n];
        //记录可以流入大西洋的点
        boolean[][] atlantic = new boolean[m][n];

        //太平洋深度优先搜索
        for (int i = 0; i < n; i++) {
            dfs(heights, 0, i, pacific, heights[0][i]);
        }

        for (int i = 1; i < m; i++) {
            dfs(heights, i, 0, pacific, heights[i][0]);
        }

        //大西洋深度优先搜索
        for (int i = 0; i < n; i++) {
            dfs(heights, m - 1, i, atlantic, heights[m - 1][i]);
        }

        for (int i = 0; i < m; i++) {
            dfs(heights, i, n - 1, atlantic, heights[i][n - 1]);
        }

        //结果
        List<List<Integer>> res = new ArrayList<>();
        //遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //即能流进太平洋也能流进大西洋
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }

        return res;
    }

    private void dfs(int[][] heights, int x, int y, boolean[][] pacific, int val) {
        //越界问题
        if (x < 0 || x >= heights.length || y < 0 || y >= heights[0].length)
            return;
        //已访问
        if (pacific[x][y])
            return;
        //比原来低
        if (heights[x][y] < val)
            return;

        //修改状态
        pacific[x][y] = true;

        //上
        dfs(heights, x - 1, y, pacific, heights[x][y]);
        //下
        dfs(heights, x + 1, y, pacific, heights[x][y]);
        //左
        dfs(heights, x, y - 1, pacific, heights[x][y]);
        //右
        dfs(heights, x, y + 1, pacific, heights[x][y]);

    }
}
