package com.leetcode.L801_900.L0827;

public class MakingLargeIslandTest {
    public static void main(String[] args) {
        MakingLargeIsland makingLargeIsland = new MakingLargeIsland();
        /*
          示例 1:
          输入: grid = [[1, 0], [0, 1]]
          输出: 3
          解释: 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
         */
        System.out.println(makingLargeIsland.largestIsland(new int[][]{{1, 0}, {0, 1}}));
        /*
          示例 2:
          输入: grid = [[1, 1], [1, 0]]
          输出: 4
          解释: 将一格0变成1，岛屿的面积扩大为 4。
         */
        System.out.println(makingLargeIsland.largestIsland(new int[][]{{1, 1}, {1, 0}}));
        /*
          示例 3:
          输入: grid = [[1, 1], [1, 1]]
          输出: 4
          解释: 没有0可以让我们变成1，面积依然为 4。
         */
        System.out.println(makingLargeIsland.largestIsland(new int[][]{{1, 1}, {1, 1}}));
    }
}
