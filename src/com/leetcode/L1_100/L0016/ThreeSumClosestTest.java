package com.leetcode.L1_100.L0016;

public class ThreeSumClosestTest {
    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        /**
         * 示例 1：
         * 输入：nums = [-1,2,1,-4], target = 1
         * 输出：2
         * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
         */
        System.out.println(threeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        /**
         * 示例 2：
         * 输入：nums = [0,0,0], target = 1
         * 输出：0
         */
        System.out.println(threeSumClosest.threeSumClosest(new int[]{0, 0, 0}, 1));
    }
}
