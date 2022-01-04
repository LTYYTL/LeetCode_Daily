package com.leetcode.L901_1000.L0913;

public class CatAndMouseTest {
    public static void main(String[] args) {
        CatAndMouse catAndMouse = new CatAndMouse();
        /**
         * 示例 1：
         * 输入：graph = [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
         * 输出：0
         */
        System.out.println(catAndMouse.catMouseGame(new int[][]{{2, 5}, {3}, {0, 4, 5}, {1, 4, 5}, {2, 3}, {0, 2, 3}}));
        /**
         * 示例 2：
         * 输入：graph = [[1,3],[0],[3],[0,2]]
         * 输出：1
         */
        System.out.println(catAndMouse.catMouseGame(new int[][]{{1, 3}, {0}, {3}, {0, 2}}));
    }
}
