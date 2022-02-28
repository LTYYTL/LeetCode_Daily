package com.leetcode.L1601_1700.L1601;

public class MaxAchievableRequestsTest {
    public static void main(String[] args) {
        MaxAchievableRequests maxAchievableRequests = new MaxAchievableRequests();
        /**
         * 示例 1：
         * 输入：n = 5, requests = [[0,1],[1,0],[0,1],[1,2],[2,0],[3,4]]
         * 输出：5
         * 解释：请求列表如下：
         * 从楼 0 离开的员工为 x 和 y ，且他们都想要搬到楼 1 。
         * 从楼 1 离开的员工为 a 和 b ，且他们分别想要搬到楼 2 和 0 。
         * 从楼 2 离开的员工为 z ，且他想要搬到楼 0 。
         * 从楼 3 离开的员工为 c ，且他想要搬到楼 4 。
         * 没有员工从楼 4 离开。
         * 我们可以让 x 和 b 交换他们的楼，以满足他们的请求。
         * 我们可以让 y，a 和 z 三人在三栋楼间交换位置，满足他们的要求。
         * 所以最多可以满足 5 个请求。
         */
        System.out.println(maxAchievableRequests.maximumRequests(5, new int[][]{{0, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 0}, {3, 4}}));
        /**
         * 示例 2：
         * 输入：n = 3, requests = [[0,0],[1,2],[2,1]]
         * 输出：3
         * 解释：请求列表如下：
         * 从楼 0 离开的员工为 x ，且他想要回到原来的楼 0 。
         * 从楼 1 离开的员工为 y ，且他想要搬到楼 2 。
         * 从楼 2 离开的员工为 z ，且他想要搬到楼 1 。
         * 我们可以满足所有的请求。
         */
        System.out.println(maxAchievableRequests.maximumRequests(5, new int[][]{{0, 0}, {1, 2}, {2, 1}}));
        /**
         * 示例 3：
         * 输入：n = 4, requests = [[0,3],[3,1],[1,2],[2,0]]
         * 输出：4
         */
        System.out.println(maxAchievableRequests.maximumRequests(5, new int[][]{{0, 3}, {3, 1}, {1, 2},{2,0}}));
    }
}
