package com.leetcode.L801_900.L0807;

public class MaxKeepCitySkylineTest {
    public static void main(String[] args) {
        MaxKeepCitySkyline maxKeepCitySkyline = new MaxKeepCitySkyline();
        /*
          示例 1：
          输入：grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
          输出：35
          解释：建筑物的高度如上图中心所示。
          用红色绘制从不同方向观看得到的天际线。
          在不影响天际线的情况下，增加建筑物的高度：
          gridNew = [ [8, 4, 8, 7],
                      [7, 4, 7, 7],
                      [9, 4, 8, 7],
                      [3, 3, 3, 3] ]
         */
        System.out.println(maxKeepCitySkyline.maxIncreaseKeepingSkyline(new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        }));
        /*
          示例 2：
          输入：grid = [[0,0,0],[0,0,0],[0,0,0]]
          输出：0
          解释：增加任何建筑物的高度都会导致天际线的变化。
         */
        System.out.println(maxKeepCitySkyline.maxIncreaseKeepingSkyline(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        }));
    }
}
