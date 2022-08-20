package com.leetcode.L401_500.L0407;

public class TrappingRainWaterIITest {
    public static void main(String[] args) {
        TrappingRainWaterII trappingRainWaterII = new TrappingRainWaterII();
        /*
          示例 1:
          输入: heightMap = [[1,4,3,1,3,2],[3,2,1,3,2,4],[2,3,3,2,3,1]]
          输出: 4
          解释: 下雨后，雨水将会被上图蓝色的方块中。总的接雨水量为1+2+1=4。
         */
        System.out.println(trappingRainWaterII.trapRainWater(new int[][]{{1, 4, 3, 1, 3, 2}, {3, 2, 1, 3, 2, 4}, {2, 3, 3, 2, 3, 1}}));
        /*
          示例 2:
          输入: heightMap = [[3,3,3,3,3],[3,2,2,2,3],[3,2,1,2,3],[3,2,2,2,3],[3,3,3,3,3]]
          输出: 10
         */
        System.out.println(trappingRainWaterII.trapRainWater(new int[][]{{3, 3, 3, 3, 3}, {3, 2, 2, 2, 3}, {3, 2, 1, 2, 3}, {3, 2, 2, 2, 3}, {3, 3, 3, 3, 3}}));
    }
}
