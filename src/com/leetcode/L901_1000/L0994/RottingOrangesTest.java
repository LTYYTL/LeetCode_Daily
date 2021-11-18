package com.leetcode.L901_1000.L0994;

public class RottingOrangesTest {
    public static void main(String[] args) {
        RottingOranges rottingOranges = new RottingOranges();
        /**
         * 示例 1：
         * 输入：[[2,1,1],[1,1,0],[0,1,1]]
         * 输出：4
         */
        System.out.println(rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        /**
         * 示例 2：
         * 输入：[[2,1,1],[0,1,1],[1,0,1]]
         * 输出：-1
         * 解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
         */
        System.out.println(rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
        /**
         * 示例 3：
         * 输入：[[0,2]]
         * 输出：0
         * 解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
         */
        System.out.println(rottingOranges.orangesRotting(new int[][]{{0, 2}}));
    }
}
