package com.leetcode.L2201_2300.L2239;

public class ClosestToZeroFinderTest {
    public static void main(String[] args) {
        ClosestToZeroFinder closestToZeroFinder = new ClosestToZeroFinder();
        /*
         * 示例 1：
         * 输入：nums = [-4,-2,1,4,8]
         * 输出：1
         * 解释：
         * -4 到 0 的距离为 |-4| = 4 。
         * -2 到 0 的距离为 |-2| = 2 。
         * 1 到 0 的距离为 |1| = 1 。
         * 4 到 0 的距离为 |4| = 4 。
         * 8 到 0 的距离为 |8| = 8 。
         * 所以，数组中距离 0 最近的数字为 1 。
         */
        System.out.println(closestToZeroFinder.findClosestNumber(new int[]{-4, -2, 1, 4, 8}));
        /*
         * 示例 2：
         * 输入：nums = [2,-1,1]
         * 输出：1
         * 解释：1 和 -1 都是距离 0 最近的数字，所以返回较大值 1 。
         */
        System.out.println(closestToZeroFinder.findClosestNumber(new int[]{2, -1, 1}));
    }
}
