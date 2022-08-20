package com.leetcode.L1701_1800.L1765;

import java.util.Arrays;

public class MapHighestPeakTest {
    public static void main(String[] args) {
        MapHighestPeak mapHighestPeak = new MapHighestPeak();
        /*
          示例 1：
          输入：isWater = [[0,1],[0,0]]
          输出：[[1,0],[2,1]]
          解释：上图展示了给各个格子安排的高度。
          蓝色格子是水域格，绿色格子是陆地格。
         */
        System.out.println(Arrays.deepToString(mapHighestPeak.highestPeak(new int[][]{{0, 1}, {0, 0}})));
        /*
          示例 2：
          输入：isWater = [[0,0,1],[1,0,0],[0,0,0]]
          输出：[[1,1,0],[0,1,1],[1,2,2]]
          解释：所有安排方案中，最高可行高度为 2 。
          任意安排方案中，只要最高高度为 2 且符合上述规则的，都为可行方案。
         */
        System.out.println(Arrays.deepToString(mapHighestPeak.highestPeak(new int[][]{{0, 0, 1}, {1, 0, 0}, {0, 0, 0}})));
    }
}
