package com.offer.L0130;

public class RobotRangeMotionTest {
    public static void main(String[] args) {
        RobotRangeMotion robotRangeMotion = new RobotRangeMotion();
        /**
         * 示例 1：
         * 输入：m = 2, n = 3, k = 1
         * 输出：3
         */
        System.out.println(robotRangeMotion.movingCount(2, 3, 1));
        /**
         * 示例 2：
         * 输入：m = 3, n = 1, k = 0
         * 输出：1
         */
        System.out.println(robotRangeMotion.movingCount(3, 1, 0));
    }
}
