package com.leetcode.L1001_1100.L1036;

public class EscapeLargeMazeTest {
    public static void main(String[] args) {
        EscapeLargeMaze escapeLargeMaze = new EscapeLargeMaze();
        /**
         * 示例 1：
         * 输入：blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
         * 输出：false
         * 解释：
         * 从源方格无法到达目标方格，因为我们无法在网格中移动。
         * 无法向北或者向东移动是因为方格禁止通行。
         * 无法向南或者向西移动是因为不能走出网格。
         */
        System.out.println(escapeLargeMaze.isEscapePossible(new int[][]{{0, 1}, {1, 0}}, new int[]{0, 0}, new int[]{0, 2}));
        /**
         * 示例 2：
         * 输入：blocked = [], source = [0,0], target = [999999,999999]
         * 输出：true
         * 解释：
         * 因为没有方格被封锁，所以一定可以到达目标方格。
         */
        System.out.println(escapeLargeMaze.isEscapePossible(null, new int[]{0, 0}, new int[]{999999, 999999}));
    }
}
