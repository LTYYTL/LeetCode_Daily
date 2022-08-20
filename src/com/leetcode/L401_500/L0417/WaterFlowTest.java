package com.leetcode.L401_500.L0417;

public class WaterFlowTest {
    public static void main(String[] args) {
        WaterFlow waterFlow = new WaterFlow();
        /*
          示例 1：
          输入: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
          输出: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
         */
        System.out.println(waterFlow.pacificAtlantic(new int[][]{
                {1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}
        }));
        /*
          示例 2：
          输入: heights = [[2,1],[1,2]]
          输出: [[0,0],[0,1],[1,0],[1,1]]
         */
        System.out.println(waterFlow.pacificAtlantic(new int[][]{
                {2, 1}, {1, 2}
        }));
    }
}
