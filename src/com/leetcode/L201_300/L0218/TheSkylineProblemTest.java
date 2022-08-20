package com.leetcode.L201_300.L0218;

public class TheSkylineProblemTest {
    public static void main(String[] args) {
        TheSkylineProblem theSkylineProblem = new TheSkylineProblem();
        /*
          示例 1：
          输入：buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
          输出：[[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]
         */
        int[][] buildings = new int[][]{
                {2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}
        };
        System.out.println(theSkylineProblem.getSkyline(buildings).toString());
    }
}
