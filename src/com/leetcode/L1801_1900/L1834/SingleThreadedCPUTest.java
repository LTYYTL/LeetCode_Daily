package com.leetcode.L1801_1900.L1834;

import java.util.Arrays;

public class SingleThreadedCPUTest {
    public static void main(String[] args) {
        SingleThreadedCPU singleThreadedCPU = new SingleThreadedCPU();

        /* 示例 1：
         输入：tasks = [[1,2],[2,4],[3,2],[4,1]]
         输出：[0,2,3,1]
         解释：事件按下述流程运行：
         - time = 1 ，任务 0 进入任务队列，可执行任务项 = {0}
         - 同样在 time = 1 ，空闲状态的 CPU 开始执行任务 0 ，可执行任务项 = {}
         - time = 2 ，任务 1 进入任务队列，可执行任务项 = {1}
         - time = 3 ，任务 2 进入任务队列，可执行任务项 = {1, 2}
         - 同样在 time = 3 ，CPU 完成任务 0 并开始执行队列中用时最短的任务 2 ，可执行任务项 = {1}
         - time = 4 ，任务 3 进入任务队列，可执行任务项 = {1, 3}
         - time = 5 ，CPU 完成任务 2 并开始执行队列中用时最短的任务 3 ，可执行任务项 = {1}
         - time = 6 ，CPU 完成任务 3 并开始执行任务 1 ，可执行任务项 = {}
         - time = 10 ，CPU 完成任务 1 并进入空闲状态
         */
        int[][] tasks = {
                {1, 2},
                {2, 4},
                {3, 2},
                {4, 1}
        };
        System.out.println(Arrays.toString(singleThreadedCPU.getOrder(tasks)));
        /*
          示例 2：
          输入：tasks = [[7,10],[7,12],[7,5],[7,4],[7,2]]
          输出：[4,3,2,0,1]
          解释：事件按下述流程运行：
          - time = 7 ，所有任务同时进入任务队列，可执行任务项  = {0,1,2,3,4}
          - 同样在 time = 7 ，空闲状态的 CPU 开始执行任务 4 ，可执行任务项 = {0,1,2,3}
          - time = 9 ，CPU 完成任务 4 并开始执行任务 3 ，可执行任务项 = {0,1,2}
          - time = 13 ，CPU 完成任务 3 并开始执行任务 2 ，可执行任务项 = {0,1}
          - time = 18 ，CPU 完成任务 2 并开始执行任务 0 ，可执行任务项 = {1}
          - time = 28 ，CPU 完成任务 0 并开始执行任务 1 ，可执行任务项 = {}
          - time = 40 ，CPU 完成任务 1 并进入空闲状态
         */
        int[][] tasks1 = {
                {7, 10},
                {7, 12},
                {7, 5},
                {7, 4},
                {7, 2}
        };
        System.out.println(Arrays.toString(singleThreadedCPU.getOrder(tasks1)));
    }
}
