package com.leetcode.L1_100.L0011;

public class ContainerWithMostWaterTest {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        /*
          示例：
          输入：[1,8,6,2,5,4,8,3,7]
          输出：49
         */
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(containerWithMostWater.maxArea(nums));
    }
}
