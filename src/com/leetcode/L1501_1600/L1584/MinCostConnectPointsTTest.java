package com.leetcode.L1501_1600.L1584;

public class MinCostConnectPointsTTest {
    public static void main(String[] args) {
        MinCostConnectPoints minCostConnectPoints = new MinCostConnectPoints();
        /*
          示例 1：
          输入：points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
          输出：20
          解释：
          我们可以按照上图所示连接所有点得到最小总费用，总费用为 20 。
          注意到任意两个点之间只有唯一一条路径互相到达。
         */
        System.out.println(minCostConnectPoints.minCostConnectPoints(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}));
        System.out.println(minCostConnectPoints.minCostConnectPoints_prim(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}));
        /*
          示例 2：
          输入：points = [[3,12],[-2,5],[-4,1]]
          输出：18
         */
        System.out.println(minCostConnectPoints.minCostConnectPoints(new int[][]{{3, 12}, {-2, 5}, {-4, 1}}));
        System.out.println(minCostConnectPoints.minCostConnectPoints_prim(new int[][]{{3, 12}, {-2, 5}, {-4, 1}}));
        /*
          示例 3：
          输入：points = [[0,0],[1,1],[1,0],[-1,1]]
          输出：4
         */
        System.out.println(minCostConnectPoints.minCostConnectPoints(new int[][]{{0, 0}, {1, 1}, {1, 0}, {-1, 1}}));
        System.out.println(minCostConnectPoints.minCostConnectPoints_prim(new int[][]{{0, 0}, {1, 1}, {1, 0}, {-1, 1}}));
        /*
          示例 4：
          输入：points = [[-1000000,-1000000],[1000000,1000000]]
          输出：4000000
         */
        System.out.println(minCostConnectPoints.minCostConnectPoints(new int[][]{{-1000000, -1000000}, {1000000, 1000000}}));
        System.out.println(minCostConnectPoints.minCostConnectPoints_prim(new int[][]{{-1000000, -1000000}, {1000000, 1000000}}));
        /*
          示例 5：
          输入：points = [[0,0]]
          输出：0
         */
        System.out.println(minCostConnectPoints.minCostConnectPoints(new int[][]{{0, 0}}));
        System.out.println(minCostConnectPoints.minCostConnectPoints_prim(new int[][]{{0, 0}}));
    }
}
