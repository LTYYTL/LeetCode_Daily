package com.leetcode.L0447;

public class NumberBoomerangsTest {
    public static void main(String[] args) {
        NumberBoomerangs numberBoomerangs = new NumberBoomerangs();
        /**
         * 示例 1：
         * 输入：points = [[0,0],[1,0],[2,0]]
         * 输出：2
         * 解释：两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
         */
        System.out.println(numberBoomerangs.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {2, 0}}));
        /**
         * 示例 2：
         * 输入：points = [[1,1],[2,2],[3,3]]
         * 输出：2
         */
        System.out.println(numberBoomerangs.numberOfBoomerangs(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
        /**
         * 示例 3：
         * 输入：points = [[1,1]]
         * 输出：0
         */
        System.out.println(numberBoomerangs.numberOfBoomerangs(new int[][]{{1, 1}}));
    }
}
