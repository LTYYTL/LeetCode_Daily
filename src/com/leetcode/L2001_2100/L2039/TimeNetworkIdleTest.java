package com.leetcode.L2001_2100.L2039;

public class TimeNetworkIdleTest {
    public static void main(String[] args) {
        TimeNetworkIdle timeNetworkIdle = new TimeNetworkIdle();
        /*
          示例 1：
          输入：edges = [[0,1],[1,2]], patience = [0,2,1]
          输出：8
          解释：
          0 秒最开始时，
          - 数据服务器 1 给主服务器发出信息（用 1A 表示）。
          - 数据服务器 2 给主服务器发出信息（用 2A 表示）。
          1 秒时，
          - 信息 1A 到达主服务器，主服务器立刻处理信息 1A 并发出 1A 的回复信息。
          - 数据服务器 1 还没收到任何回复。距离上次发出信息过去了 1 秒（1 < patience[1] = 2），所以不会重发信息。
          - 数据服务器 2 还没收到任何回复。距离上次发出信息过去了 1 秒（1 == patience[2] = 1），所以它重发一条信息（用 2B 表示）。
          2 秒时，
          - 回复信息 1A 到达服务器 1 ，服务器 1 不会再重发信息。
          - 信息 2A 到达主服务器，主服务器立刻处理信息 2A 并发出 2A 的回复信息。
          - 服务器 2 重发一条信息（用 2C 表示）。
          ...
          4 秒时，
          - 回复信息 2A 到达服务器 2 ，服务器 2 不会再重发信息。
          ...
          7 秒时，回复信息 2D 到达服务器 2 。

          从第 8 秒开始，不再有任何信息在服务器之间传输，也不再有信息到达服务器。
          所以第 8 秒是网络变空闲的最早时刻。
         */
        System.out.println(timeNetworkIdle.networkBecomesIdle(new int[][]{{0, 1}, {1, 2}}, new int[]{0, 2, 1}));
        /*
          示例 2：
          输入：edges = [[0,1],[0,2],[1,2]], patience = [0,10,10]
          输出：3
          解释：数据服务器 1 和 2 第 2 秒初收到回复信息。
          从第 3 秒开始，网络变空闲。
         */
        System.out.println(timeNetworkIdle.networkBecomesIdle(new int[][]{{0, 1}, {0, 2}, {1, 2}}, new int[]{0, 10, 10}));
    }
}
