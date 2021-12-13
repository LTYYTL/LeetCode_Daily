package com.leetcode.L1001_1100.L1034;

import java.util.Arrays;

public class ColoringBorderTest {
    public static void main(String[] args) {
        ColoringBorder coloringBorder = new ColoringBorder();
        /**
         * 示例 1：
         * 输入：grid = [[1,1],[1,2]], row = 0, col = 0, color = 3
         * 输出：[[3,3],[3,2]]
         */
        System.out.println(Arrays.deepToString(coloringBorder.colorBorder(new int[][]{{1, 1}, {1, 2}}, 0, 0, 3)));
        /**
         * 示例 2：
         * 输入：grid = [[1,2,2],[2,3,2]], row = 0, col = 1, color = 3
         * 输出：[[1,3,3],[2,3,3]]
         */
        System.out.println(Arrays.deepToString(coloringBorder.colorBorder(new int[][]{{1, 2, 2}, {2, 3, 2}}, 0, 1, 3)));
        /**
         * 示例 3：
         * 输入：grid = [[1,1,1],[1,1,1],[1,1,1]], row = 1, col = 1, color = 2
         * 输出：[[2,2,2],[2,1,2],[2,2,2]]
         */
        System.out.println(Arrays.deepToString(coloringBorder.colorBorder(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, 1, 1, 2)));
    }
}
