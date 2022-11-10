package com.leetcode.L701_800.L0764;

import java.util.Arrays;

/**
 * 764. 最大加号标志
 * 在一个 n x n 的矩阵 grid 中，除了在数组 mines 中给出的元素为 0，其他每个元素都为 1。mines[i] = [xi, yi]表示 grid[xi][yi] == 0
 * 返回  grid 中包含 1 的最大的 轴对齐 加号标志的阶数 。如果未找到加号标志，则返回 0 。
 * 一个 k 阶由 1 组成的 “轴对称”加号标志 具有中心网格 grid[r][c] == 1 ，以及4个从中心向上、向下、向左、向右延伸，长度为 k-1，由 1 组成的臂。
 * 注意，只有加号标志的所有网格要求为 1 ，别的网格可能为 0 也可能为 1 。
 * <p>
 * 示例 1：
 * 输入: n = 5, mines = [[4, 2]]
 * 输出: 2
 * 解释: 在上面的网格中，最大加号标志的阶只能是2。一个标志已在图中标出。
 * <p>
 * 示例 2：
 * 输入: n = 1, mines = [[0, 0]]
 * 输出: 0
 * 解释: 没有加号标志，返回 0 。
 * <p>
 * 提示：
 * 1 <= n <= 500
 * 1 <= mines.length <= 5000
 * 0 <= xi, yi < n
 * 每一对 (xi, yi) 都 不重复
 */
public class LargestPlusSign {
    // 构建矩阵
    int[][] grid;

    /**
     * 方法：模拟
     */
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        // 创建矩阵
        grid = new int[n][n];
        // 遍历
        for (int i = 0; i < n; i++) {
            // 填充
            Arrays.fill(grid[i], 1);
        }
        // 填充0
        for (int[] mine : mines) {
            int x = mine[0];
            int y = mine[1];
            grid[x][y] = 0;
        }
        // 结果
        int res = 0;
        // 遍历
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 是1进行距离计算
                if (grid[i][j] == 1) {
                    int cur = getMax(i, j);
                    res = Math.max(res, cur);
                }
            }
        }
        return res;
    }

    /**
     * 计算距离
     */
    private int getMax(int i, int j) {
        // 四个方向
        int top = j;
        int bottom = j;
        int left = i;
        int right = i;
        // 左
        while (check(left) && grid[left][j] == 1) {
            left--;
        }

        // 右
        while (check(right) && grid[right][j] == 1) {
            right++;
        }

        // 上
        while (check(top) && grid[i][top] == 1) {
            top--;
        }

        // 下
        while (check(bottom) && grid[i][bottom] == 1) {
            bottom++;
        }
        // 计算最小距离
        int min_x = Math.min(i - left, right - i);
        int min_y = Math.min(j - top, bottom - j);
        return Math.min(min_y, min_x);
    }

    private boolean check(int i) {
        // 判断是否越界
        return i >= 0 && i < grid.length;
    }
}
