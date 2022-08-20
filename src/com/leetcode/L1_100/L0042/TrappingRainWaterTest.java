package com.leetcode.L1_100.L0042;

public class TrappingRainWaterTest {
    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        /*
          示例 1：
          输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
          输出：6
          解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
         */
        System.out.println(trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        /*
          示例 2：
          输入：height = [4,2,0,3,2,5]
          输出：9
         */
        System.out.println(trappingRainWater.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
