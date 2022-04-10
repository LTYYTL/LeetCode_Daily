package com.leetcode.L701_800.L0780;

public class ReachingPointsTest {
    public static void main(String[] args) {
        ReachingPoints reachingPoints = new ReachingPoints();
        /**
         * 示例 1:
         * 输入: sx = 1, sy = 1, tx = 3, ty = 5
         * 输出: true
         * 解释:
         * 可以通过以下一系列转换从起点转换到终点：
         * (1, 1) -> (1, 2)
         * (1, 2) -> (3, 2)
         * (3, 2) -> (3, 5)
         */
        System.out.println(reachingPoints.reachingPoints(1, 1, 3, 5));
        /**
         * 示例 2:
         * 输入: sx = 1, sy = 1, tx = 2, ty = 2
         * 输出: false
         */
        System.out.println(reachingPoints.reachingPoints(1, 1, 2, 2));
        /**
         * 示例 3:
         * 输入: sx = 1, sy = 1, tx = 1, ty = 1
         * 输出: true
         */
        System.out.println(reachingPoints.reachingPoints(1, 1, 1, 1));
    }
}
