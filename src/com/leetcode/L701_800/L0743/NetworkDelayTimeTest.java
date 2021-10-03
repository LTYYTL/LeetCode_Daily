package com.leetcode.L701_800.L0743;

public class NetworkDelayTimeTest {
    public static void main(String[] args) {
        NetworkDelayTime networkDelayTime = new NetworkDelayTime();
        /**
         * 示例 1：
         * 输入：times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
         * 输出：2
         */
        System.out.println(networkDelayTime.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
        /**
         * 示例 2：
         * 输入：times = [[1,2,1]], n = 2, k = 1
         * 输出：1
         */
        /**
         * 示例 3：
         * 输入：times = [[1,2,1]], n = 2, k = 2
         * 输出：-1
         */
    }
}
