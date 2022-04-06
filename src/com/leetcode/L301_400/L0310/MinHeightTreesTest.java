package com.leetcode.L301_400.L0310;

public class MinHeightTreesTest {
    public static void main(String[] args) {
        MinHeightTrees minHeightTrees = new MinHeightTrees();
        /**
         * 示例 1：
         * 输入：n = 4, edges = [[1,0],[1,2],[1,3]]
         * 输出：[1]
         * 解释：如图所示，当根是标签为 1 的节点时，树的高度是 1 ，这是唯一的最小高度树。
         */
        System.out.println(minHeightTrees.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}));
        /**
         * 示例 2：
         * 输入：n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
         * 输出：[3,4]
         */
        System.out.println(minHeightTrees.findMinHeightTrees(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}));
    }
}
