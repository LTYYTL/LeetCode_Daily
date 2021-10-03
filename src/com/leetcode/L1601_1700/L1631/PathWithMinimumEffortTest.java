package com.leetcode.L1601_1700.L1631;

public class PathWithMinimumEffortTest {
    public static void main(String[] args) {
        PathWithMinimumEffort pathWithMinimumEffort = new PathWithMinimumEffort();
        /**
         * 示例 1：
         * 输入：heights = [[1,2,2],[3,8,2],[5,3,5]]
         * 输出：2
         * 解释：路径 [1,3,5,3,5] 连续格子的差值绝对值最大为 2 。
         * 这条路径比路径 [1,2,2,2,5] 更优，因为另一条路径差值最大值为 3 。
         */
        System.out.println(pathWithMinimumEffort.minimumEffortPath(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}}));
        /**
         * 示例 2：
         * 输入：heights = [[1,2,3],[3,8,4],[5,3,5]]
         * 输出：1
         * 解释：路径 [1,2,3,4,5] 的相邻格子差值绝对值最大为 1 ，比路径 [1,3,5,3,5] 更优。
         */
        System.out.println(pathWithMinimumEffort.minimumEffortPath(new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}}));
        /**
         * 示例 3：
         * 输入：heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
         * 输出：0
         * 解释：上图所示路径不需要消耗任何体力。
         */
        System.out.println(pathWithMinimumEffort.minimumEffortPath(new int[][]{{1,2,1,1,1}, {1,2,1,2,1}, {1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}}));
    }
}
