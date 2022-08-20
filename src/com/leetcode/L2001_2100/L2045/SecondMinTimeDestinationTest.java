package com.leetcode.L2001_2100.L2045;

public class SecondMinTimeDestinationTest {
    public static void main(String[] args) {
        SecondMinTimeDestination secondMinTimeDestination = new SecondMinTimeDestination();
        /*
          示例 1：
          输入：n = 5, edges = [[1,2],[1,3],[1,4],[3,4],[4,5]], time = 3, change = 5
          输出：13
          解释：
          上面的左图展现了给出的城市交通图。
          右图中的蓝色路径是最短时间路径。
          花费的时间是：
          - 从节点 1 开始，总花费时间=0
          - 1 -> 4：3 分钟，总花费时间=3
          - 4 -> 5：3 分钟，总花费时间=6
          因此需要的最小时间是 6 分钟。
          右图中的红色路径是第二短时间路径。
          - 从节点 1 开始，总花费时间=0
          - 1 -> 3：3 分钟，总花费时间=3
          - 3 -> 4：3 分钟，总花费时间=6
          - 在节点 4 等待 4 分钟，总花费时间=10
          - 4 -> 5：3 分钟，总花费时间=13
          因此第二短时间是 13 分钟。
         */
        System.out.println(secondMinTimeDestination.secondMinimum(5, new int[][]{{1, 2}, {1, 3}, {1, 4}, {3, 4}, {4, 5}}, 3, 5));
        /*
          示例 2：
          输入：n = 2, edges = [[1,2]], time = 3, change = 2
          输出：11
          解释：
          最短时间路径是 1 -> 2 ，总花费时间 = 3 分钟
          最短时间路径是 1 -> 2 -> 1 -> 2 ，总花费时间 = 11 分钟
         */
        System.out.println(secondMinTimeDestination.secondMinimum(2, new int[][]{{1, 2}}, 3, 2));
    }
}
