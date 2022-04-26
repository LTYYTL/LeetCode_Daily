package com.leetcode.L801_900.L0883;

public class Area3DShapesTest {
    public static void main(String[] args) {
        Area3DShapes area3DShapes = new Area3DShapes();
        /**
         * 示例 1：
         * 输入：[[1,2],[3,4]]
         * 输出：17
         * 解释：这里有该形体在三个轴对齐平面上的三个投影(“阴影部分”)。
         */
        System.out.println(area3DShapes.projectionArea(new int[][]{{1, 2}, {3, 4}}));
        /**
         * 示例 2:
         * 输入：grid = [[2]]
         * 输出：5
         */
        System.out.println(area3DShapes.projectionArea(new int[][]{{2}}));
        /**
         * 示例 3：
         * 输入：[[1,0],[0,2]]
         * 输出：8
         */
        System.out.println(area3DShapes.projectionArea(new int[][]{{1, 0}, {0, 2}}));
    }
}
