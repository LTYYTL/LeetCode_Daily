package com.leetcode.L701_800.L0773;

public class SlidingPuzzleTest {
    public static void main(String[] args) {
        SlidingPuzzle slidingPuzzle = new SlidingPuzzle();
        /**
         * 示例：
         * 输入：board = [[1,2,3],[4,0,5]]
         * 输出：1
         * 解释：交换 0 和 5 ，1 步完成
         */
        System.out.println(slidingPuzzle.slidingPuzzle(new int[][]{{1, 2, 3}, {4, 0, 5}}));
        /**
         * 输入：board = [[1,2,3],[5,4,0]]
         * 输出：-1
         * 解释：没有办法完成谜板
         */
        System.out.println(slidingPuzzle.slidingPuzzle(new int[][]{{1, 2, 3}, {5, 4, 0}}));
        /**
         * 输入：board = [[4,1,2],[5,0,3]]
         * 输出：5
         * 解释：
         * 最少完成谜板的最少移动次数是 5 ，
         * 一种移动路径:
         * 尚未移动: [[4,1,2],[5,0,3]]
         * 移动 1 次: [[4,1,2],[0,5,3]]
         * 移动 2 次: [[0,1,2],[4,5,3]]
         * 移动 3 次: [[1,0,2],[4,5,3]]
         * 移动 4 次: [[1,2,0],[4,5,3]]
         * 移动 5 次: [[1,2,3],[4,5,0]]
         * 输入：board = [[3,2,4],[1,5,0]]
         * 输出：14
         */
        System.out.println(slidingPuzzle.slidingPuzzle(new int[][]{{4,1,2},{5,0,3}}));
    }
}
