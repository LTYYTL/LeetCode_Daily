package com.leetcode.L1201_1300.L1219;

public class PathMaxGoldTest {
    public static void main(String[] args) {
        PathMaxGold pathMaxGold = new PathMaxGold();
        /*
          示例 1：
          输入：grid = [[0,6,0],[5,8,7],[0,9,0]]
          输出：24
          解释：
          [[0,6,0],
           [5,8,7],
           [0,9,0]]
          一种收集最多黄金的路线是：9 -> 8 -> 7。
         */
        System.out.println(pathMaxGold.getMaximumGold(new int[][]{{0, 6, 0}, {5, 8, 7}, {0, 9, 0}}));
        /*
          示例 2：
          输入：grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
          输出：28
          解释：
          [[1,0,7],
           [2,0,6],
           [3,4,5],
           [0,3,0],
           [9,0,20]]
          一种收集最多黄金的路线是：1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7。
         */
        System.out.println(pathMaxGold.getMaximumGold(new int[][]{{1, 0, 7}, {2, 0, 6}, {3, 4, 5}, {0, 3, 0}, {9, 0, 20}}));
    }
}
