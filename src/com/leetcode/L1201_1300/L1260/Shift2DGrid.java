package com.leetcode.L1201_1300.L1260;

import java.util.ArrayList;
import java.util.List;

/**
 * 1260. 二维网格迁移
 * 给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
 * 每次「迁移」操作将会引发下述活动：
 * (1)位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
 * (2)位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
 * (3)位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
 * 请你返回 k 次迁移操作后最终得到的 二维网格。
 * <p>
 * 示例 1：
 * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
 * 输出：[[9,1,2],[3,4,5],[6,7,8]]
 * <p>
 * 示例 2：
 * 输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
 * 输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
 * <p>
 * 示例 3：
 * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
 * 输出：[[1,2,3],[4,5,6],[7,8,9]]
 * <p>
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m <= 50
 * 1 <= n <= 50
 * -1000 <= grid[i][j] <= 1000
 * 0 <= k <= 100
 */
public class Shift2DGrid {
    /**
     * 方法：数学
     *
     * @param grid
     * @param k
     * @return
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        //长度
        int m = grid.length;
        int n = grid[0].length;
        //结果
        List<List<Integer>> res = new ArrayList<>();
        //遍历，初始化
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            res.add(row);
        }

        //位置赋值
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = (i * n + j + k) % (m * n);
                res.get(index / n).set(index % n, grid[i][j]);
            }
        }
        return res;
    }
}
