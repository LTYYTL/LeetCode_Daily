package com.leetcode.L1101_1200.L1184;

public class DistanceBusStopsTest {
    public static void main(String[] args) {
        DistanceBusStops distanceBusStops = new DistanceBusStops();
        /**
         * 示例 1：
         * 输入：distance = [1,2,3,4], start = 0, destination = 1
         * 输出：1
         * 解释：公交站 0 和 1 之间的距离是 1 或 9，最小值是 1。
         */
        System.out.println(distanceBusStops.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
        /**
         * 示例 2：
         * 输入：distance = [1,2,3,4], start = 0, destination = 2
         * 输出：3
         * 解释：公交站 0 和 2 之间的距离是 3 或 7，最小值是 3。
         */
        System.out.println(distanceBusStops.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2));
        /**
         * 示例 3：
         * 输入：distance = [1,2,3,4], start = 0, destination = 3
         * 输出：4
         * 解释：公交站 0 和 3 之间的距离是 6 或 4，最小值是 4。
         */
        System.out.println(distanceBusStops.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
    }
}
