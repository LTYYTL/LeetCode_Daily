package com.leetcode.L0018;

public class Sum4Test {
    public static void main(String[] args) {
        Sum4 sum4 = new Sum4();
        /** * 示例 1：
         * 输入：nums = [1,0,-1,0,-2,2], target = 0
         * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
         */
        System.out.println(sum4.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        /**
         * 示例 2：
         * 输入：nums = [2,2,2,2,2], target = 8
         * 输出：[[2,2,2,2]]
         */
        System.out.println(sum4.fourSum(new int[]{2, 2, 2, 2, 2}, 8));
    }
}
