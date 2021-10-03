package com.leetcode.L201_300.L0223;

public class RectangleAreaTest {
    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        /**
         * 示例 1：
         * 输入：ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
         * 输出：45
         */
        System.out.println(rectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        /**
         * 示例 2：
         * 输入：ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2
         * 输出：16
         */
        System.out.println(rectangleArea.computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
    }
}
