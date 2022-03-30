package com.leetcode.L1601_1700.L1606;

public class FindServersMostRequestsTest {
    public static void main(String[] args) {
        FindServersMostRequests findServersMostRequests = new FindServersMostRequests();
        /**
         * 示例 1：
         * 输入：k = 3, arrival = [1,2,3,4,5], load = [5,2,3,3,3]
         * 输出：[1]
         * 解释：
         * 所有服务器一开始都是空闲的。
         * 前 3 个请求分别由前 3 台服务器依次处理。
         * 请求 3 进来的时候，服务器 0 被占据，所以它呗安排到下一台空闲的服务器，也就是服务器 1 。
         * 请求 4 进来的时候，由于所有服务器都被占据，该请求被舍弃。
         * 服务器 0 和 2 分别都处理了一个请求，服务器 1 处理了两个请求。所以服务器 1 是最忙的服务器。
         */
        System.out.println(findServersMostRequests.busiestServers(3, new int[]{1, 2, 3, 4, 5}, new int[]{5, 2, 3, 3, 3}));
        /**
         * 示例 2：
         * 输入：k = 3, arrival = [1,2,3,4], load = [1,2,1,2]
         * 输出：[0]
         * 解释：
         * 前 3 个请求分别被前 3 个服务器处理。
         * 请求 3 进来，由于服务器 0 空闲，它被服务器 0 处理。
         * 服务器 0 处理了两个请求，服务器 1 和 2 分别处理了一个请求。所以服务器 0 是最忙的服务器。
         */
        System.out.println(findServersMostRequests.busiestServers(3, new int[]{1, 2, 3, 4}, new int[]{1, 2, 1, 2}));
        /**
         * 示例 3：
         * 输入：k = 3, arrival = [1,2,3], load = [10,12,11]
         * 输出：[0,1,2]
         * 解释：每个服务器分别处理了一个请求，所以它们都是最忙的服务器。
         */
        System.out.println(findServersMostRequests.busiestServers(3, new int[]{1, 2, 3}, new int[]{10, 12, 11}));
        /**
         * 示例 4：
         * 输入：k = 3, arrival = [1,2,3,4,8,9,10], load = [5,2,10,3,1,2,2]
         * 输出：[1]
         */
        System.out.println(findServersMostRequests.busiestServers(3, new int[]{1, 2, 3, 4, 8, 9, 10}, new int[]{5, 2, 10, 3, 1, 2, 2}));
        /**
         * 示例 5：
         * 输入：k = 1, arrival = [1], load = [1]
         * 输出：[0]
         */
        System.out.println(findServersMostRequests.busiestServers(1, new int[]{1}, new int[]{1}));
    }
}
