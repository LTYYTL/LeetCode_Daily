package com.leetcode.L1882;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 1882. 使用服务器处理任务
 * 给你两个 下标从 0 开始 的整数数组 servers 和 tasks ，长度分别为 n 和 m 。servers[i] 是第 i 台服务器的权重 ，
 * 而 tasks[j] 是处理第 j 项任务 所需要的时间（单位：秒）。
 *
 * 你正在运行一个仿真系统，在处理完所有任务后，该系统将会关闭。每台服务器只能同时处理一项任务。
 * 第 0 项任务在第 0 秒可以开始处理，相应地，第 j 项任务在第 j 秒可以开始处理。
 * 处理第 j 项任务时，你需要为它分配一台 权重最小 的空闲服务器。如果存在多台相同权重的空闲服务器，请选择下标最小 的服务器。如果一台空闲服务器在第 t 秒分配到第 j 项任务，那么在 t + tasks[j] 时它将恢复空闲状态。
 * 如果没有空闲服务器，则必须等待，直到出现一台空闲服务器，并 尽可能早 地处理剩余任务。 如果有多项任务等待分配，则按照 下标递增 的顺序完成分配。
 * 如果同一时刻存在多台空闲服务器，可以同时将多项任务分别分配给它们。
 * 构建长度为 m 的答案数组 ans ，其中 ans[j] 是第 j 项任务分配的服务器的下标。
 *
 * 返回答案数组 ans 。
 *
 * 示例 1：
 * 输入：servers = [3,3,2], tasks = [1,2,3,2,1,2]
 * 输出：[2,2,0,2,1,2]
 * 解释：事件按时间顺序如下：
 * - 0 秒时，第 0 项任务加入到任务队列，使用第 2 台服务器处理到 1 秒。
 * - 1 秒时，第 2 台服务器空闲，第 1 项任务加入到任务队列，使用第 2 台服务器处理到 3 秒。
 * - 2 秒时，第 2 项任务加入到任务队列，使用第 0 台服务器处理到 5 秒。
 * - 3 秒时，第 2 台服务器空闲，第 3 项任务加入到任务队列，使用第 2 台服务器处理到 5 秒。
 * - 4 秒时，第 4 项任务加入到任务队列，使用第 1 台服务器处理到 5 秒。
 * - 5 秒时，所有服务器都空闲，第 5 项任务加入到任务队列，使用第 2 台服务器处理到 7 秒。
 *
 * 示例 2：
 * 输入：servers = [5,1,4,3,2], tasks = [2,1,2,4,5,2,1]
 * 输出：[1,4,1,4,1,3,2]
 * 解释：事件按时间顺序如下：
 * - 0 秒时，第 0 项任务加入到任务队列，使用第 1 台服务器处理到 2 秒。
 * - 1 秒时，第 1 项任务加入到任务队列，使用第 4 台服务器处理到 2 秒。
 * - 2 秒时，第 1 台和第 4 台服务器空闲，第 2 项任务加入到任务队列，使用第 1 台服务器处理到 4 秒。
 * - 3 秒时，第 3 项任务加入到任务队列，使用第 4 台服务器处理到 7 秒。
 * - 4 秒时，第 1 台服务器空闲，第 4 项任务加入到任务队列，使用第 1 台服务器处理到 9 秒。
 * - 5 秒时，第 5 项任务加入到任务队列，使用第 3 台服务器处理到 7 秒。
 * - 6 秒时，第 6 项任务加入到任务队列，使用第 2 台服务器处理到 7 秒。
 *
 * 提示：
 * servers.length == n
 * tasks.length == m
 * 1 <= n, m <= 2 * 105
 * 1 <= servers[i], tasks[j] <= 2 * 105
 */
public class ProcessTasksUsingServers {
    /**
     * 方法：堆
     * @param servers
     * @param tasks
     * @return
     */
    public int[] assignTasks(int[] servers, int[] tasks) {
        //存放服务器，按权重从小到大，权重相同时，按标号从小到大
        PriorityQueue<Server> active = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight == 0 ? o1.index - o2.index : o1.weight - o2.weight);
        //存放执行的服务器的完成时间从小到大
        PriorityQueue<Server> waste = new PriorityQueue<>(Comparator.comparingInt(o -> o.time));
        //存入服务器
        for (int i = 0; i < servers.length; i++) {
            active.add(new Server(servers[i], i, 0));
        }
        ///结果
        int[] res = new int[tasks.length];
        //任务索引
        int index = 0;
        //当前时间
        int globalTime = -1;
        //
        while (index < res.length) {
            while (true) {
                //
                globalTime++;
                //判断执行的服务器是否在当前时刻执行完成
                while (!waste.isEmpty() && waste.peek().time == globalTime) {
                    active.offer(waste.poll());
                }
                //是否由空余服务器
                if (!active.isEmpty()) {
                    break;
                } else {
                    //加速时间
                    globalTime = waste.peek().time - 1;
                }
            }
            //当服务器有空闲并且当前时间前有未完成的任务
            while (!active.isEmpty() && index <= globalTime && index < res.length) {
                //取出可用的服务器
                Server server = active.poll();
                //服务器执行完任务的时间
                server.time = globalTime + tasks[index];
                //当前任务分配的服务器标号
                res[index] = server.index;
                //将当前执行服务器加入执行队列
                waste.offer(server);
                //指向下一个任务
                index++;
            }
        }
        return res;
    }
}

class Server {
    int weight;
    int index;
    int time;

    public Server(int weight, int index, int time) {
        this.weight = weight;
        this.index = index;
        this.time = time;
    }
}
