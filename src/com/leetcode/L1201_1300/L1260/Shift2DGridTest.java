package com.leetcode.L1201_1300.L1260;

public class Shift2DGridTest {
    public static void main(String[] args) {
        Shift2DGrid shift2DGrid = new Shift2DGrid();
        /**
         * 示例 1：
         * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
         * 输出：[[9,1,2],[3,4,5],[6,7,8]]
         */
        System.out.println(shift2DGrid.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1));
        /**
         * 示例 2：
         * 输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
         * 输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
         */
        System.out.println(shift2DGrid.shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4));
        /**
         * 示例 3：
         * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
         * 输出：[[1,2,3],[4,5,6],[7,8,9]]
         */
        System.out.println(shift2DGrid.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9));
    }
}
