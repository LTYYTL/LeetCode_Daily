package com.leetcode.L3201_3300.L3285;

public class StableMountainIndexFinderTest {
    public static void main(String[] args) {
        StableMountainIndexFinder stableMountainIndexFinder = new StableMountainIndexFinder();
       /*
        * 示例 1：
        * 输入：height = [1,2,3,4,5], threshold = 2
        * 输出：[3,4]
        * 解释：
        * 下标为 3 的山是稳定的，因为 height[2] == 3 大于 threshold == 2 。
        * 下标为 4 的山是稳定的，因为 height[3] == 4 大于 threshold == 2.
        */
        System.out.println(stableMountainIndexFinder.stableMountains(new int[]{1, 2, 3, 4, 5}, 2));
        /*
        * 示例 2：
        * 输入：height = [10,1,10,1,10], threshold = 3
        * 输出：[1,3]
        */
        System.out.println(stableMountainIndexFinder.stableMountains(new int[]{10, 1, 10, 1, 10}, 3));
        /*
        * 示例 3：
        * 输入：height = [10,1,10,1,10], threshold = 10
        * 输出：[]
        */System.out.println(stableMountainIndexFinder.stableMountains(new int[]{10, 1, 10, 1, 10}, 10));
    }
}
