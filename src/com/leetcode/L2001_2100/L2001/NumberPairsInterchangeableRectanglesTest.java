package com.leetcode.L2001_2100.L2001;

public class NumberPairsInterchangeableRectanglesTest {
    public static void main(String[] args) {
        NumberPairsInterchangeableRectangles numberPairsInterchangeableRectangles = new NumberPairsInterchangeableRectangles();
        /**
         * 示例 1：
         * 输入：rectangles = [[4,8],[3,6],[10,20],[15,30]]
         * 输出：6
         * 解释：下面按下标（从 0 开始）列出可互换矩形的配对情况：
         * - 矩形 0 和矩形 1 ：4/8 == 3/6
         * - 矩形 0 和矩形 2 ：4/8 == 10/20
         * - 矩形 0 和矩形 3 ：4/8 == 15/30
         * - 矩形 1 和矩形 2 ：3/6 == 10/20
         * - 矩形 1 和矩形 3 ：3/6 == 15/30
         * - 矩形 2 和矩形 3 ：10/20 == 15/30
         */
        System.out.println(numberPairsInterchangeableRectangles.interchangeableRectangles(new int[][]{{4, 8}, {3, 6}, {10, 20}, {15, 30}}));
        /**
         * 示例 2：
         * 输入：rectangles = [[4,5],[7,8]]
         * 输出：0
         * 解释：不存在成对的可互换矩形。
         */
        System.out.println(numberPairsInterchangeableRectangles.interchangeableRectangles(new int[][]{{4, 5}, {7, 8}}));

    }
}
