package com.leetcode.L0797;

public class AllPathsFromSourceTargetTest {
    public static void main(String[] args) {
        AllPathsFromSourceTarget allPathsFromSourceTarget = new AllPathsFromSourceTarget();
        /**
         * 示例 1：
         * 输入：graph = [[1,2],[3],[3],[]]
         * 输出：[[0,1,3],[0,2,3]]
         * 解释：有两条路径 0 -> 1 -> 3 和 0 -> 2 -> 3
         */
        System.out.println(allPathsFromSourceTarget.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}}));
        /**
         * 示例 2：
         * 输入：graph = [[4,3,1],[3,2,4],[3],[4],[]]
         * 输出：[[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
         */
        System.out.println(allPathsFromSourceTarget.allPathsSourceTarget(new int[][]{{4,3,1}, {3,2,4}, {3}, {4}, {}}));
        /**
         * 示例 3：
         * 输入：graph = [[1],[]]
         * 输出：[[0,1]]
         */
        System.out.println(allPathsFromSourceTarget.allPathsSourceTarget(new int[][]{{1}, {}}));
        /**
         * 示例 4：
         * 输入：graph = [[1,2,3],[2],[3],[]]
         * 输出：[[0,1,2,3],[0,2,3],[0,3]]
         */
        System.out.println(allPathsFromSourceTarget.allPathsSourceTarget(new int[][]{{1,2,3}, {2}, {3}, {}}));
        /**
         * 示例 5：
         * 输入：graph = [[1,3],[2],[3],[]]
         * 输出：[[0,1,2,3],[0,3]]
         */
        System.out.println(allPathsFromSourceTarget.allPathsSourceTarget(new int[][]{{3,1}, {2}, {3},{}}));


    }
}
