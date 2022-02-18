package com.leetcode.L1701_1800.L1791;

public class FindStarGraphtTest {
    public static void main(String[] args) {
        FindStarGraph findStarGraph = new FindStarGraph();
        /**
         * 示例 1：
         * 输入：edges = [[1,2],[2,3],[4,2]]
         * 输出：2
         * 解释：如上图所示，节点 2 与其他每个节点都相连，所以节点 2 是中心节点。
         */
        System.out.println(findStarGraph.findCenter(new int[][]{{1, 2}, {2, 3}, {4, 2}}));
        /**
         * 示例 2：
         * 输入：edges = [[1,2],[5,1],[1,3],[1,4]]
         * 输出：1
         */
        System.out.println(findStarGraph.findCenter(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}}));
    }
}
