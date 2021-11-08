package com.leetcode.L701_800.L0785;

public class IsGraphBipartiteTest {
    public static void main(String[] args) {
        IsGraphBipartite isGraphBipartite = new IsGraphBipartite();
        /**
         * 示例 1：
         * 输入：graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
         * 输出：false
         * 解释：不能将节点分割成两个独立的子集，以使每条边都连通一个子集中的一个节点与另一个子集中的一个节点。
         */
        System.out.println(isGraphBipartite.isBipartite(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}));
        System.out.println(isGraphBipartite.isBipartite_dfs(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}));
        /**
         * 示例 2：
         * 输入：graph = [[1,3],[0,2],[1,3],[0,2]]
         * 输出：true
         * 解释：可以将节点分成两组: {0, 2} 和 {1, 3} 。
         */
        System.out.println(isGraphBipartite.isBipartite(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
        System.out.println(isGraphBipartite.isBipartite_dfs(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
    }
}
