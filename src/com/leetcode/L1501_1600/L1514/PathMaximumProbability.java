package com.leetcode.L1501_1600.L1514;

import java.util.*;

/**
 * 1514. 概率最大的路径
 * 给你一个由 n 个节点（下标从 0 开始）组成的无向加权图，该图由一个描述边的列表组成，
 * 其中 edges[i] = [a, b] 表示连接节点 a 和 b 的一条无向边，且该边遍历成功的概率为 succProb[i] 。
 * 指定两个节点分别作为起点 start 和终点 end ，请你找出从起点到终点成功概率最大的路径，并返回其成功概率。
 * 如果不存在从 start 到 end 的路径，请 返回 0 。只要答案与标准答案的误差不超过 1e-5 ，就会被视作正确答案。
 *
 * 示例 1：
 * 输入：n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
 * 输出：0.25000
 * 解释：从起点到终点有两条路径，其中一条的成功概率为 0.2 ，而另一条为 0.5 * 0.5 = 0.25
 *
 * 示例 2：
 * 输入：n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, end = 2
 * 输出：0.30000
 *
 * 示例 3：
 * 输入：n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2
 * 输出：0.00000
 * 解释：节点 0 和 节点 2 之间不存在路径
 *
 * 提示：
 * 2 <= n <= 10^4
 * 0 <= start, end < n
 * start != end
 * 0 <= a, b < n
 * a != b
 * 0 <= succProb.length == edges.length <= 2*10^4
 * 0 <= succProb[i] <= 1
 * 每两个节点之间最多有一条边
 */
public class PathMaximumProbability {
    /**
     * 方法：Dijkstra算法
     * @param n        节点数
     * @param edges    无向图
     * @param succProb 成功概率
     * @param start    开始节点
     * @param end      结束节点
     * @return
     */
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<double[]>[] graph = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new LinkedList<>();
        }
        // 构造邻接表结构表示图
        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            double weight = succProb[i];
            // 无向图就是双向图；先把 int 统一转成 double，待会再转回来
            graph[from].add(new double[]{(double)to, weight});
            graph[to].add(new double[]{(double)from, weight});
        }
        return dijkstra(start,end,graph);
    }

    private double dijkstra(int start, int end, List<double[]>[] graph) {
        // 定义：probTo[i] 的值就是节点 start 到达节点 i 的最大概率
        double[] probTo = new double[graph.length];
        // dp table 初始化为一个取不到的最小值
        Arrays.fill(probTo, -1);
        // base case，start 到 start 的概率就是 1
        probTo[start] = 1;

        // 优先级队列，probFromStart 较大的排在前面
        PriorityQueue<State> queue = new PriorityQueue<>((a, b) -> {
            return Double.compare(b.probFromStart, a.probFromStart);
        });
        queue.offer(new State(start,1));

        while (!queue.isEmpty()){
            State cur = queue.poll();
            int curId = cur.id;
            double curPro = cur.probFromStart;
            // 遇到终点提前返回
            if (curId == end)
                return curPro;

            if (curPro < probTo[curId])
                // 已经有一条概率更大的路径到达 curNode 节点了
                continue;
            // 将 curNode 的相邻节点装入队列
            for (double[] neighbor : graph[curId]) {
                int nextId = (int) neighbor[0];
                // 看看从 curNode 达到 nextNode 的概率是否会更大
                double nextPro = probTo[curId] * neighbor[1];
                if (nextPro > probTo[nextId]){
                    probTo[nextId] = nextPro;
                    queue.offer(new State(nextId,nextPro));
                }
            }
        }
        // 如果到达这里，说明从 start 开始无法到达 end，返回 0
        return 0.0;
    }

    class State {
        // 图节点的 id
        int id;
        // 从 start 节点到达当前节点的概率
        double probFromStart;

        State(int id, double probFromStart) {
            this.id = id;
            this.probFromStart = probFromStart;
        }
    }

}
