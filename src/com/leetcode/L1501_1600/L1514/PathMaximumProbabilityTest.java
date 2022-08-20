package com.leetcode.L1501_1600.L1514;

public class PathMaximumProbabilityTest {
    public static void main(String[] args) {
        PathMaximumProbability pathMaximumProbability = new PathMaximumProbability();
        /*
          示例 1：
          输入：n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
          输出：0.25000
          解释：从起点到终点有两条路径，其中一条的成功概率为 0.2 ，而另一条为 0.5 * 0.5 = 0.25
         */
        System.out.println(pathMaximumProbability.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.2}, 0, 2));
        /*
          示例 2：
          输入：n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, end = 2
          输出：0.30000
         */
        System.out.println(pathMaximumProbability.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.3}, 0, 2));
        /*
          示例 3：
          输入：n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2
          输出：0.00000
          解释：节点 0 和 节点 2 之间不存在路径
         */
        System.out.println(pathMaximumProbability.maxProbability(3, new int[][]{{0, 1}}, new double[]{0.5}, 0, 2));
    }
}
