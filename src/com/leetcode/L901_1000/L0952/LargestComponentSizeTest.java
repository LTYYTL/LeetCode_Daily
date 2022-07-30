package com.leetcode.L901_1000.L0952;

public class LargestComponentSizeTest {
    public static void main(String[] args) {
        LargestComponentSize largestComponentSize = new LargestComponentSize();
        /**
         * 示例 1：
         * 输入：nums = [4,6,15,35]
         * 输出：4
         */
        System.out.println(largestComponentSize.largestComponentSize(new int[]{4, 6, 15, 35}));
        /**
         * 示例 2：
         * 输入：nums = [20,50,9,63]
         * 输出：2
         */
        System.out.println(largestComponentSize.largestComponentSize(new int[]{20, 50, 9, 63}));
        /**
         * 示例 3：
         * 输入：nums = [2,3,6,7,4,12,21,39]
         * 输出：8
         */
        System.out.println(largestComponentSize.largestComponentSize(new int[]{2, 3, 6, 7, 4, 12, 21, 39}));
    }
}
