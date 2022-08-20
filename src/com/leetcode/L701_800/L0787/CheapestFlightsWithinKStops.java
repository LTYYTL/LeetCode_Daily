package com.leetcode.L701_800.L0787;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 787. K 站中转内最便宜的航班
 * 有 n 个城市通过一些航班连接。给你一个数组 flights ，其中 flights[i] = [fromi, toi, pricei] ，表示该航班都从城市 fromi 开始，以价格 pricei 抵达 toi。
 * 现在给定所有的城市和航班，以及出发城市 src 和目的地 dst，你的任务是找到出一条最多经过 k 站中转的路线，使得从 src 到 dst 的 价格最便宜 ，并返回该价格。
 * 如果不存在这样的路线，则输出 -1。
 *
 * 示例 1：
 * 输入:
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 1
 * 输出: 200
 * 解释:
 * 城市航班图如下
 * 从城市 0 到城市 2 在 1 站中转以内的最便宜价格是 200，如图中红色所示。
 *
 * 示例 2：
 * 输入:
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 0
 * 输出: 500
 * 解释:
 * 城市航班图如下
 * 从城市 0 到城市 2 在 0 站中转以内的最便宜价格是 500，如图中蓝色所示。
 *
 * 提示：
 * 1 <= n <= 100
 * 0 <= flights.length <= (n * (n - 1) / 2)
 * flights[i].length == 3
 * 0 <= fromi, toi < n
 * fromi != toi
 * 1 <= pricei <= 104
 * 航班没有重复，且不存在自环
 * 0 <= src, dst, k < n
 * src != dst
 */
public class CheapestFlightsWithinKStops {
    /**
     * 方法：Dijkstra算法
     * @param n
     * @param flights
     * @param src
     * @param dst
     * @param k
     * @return
     */
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //记录每个点的对应关系
        int[][] path = new int[n][n];
        for (int[] flight : flights) {
            int form = flight[0];
            int to = flight[1];
            int price = flight[2];
            path[form][to] = price;
        }
        //最小堆
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        //{金额，点，可换站数}
        queue.offer(new int[]{0, src, k});

        // costs[i]: min cost from src to vertex i
        // stops[i]: number of stops of the corresponding cheapest cost for vertex i
        int[] costs = new int[n];//记录从起点到点i的最小金额
        int[] stops = new int[n];//记录顶点 i 对应的最便宜成本的停靠点数
        Arrays.fill(costs, Integer.MAX_VALUE);

        while (!queue.isEmpty()) {
            //堆顶元素
            int[] cur = queue.poll();
            //金额
            int count = cur[0];
            //当前点
            int node = cur[1];
            //可换站数
            int stop = cur[2];
            //到达目的地
            if (node == dst)
                return count;
            //可换站数位0
            else if (stop < 0)
                continue;
            //获得当前点可前往的下一个点
            for (int i = 0; i < n; i++) {
                if (path[node][i] > 0){
                    int cost = costs[i];//最小金额
                    int next = path[node][i];//到达下一个点的金额
                    if (count + next < cost) {//综合比最小
                        queue.offer(new int[]{count + next, i, stop - 1});
                        costs[i] = count + next;//改变最小金额
                        stops[i] = stop - 1;//修改可换站数
                    }else if (stops[i] < stop - 1){
                        queue.offer(new int[]{count + next, i, stop - 1});
                    }
                }
            }
        }
        return -1;
    }

}
