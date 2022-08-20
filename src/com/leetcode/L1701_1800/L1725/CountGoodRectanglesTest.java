package com.leetcode.L1701_1800.L1725;

public class CountGoodRectanglesTest {
    public static void main(String[] args) {
        CountGoodRectangles countGoodRectangles = new CountGoodRectangles();
        /*
          示例 1：
          输入：rectangles = [[5,8],[3,9],[5,12],[16,5]]
          输出：3
          解释：能从每个矩形中切出的最大正方形边长分别是 [5,3,5,5] 。
          最大正方形的边长为 5 ，可以由 3 个矩形切分得到。
         */
        System.out.println(countGoodRectangles.countGoodRectangles(new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}}));
        /*
          示例 2：
          输入：rectangles = [[2,3],[3,7],[4,3],[3,7]]
          输出：3
         */
        System.out.println(countGoodRectangles.countGoodRectangles(new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}}));
    }
}
