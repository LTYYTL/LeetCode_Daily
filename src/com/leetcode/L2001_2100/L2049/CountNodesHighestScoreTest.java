package com.leetcode.L2001_2100.L2049;

public class CountNodesHighestScoreTest {
    public static void main(String[] args) {
        CountNodesHighestScore countNodesHighestScore = new CountNodesHighestScore();
        /**
         * 示例 1:
         * 输入：parents = [-1,2,0,2,0]
         * 输出：3
         * 解释：
         * - 节点 0 的分数为：3 * 1 = 3
         * - 节点 1 的分数为：4 = 4
         * - 节点 2 的分数为：1 * 1 * 2 = 2
         * - 节点 3 的分数为：4 = 4
         * - 节点 4 的分数为：4 = 4
         * 最高得分为 4 ，有三个节点得分为 4 （分别是节点 1，3 和 4 ）。
         */
        System.out.println(countNodesHighestScore.countHighestScoreNodes(new int[]{-1, 2, 0, 2, 0}));
        /**
         * 示例 2：
         * 输入：parents = [-1,2,0]
         * 输出：2
         * 解释：
         * - 节点 0 的分数为：2 = 2
         * - 节点 1 的分数为：2 = 2
         * - 节点 2 的分数为：1 * 1 = 1
         * 最高分数为 2 ，有两个节点分数为 2 （分别为节点 0 和 1 ）。
         */
        System.out.println(countNodesHighestScore.countHighestScoreNodes(new int[]{-1, 2, 0}));
    }
}
