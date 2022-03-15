package com.leetcode.L2001_2100.L2044;

public class CountMaxORTest {
    public static void main(String[] args) {
        CountMaxOR countMaxOR = new CountMaxOR();
        /**
         * 示例 1：
         * 输入：nums = [3,1]
         * 输出：2
         * 解释：子集按位或能得到的最大值是 3 。有 2 个子集按位或可以得到 3 ：
         * - [3]
         * - [3,1]
         */
        System.out.println(countMaxOR.countMaxOrSubsets(new int[]{3, 1}));
        /**
         * 示例 2：
         * 输入：nums = [2,2,2]
         * 输出：7
         * 解释：[2,2,2] 的所有非空子集的按位或都可以得到 2 。总共有 23 - 1 = 7 个子集。
         */
        System.out.println(countMaxOR.countMaxOrSubsets(new int[]{2, 2, 2}));
        /**
         * 示例 3：
         * 输入：nums = [3,2,1,5]
         * 输出：6
         * 解释：子集按位或可能的最大值是 7 。有 6 个子集按位或可以得到 7 ：
         * - [3,5]
         * - [3,1,5]
         * - [3,2,5]
         * - [3,2,1,5]
         * - [2,5]
         * - [2,1,5]
         */
        System.out.println(countMaxOR.countMaxOrSubsets(new int[]{3, 2, 1, 5}));
    }
}
