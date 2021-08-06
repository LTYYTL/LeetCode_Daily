package com.leetcode.L0847;

public class ShortestPathVisitingAllNodesTest {
    public static void main(String[] args) {
        ShortestPathVisitingAllNodes shortestPathVisitingAllNodes = new ShortestPathVisitingAllNodes();
        /**
         * 示例 1：
         * 输入：graph = [[1,2,3],[0],[0],[0]]
         * 输出：4
         * 解释：一种可能的路径为 [1,0,2,0,3]
         */
        System.out.println(shortestPathVisitingAllNodes.shortestPathLength(new int[][]{{1, 2, 3}, {0}, {0}, {0}}));
    }
}
