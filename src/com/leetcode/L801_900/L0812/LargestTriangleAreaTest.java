package com.leetcode.L801_900.L0812;

public class LargestTriangleAreaTest {
    public static void main(String[] args) {
        LargestTriangleArea largestTriangleArea = new LargestTriangleArea();
        /**
         * 示例:
         * 输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
         * 输出: 2
         * 解释:
         * 这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
         */
        System.out.println(largestTriangleArea.largestTriangleArea(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}));
    }
}
