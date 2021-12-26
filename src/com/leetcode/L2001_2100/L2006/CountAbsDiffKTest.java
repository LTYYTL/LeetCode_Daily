package com.leetcode.L2001_2100.L2006;

public class CountAbsDiffKTest {
    public static void main(String[] args) {
        CountAbsDiffK countAbsDiffK = new CountAbsDiffK();
        /**
         * 示例 1：
         * 输入：nums = [1,2,2,1], k = 1
         * 输出：4
         * 解释：差的绝对值为 1 的数对为：
         * - [1,2,2,1]
         * - [1,2,2,1]
         * - [1,2,2,1]
         * - [1,2,2,1]
         */
        System.out.println(countAbsDiffK.countKDifference(new int[]{1, 2, 2, 1}, 1));
        System.out.println(countAbsDiffK.countKDifference_map(new int[]{1, 2, 2, 1}, 1));
        /**
         * 示例 2：
         * 输入：nums = [1,3], k = 3
         * 输出：0
         * 解释：没有任何数对差的绝对值为 3 。
         */
        System.out.println(countAbsDiffK.countKDifference(new int[]{1, 3}, 3));
        System.out.println(countAbsDiffK.countKDifference_map(new int[]{1, 3}, 3));
        /**
         * 示例 3：
         * 输入：nums = [3,2,1,5,4], k = 2
         * 输出：3
         * 解释：差的绝对值为 2 的数对为：
         * - [3,2,1,5,4]
         * - [3,2,1,5,4]
         * - [3,2,1,5,4]
         */
        System.out.println(countAbsDiffK.countKDifference(new int[]{3, 2, 1, 5, 4}, 2));
        System.out.println(countAbsDiffK.countKDifference_map(new int[]{3, 2, 1, 5, 4}, 2));
    }
}
