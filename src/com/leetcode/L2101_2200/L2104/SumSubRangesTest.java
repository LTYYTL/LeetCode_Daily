package com.leetcode.L2101_2200.L2104;

public class SumSubRangesTest {
    public static void main(String[] args) {
        SumSubRanges sumSubRanges = new SumSubRanges();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3]
         * 输出：4
         * 解释：nums 的 6 个子数组如下所示：
         * [1]，范围 = 最大 - 最小 = 1 - 1 = 0
         * [2]，范围 = 2 - 2 = 0
         * [3]，范围 = 3 - 3 = 0
         * [1,2]，范围 = 2 - 1 = 1
         * [2,3]，范围 = 3 - 2 = 1
         * [1,2,3]，范围 = 3 - 1 = 2
         * 所有范围的和是 0 + 0 + 0 + 1 + 1 + 2 = 4
         */
        System.out.println(sumSubRanges.subArrayRanges(new int[]{1, 2, 3}));
        /**
         * 示例 2：
         * 输入：nums = [1,3,3]
         * 输出：4
         * 解释：nums 的 6 个子数组如下所示：
         * [1]，范围 = 最大 - 最小 = 1 - 1 = 0
         * [3]，范围 = 3 - 3 = 0
         * [3]，范围 = 3 - 3 = 0
         * [1,3]，范围 = 3 - 1 = 2
         * [3,3]，范围 = 3 - 3 = 0
         * [1,3,3]，范围 = 3 - 1 = 2
         * 所有范围的和是 0 + 0 + 0 + 2 + 0 + 2 = 4
         */
        System.out.println(sumSubRanges.subArrayRanges(new int[]{1, 3, 3}));
        /**
         * 示例 3：
         * 输入：nums = [4,-2,-3,4,1]
         * 输出：59
         * 解释：nums 中所有子数组范围的和是 59
         */
        System.out.println(sumSubRanges.subArrayRanges(new int[]{4,-2,-3,4,1}));
    }
}
