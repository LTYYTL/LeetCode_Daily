package com.leetcode.L1001_1100.L1001;

import java.util.Arrays;

public class GridIlluminationTest {
    public static void main(String[] args) {
        GridIllumination gridIllumination = new GridIllumination();
        /**
         * 示例 1：
         * 输入：n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]
         * 输出：[1,0]
         * 解释：最初所有灯都是关闭的。在执行查询之前，打开位于 [0, 0] 和 [4, 4] 的灯。
         * 第 0 次查询检查 grid[1][1] 是否被照亮（蓝色方框）。该单元格被照亮，所以 ans[0] = 1 。然后，关闭红色方框中的所有灯。
         * 第 1 次查询检查 grid[1][0] 是否被照亮（蓝色方框）。该单元格没有被照亮，所以 ans[1] = 0 。然后，关闭红色矩形中的所有灯。
         */
        System.out.println(Arrays.toString(gridIllumination.gridIllumination(5, new int[][]{{0, 0}, {4, 4}}, new int[][]{{1, 1}, {1, 0}})));
        /**
         * 示例 2：
         * 输入：n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,1]]
         * 输出：[1,1]
         */
        System.out.println(Arrays.toString(gridIllumination.gridIllumination(5, new int[][]{{0, 0}, {4, 4}}, new int[][]{{1, 1}, {1, 1}})));
        /**
         * 示例 3：
         * 输入：n = 5, lamps = [[0,0],[0,4]], queries = [[0,4],[0,1],[1,4]]
         * 输出：[1,1,0]
         */
        System.out.println(Arrays.toString(gridIllumination.gridIllumination(5, new int[][]{{0, 0}, {0, 4}}, new int[][]{{0, 4}, {0, 1}, {1, 4}})));
    }
}
