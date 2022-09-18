package com.leetcode.L801_900.L0827;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 827. 最大人工岛
 * 给你一个大小为 n x n 二进制矩阵 grid 。最多 只能将一格 0 变成 1 。
 * 返回执行此操作后，grid 中最大的岛屿面积是多少？
 * 岛屿 由一组上、下、左、右四个方向相连的 1 形成。
 * <p>
 * 示例 1:
 * 输入: grid = [[1, 0], [0, 1]]
 * 输出: 3
 * 解释: 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
 * <p>
 * 示例 2:
 * 输入: grid = [[1, 1], [1, 0]]
 * 输出: 4
 * 解释: 将一格0变成1，岛屿的面积扩大为 4。
 * <p>
 * 示例 3:
 * 输入: grid = [[1, 1], [1, 1]]
 * 输出: 4
 * 解释: 没有0可以让我们变成1，面积依然为 4。
 * <p>
 * 提示：
 * n == grid.length
 * n == grid[i].length
 * 1 <= n <= 500
 * grid[i][j] 为 0 或 1
 */
public class MakingLargeIsland {
    /**
     * 方法：深度优先搜索
     */
    public int largestIsland(int[][] grid) {
        // 空数组
        if (grid == null || grid.length == 0) {
            return 1;
        }
        // 结果
        int result = 0;
        // 岛屿索引
        int index = 2;
        // 存储各个岛屿的大小
        Map<Integer, Integer> map = new HashMap<>();
        // 遍历
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 岛屿情况
                if (grid[i][j] == 1) {
                    // 计算可连成的岛的大小
                    map.put(index, calculateAreas(grid, i, j, index++));
                }
            }
        }

        // 没有岛
        if (map.size() == 0) {
            return 1;
        }
        // 遍历
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 是海洋
                if (grid[i][j] == 0) {
                    // 链接的岛屿
                    Set<Integer> isLands = getIsLands(grid, i, j);
                    // 没有链接的岛屿
                    if (isLands.size() == 0) {
                        continue;
                    }
                    // 计算链接岛屿的总和+当前海洋变成岛屿的面积
                    int temp = isLands.stream().map(map::get).reduce(Integer::sum).orElse(0) + 1;
                    // 计算最大值
                    result = Math.max(temp, result);

                }
            }
        }
        if (result == 0) return map.get(2); // 全是岛屿，没有海洋
        return result;
    }


    /**
     * 计算岛屿大小
     */
    private int calculateAreas(int[][] grid, int i, int j, int index) {
        // 越界或者不是岛屿
        if (!isLegal(grid, i, j) || grid[i][j] != 1) {
            return 0;
        }
        // 变成编号
        grid[i][j] = index;

        // 深度优先搜索
        int top = calculateAreas(grid, i - 1, j, index);
        int bottom = calculateAreas(grid, i + 1, j, index);
        int left = calculateAreas(grid, i, j - 1, index);
        int right = calculateAreas(grid, i, j + 1, index);

        // 计算和
        return top + bottom + left + right + 1;
    }

    /**
     * 判断越界
     */
    private boolean isLegal(int[][] grid, int row, int column) {
        return row >= 0 && row < grid.length && column >= 0 && column < grid[0].length;
    }

    /**
     * 当前节点周围链接的岛屿
     */
    private Set<Integer> getIsLands(int[][] grid, int i, int j) {
        Set<Integer> res = new HashSet<>();
        if (isLegal(grid, i - 1, j) && grid[i - 1][j] != 0) {
            res.add(grid[i - 1][j]);
        }
        if (isLegal(grid, i + 1, j) && grid[i + 1][j] != 0) {
            res.add(grid[i + 1][j]);
        }
        if (isLegal(grid, i, j - 1) && grid[i][j - 1] != 0) {
            res.add(grid[i][j - 1]);
        }
        if (isLegal(grid, i, j + 1) && grid[i][j + 1] != 0) {
            res.add(grid[i][j + 1]);
        }

        return res;
    }

}
