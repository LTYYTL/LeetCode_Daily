package com.leetcode.L501_600.L0581;

public class ShortestUnsortedContinuousSubarrayTest {
    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray shortestUnsortedContinuousSubarray = new ShortestUnsortedContinuousSubarray();
        /**
         * 示例 1：
         * 输入：nums = [2,6,4,8,10,9,15]
         * 输出：5
         * 解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
         */
        System.out.println(shortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));

        /**
         * 示例 2：
         * 输入：nums = [1,2,3,4]
         * 输出：0
         */
        System.out.println(shortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[]{1, 2, 3, 4}));

        /**
         * 示例 3：
         * 输入：nums = [1]
         * 输出：0
         */
        System.out.println(shortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[]{1}));
    }
}
