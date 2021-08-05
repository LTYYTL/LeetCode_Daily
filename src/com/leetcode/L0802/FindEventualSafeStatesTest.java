package com.leetcode.L0802;

public class FindEventualSafeStatesTest {
    public static void main(String[] args) {
        FindEventualSafeStates findEventualSafeStates = new FindEventualSafeStates();
        /**
         * 示例 1：
         * Illustration of graph
         * 输入：graph = [[1,2],[2,3],[5],[0],[5],[],[]]
         * 输出：[2,4,5,6]
         * 解释：示意图如上。
         */
        System.out.println(findEventualSafeStates.eventualSafeNodes(new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}}).toString());
        /**
         * 示例 2：
         * 输入：graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
         * 输出：[4]
         */
    }
}
