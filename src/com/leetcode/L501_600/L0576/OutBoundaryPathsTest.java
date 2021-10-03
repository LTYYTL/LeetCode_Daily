package com.leetcode.L501_600.L0576;

public class OutBoundaryPathsTest {
    public static void main(String[] args) {
        OutBoundaryPaths outBoundaryPaths = new OutBoundaryPaths();
        /**
         * 示例 1：
         * 输入：m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
         * 输出：6
         */
        System.out.println(outBoundaryPaths.findPaths(2, 2, 2, 0, 0));
        /**
         * 示例 2：
         * 输入：m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
         * 输出：12
         */
        System.out.println(outBoundaryPaths.findPaths(1,3, 3, 0, 1));
    }
}
