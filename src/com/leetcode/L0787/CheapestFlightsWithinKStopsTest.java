package com.leetcode.L0787;

public class CheapestFlightsWithinKStopsTest {
    public static void main(String[] args) {
        CheapestFlightsWithinKStops cheapestFlightsWithinKStops = new CheapestFlightsWithinKStops();
        /**
         * 示例 1：
         * 输入:
         * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
         * src = 0, dst = 2, k = 1
         * 输出: 200
         * 解释:
         * 城市航班图如下
         * 从城市 0 到城市 2 在 1 站中转以内的最便宜价格是 200，如图中红色所示。
         */
        System.out.println(cheapestFlightsWithinKStops.findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1));
        /**
         * 示例 2：
         * 输入:
         * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
         * src = 0, dst = 2, k = 0
         * 输出: 500
         * 解释:
         * 城市航班图如下
         * 从城市 0 到城市 2 在 0 站中转以内的最便宜价格是 500，如图中蓝色所示。
         */
        System.out.println(cheapestFlightsWithinKStops.findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0));
    }
}
