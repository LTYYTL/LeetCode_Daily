package com.offerII.L091;

public class PaintHouseTest {
    public static void main(String[] args) {
        PaintHouse paintHouse = new PaintHouse();
        /**
         * 示例 1：
         * 输入: costs = [[17,2,17],[16,16,5],[14,3,19]]
         * 输出: 10
         * 解释: 将 0 号房子粉刷成蓝色，1 号房子粉刷成绿色，2 号房子粉刷成蓝色。
         *      最少花费: 2 + 5 + 3 = 10。
         */
        System.out.println(paintHouse.minCost(new int[][]{{17, 2, 17}, {16, 16, 5}, {14, 3, 19}}));
        /**
         * 示例 2：
         * 输入: costs = [[7,6,2]]
         * 输出: 2
         */
        System.out.println(paintHouse.minCost(new int[][]{{7, 6, 2}}));
    }
}
