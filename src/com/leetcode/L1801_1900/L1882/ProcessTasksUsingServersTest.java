package com.leetcode.L1801_1900.L1882;

import java.util.Arrays;

public class ProcessTasksUsingServersTest {
    public static void main(String[] args) {
        ProcessTasksUsingServers processTasksUsingServers = new ProcessTasksUsingServers();
        /*示例 1：
          输入：servers = [3,3,2], tasks = [1,2,3,2,1,2]
          输出：[2,2,0,2,1,2]
          解释：事件按时间顺序如下：
          - 0 秒时，第 0 项任务加入到任务队列，使用第 2 台服务器处理到 1 秒。
          - 1 秒时，第 2 台服务器空闲，第 1 项任务加入到任务队列，使用第 2 台服务器处理到 3 秒。
          - 2 秒时，第 2 项任务加入到任务队列，使用第 0 台服务器处理到 5 秒。
          - 3 秒时，第 2 台服务器空闲，第 3 项任务加入到任务队列，使用第 2 台服务器处理到 5 秒。
          - 4 秒时，第 4 项任务加入到任务队列，使用第 1 台服务器处理到 5 秒。
          - 5 秒时，所有服务器都空闲，第 5 项任务加入到任务队列，使用第 2 台服务器处理到 7 秒。
         */
        System.out.println(Arrays.toString(processTasksUsingServers.assignTasks(new int[]{3, 3, 2}, new int[]{1, 2, 3, 2, 1, 2})));
        /*
          示例 2：
          输入：servers = [5,1,4,3,2], tasks = [2,1,2,4,5,2,1]
          输出：[1,4,1,4,1,3,2]
          解释：事件按时间顺序如下：
          - 0 秒时，第 0 项任务加入到任务队列，使用第 1 台服务器处理到 2 秒。
          - 1 秒时，第 1 项任务加入到任务队列，使用第 4 台服务器处理到 2 秒。
          - 2 秒时，第 1 台和第 4 台服务器空闲，第 2 项任务加入到任务队列，使用第 1 台服务器处理到 4 秒。
          - 3 秒时，第 3 项任务加入到任务队列，使用第 4 台服务器处理到 7 秒。
          - 4 秒时，第 1 台服务器空闲，第 4 项任务加入到任务队列，使用第 1 台服务器处理到 9 秒。
          - 5 秒时，第 5 项任务加入到任务队列，使用第 3 台服务器处理到 7 秒。
          - 6 秒时，第 6 项任务加入到任务队列，使用第 2 台服务器处理到 7 秒。
         */
        System.out.println(Arrays.toString(processTasksUsingServers.assignTasks(new int[]{5, 1, 4, 3, 2}, new int[]{2, 1, 2, 4, 5, 2, 1})));
    }
}
