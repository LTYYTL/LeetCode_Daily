package com.leetcode.L701_800.L0743;

import java.util.*;

/**
 * 743. 网络延迟时间
 * 有 n 个网络节点，标记为 1 到 n。
 * 给你一个列表 times，表示信号经过 有向 边的传递时间。 times[i] = (ui, vi, wi)，其中 ui 是源节点，vi 是目标节点， wi 是一个信号从源节点传递到目标节点的时间。
 * 现在，从某个节点 K 发出一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回 -1 。
 *
 * 示例 1：
 * 输入：times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
 * 输出：2
 *
 * 示例 2：
 * 输入：times = [[1,2,1]], n = 2, k = 1
 * 输出：1
 *
 * 示例 3：
 * 输入：times = [[1,2,1]], n = 2, k = 2
 * 输出：-1
 *
 * 提示：
 * 1 <= k <= n <= 100
 * 1 <= times.length <= 6000
 * times[i].length == 3
 * 1 <= ui, vi <= n
 * ui != vi
 * 0 <= wi <= 100
 * 所有 (ui, vi) 对都 互不相同（即，不含重复边）
 */
public class NetworkDelayTime {
    /**
     * 方法一：Dijkstra（堆优化）
     * @param times
     * @param n
     * @param k
     * @return
     */
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        //初始化邻接表
        for (int[] time : times) {
            map.computeIfAbsent(time[0], value -> new ArrayList<>()).add(new int[]{time[1],time[2]});
        }

        //初始化dis数组和vis数组
        int[] dis = new int[n+1];
        Arrays.fill(dis,0x3f3f3f3f);
        //标记是否访问
        boolean[] vis = new boolean[n+1];

