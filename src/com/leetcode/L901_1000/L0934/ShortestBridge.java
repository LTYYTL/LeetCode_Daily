package com.leetcode.L901_1000.L0934;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * 934. 最短的桥
 * 给你一个大小为 n x n 的二元矩阵 grid ，其中 1 表示陆地，0 表示水域。
 * 岛 是由四面相连的 1 形成的一个最大组，即不会与非组内的任何其他 1 相连。grid 中 恰好存在两座岛 。
 * 你可以将任意数量的 0 变为 1 ，以使两座岛连接起来，变成 一座岛 。
 * 返回必须翻转的 0 的最小数目。
 * <p>
 * 示例 1：
 * 输入：grid = [[0,1],[1,0]]
 * 输出：1
 * <p>
 * 示例 2：
 * 输入：grid = [[0,1,0],[0,0,0],[0,0,1]]
 * 输出：2
 * <p>
 * 示例 3：
 * 输入：grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
 * 输出：1
 * <p>
 * 提示：
 * n == grid.length == grid[i].length
 * 2 <= n <= 100
 * grid[i][j] 为 0 或 1
 * grid 中恰有两个岛
 */
public class ShortestBridge {
    // 方向
    private final int[][] distend = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    /**
     * 方法：广度优先搜索
     */
    public int shortestBridge(int[][] grid) {
        // 长度
        int m = grid.length;
        int n = grid[0].length;

        // 储存节点
        Queue<int[]> queue = new LinkedList<>();
        // 记录岛屿个数
        int count = 0;

        // 遍历
        for (int i = 0; i < m && count != 1; i++) {
            for (int j = 0; j < n && count != 1; j++) {
                // 是陆地
                if (grid[i][j] == 1) {
                    // 将岛屿变成2
                    markIsLand(grid, i, j, queue);
                    // 目前发现岛屿的个数
                    count++;
                }
            }
        }

        // 结果
        int result = 0;
        // 遍历
        while (!queue.isEmpty()) {
            // 当前层节点个数
            int size = queue.size();
            // 遍历
            for (int i = 0; i < size; i++) {
                // 队首节点
                int[] cur = queue.poll();
                // 遍历四个方向
                for (int k = 0; k < 4; k++) {
                    // 新坐标
                    int newX = Objects.requireNonNull(cur)[0] + distend[k][0];
                    int newY = cur[1] + distend[k][1];
                    // 合格并且是0
                    if (isLegal(newX, newY, grid) && grid[newX][newY] == 0) {
                        // 入队
                        queue.add(new int[]{newX, newY});
                        // 变换编号
                        grid[newX][newY] = 2;
                    } else if (isLegal(newX, newY, grid) && grid[newX][newY] == 1) {
                        // 合格且是下一块岛屿
                        return result;
                    }
                }
            }
            // 变换岛屿的最小个数
            result++;
        }

        return result;
    }

    /**
     * 深度优先搜索，将第一块岛屿变成编号2
     */
    private void markIsLand(int[][] grid, int i, int j, Queue<int[]> queue) {
        // 不合格或者已经访问过
        if (!isLegal(i, j, grid) || grid[i][j] == 0 || grid[i][j] == 2)
            return;
        // 变成访问
        grid[i][j] = 2;

        queue.add(new int[]{i, j});
        // 上
        markIsLand(grid, i - 1, j, queue);
        // 下
        markIsLand(grid, i + 1, j, queue);
        // 左
        markIsLand(grid, i, j - 1, queue);
        // 右
        markIsLand(grid, i, j + 1, queue);
    }

    // 是否合格
    private boolean isLegal(int row, int column, int[][] grid) {
        return row >= 0 && row < grid.length && column >= 0 && column < grid[0].length;
    }

}
