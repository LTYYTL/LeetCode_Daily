package com.leetcode.L2201_2300.L2274;

public class FloorCountWithoutSpecialFloorsTest {
    public static void main(String[] args) {
        FloorCountWithoutSpecialFloors floorCountWithoutSpecialFloors = new FloorCountWithoutSpecialFloors();
        /*
         * 示例 1：
         * 输入：bottom = 2, top = 9, special = [4,6]
         * 输出：3
         * 解释：下面列出的是不含特殊楼层的连续楼层范围：
         * - (2, 3) ，楼层数为 2 。
         * - (5, 5) ，楼层数为 1 。
         * - (7, 9) ，楼层数为 3 。
         * 因此，返回最大连续楼层数 3 。
         */
        System.out.println(floorCountWithoutSpecialFloors.maxConsecutive(2, 9, new int[]{4, 6}));
        /**
         * 示例 2：
         * 输入：bottom = 6, top = 8, special = [7,6,8]
         * 输出：0
         * 解释：每层楼都被规划为特殊楼层，所以返回 0 。
         */
        System.out.println(floorCountWithoutSpecialFloors.maxConsecutive(6, 8, new int[]{7, 6, 8}));
    }
}