        // 起点的dis为0，但是别忘记0也要搞一下，因为它是不参与的，我计算结果的时候直接用了stream，所以这个0也就要初始化下了
        dis[k] = 0;
        dis[0] = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> dis[o]));
        queue.offer(k);

        while (!queue.isEmpty()){
            //当队列不空，拿出一个源
            Integer cur = queue.poll();

            //判断是否访问过
            if (vis[cur]) {
                continue;
            }
            //标记为访问过
            vis[cur] = true;
            // 遍历它的邻居们，当然可能没邻居，这里用getOrDefault处理就很方便
            List<int[]> list = map.getOrDefault(cur, Collections.emptyList());

            for (int[] arr : list) {
                int next = arr[0];
                // 如果这个邻居访问过了，继续
                if (vis[next]) continue;
                // 更新到这个邻居的最短距离，看看是不是当前poll出来的节点到它更近一点
                dis[next] = Math.min(dis[next], dis[cur] + arr[1]);
                queue.offer(next);
            }
        }
        // 拿到数组中的最大值比较下，返回结果
        int res = Arrays.stream(dis).max().getAsInt();
        return res == 0x3f3f3f3f ? -1 : res;
    }

    /**
     * 方法二：SPFA算法
     * @param times
     * @param n
     * @param k
     * @return
     */
    public int networkDelayTime_SPFA(int[][] times, int n, int k) {
        final int INF = 0x3f3f3f3f;
        Map<Integer, List<int[]>> map = new HashMap<>();
        //初始化邻接表
        for (int[] time : times) {
            map.computeIfAbsent(time[0], value -> new ArrayList<>()).add(new int[]{time[1],time[2]});
        }

        //初始化dis数组和vis数组
        int[] dis = new int[n+1];
        Arrays.fill(dis,INF);
        //标记是否访问
        boolean[] vis = new boolean[n+1];

        // 起点的dis为0，但是别忘记0也要搞一下，因为它是不参与的，我计算结果的时候直接用了stream，所以这个0也就要初始化下了
        dis[k] = 0;
        dis[0] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);

        while (!queue.isEmpty()){
            //当队列不空，拿出一个源
            Integer cur = queue.poll();
            //可以重复入队
            vis[cur] = false;
            // 遍历它的邻居们，当然可能没邻居，这里用getOrDefault处理就很方便
            List<int[]> list = map.getOrDefault(cur, Collections.emptyList());

            for (int[] arr : list) {
                int next = arr[0];
                // 如果没更新过，或者需要更新距离()
                if (dis[next] == INF || dis[next] > dis[cur] + arr[1]) {
                    // 更新距离
                    dis[next] = dis[cur] + arr[1];
                    // 如果队列中没有，就不需要再次入队了 （那么判断入度可以在这里做文章）
                    if (!vis[next]) {
                        vis[next] = true;
                        queue.offer(next);
                    }
                }
            }
        }
        // 拿到数组中的最大值比较下，返回结果
        int res = Arrays.stream(dis).max().getAsInt();
        return res == 0x3f3f3f3f ? -1 : res;
    }


    /**
     * 方法三：Floyd算法
     * @param times
     * @param N
     * @param K
     * @return
     */
    public int networkDelayTime_Floyd(int[][] times, int N, int K) {
        final int INF = 0x3f3f3f3f;
        int[][] g = new int[N + 1][N + 1];
        // 初始化图,注意,一开始距离是初始化为INF的，而不是像 spfa初始化成-1
        // spfa初始化成-1只是为了判断是否为邻居，这里初始化为INF是因为要取min的
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                g[i][j] = i == j ? 0 : 0x3f3f3f3f;
            }
        }
        for (int[] t : times) {
            g[t[0]][t[1]] = t[2];
        }
        // 使用K节点来松弛i->j的最短路径（大白话就是利用k作为中间节点）
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                }
            }
        }
        // g[a][b]表示a到b的最短距离
        // 拿结果
        int res = 0;
        for (int distance : g[K]) {
            res = Math.max(res, distance);
        }
        return res == INF ? -1 : res;
    }

    /**
     * Dijkstra模板
     * @param times
     * @param n
     * @param k
     * @return
     */
    public int networkDelayTime_template(int[][] times, int n, int k) {
        // 节点编号是从 1 开始的，所以要一个大小为 n + 1 的邻接表
        List<int[]>[] graph = new LinkedList[n+1];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<>();
        }
        //构造图
        for (int[] edge : times) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            // from -> List<(to, weight)>
            // 邻接表存储图结构，同时存储权重信息
            graph[from].add(new int[]{to,weight});
        }
        // 启动 dijkstra 算法计算以节点 k 为起点到其他节点的最短路径
        int[] distTo = dijkstra(graph,k);

        // 找到最长的那一条最短路径
        int res = 0;
        for (int i = 1; i < distTo.length; i++) {
            if (distTo[i] == Integer.MAX_VALUE) {
                // 有节点不可达，返回 -1
                return -1;
            }
            res = Math.max(res, distTo[i]);
        }
        return res;
    }

    /**
     * dijkstra算法
     * @param graph 图
     * @param start     起点
     * @return
     */
    private int[] dijkstra(List<int[]>[] graph, int start) {
        // 定义：distTo[i] 的值就是起点 start 到达节点 i 的最短路径权重
        int[] distTo = new int[graph.length];
        Arrays.fill(distTo, Integer.MAX_VALUE);
        // base case，start 到 start 的最短距离就是 0
        distTo[start] = 0;

        // 优先级队列，distFromStart 较小的排在前面
        PriorityQueue<State> queue = new PriorityQueue<>(
                Comparator.comparingInt(o -> o.distFromStart)
        );
        // 从起点 start 开始进行 BFS
        queue.offer(new State(start, 0));
        
        while (!queue.isEmpty()){
            State cur = queue.poll();
            int curId = cur.id;
            int curDistFromStart = cur.distFromStart;
            
            if (curDistFromStart > distTo[curId])
                continue;
            // 将 curNode 的相邻节点装入队列
            for (int[] neighbor : graph[curId]) {
                int nextNodeId = neighbor[0];
                int distToNextNode  = distTo[curId] + neighbor[1];
                if (distToNextNode < distTo[nextNodeId]){
                    distTo[nextNodeId] = distToNextNode;
                    queue.offer(new State(nextNodeId, distToNextNode));
                }
            }
        }
        return distTo;

    }

    static class State {
        // 图节点的 id
        int id;
        // 从 start 节点到当前节点的距离
        int distFromStart;

        State(int id, int distFromStart) {
            this.id = id;
            this.distFromStart = distFromStart;
        }
    }
}
