package com.leetcode.L2016;

public class MaxDifferenceElementsTest {
    public static void main(String[] args) {
        MaxDifferenceElements maxDifferenceElements = new MaxDifferenceElements();
        /**
         * 示例 1：
         * 输入：nums = [7,1,5,4]
         * 输出：4
         * 解释：
         * 最大差值出现在 i = 1 且 j = 2 时，nums[j] - nums[i] = 5 - 1 = 4 。
         * 注意，尽管 i = 1 且 j = 0 时 ，nums[j] - nums[i] = 7 - 1 = 6 > 4 ，但 i > j 不满足题面要求，所以 6 不是有效的答案。
         */
        System.out.println(maxDifferenceElements.maximumDifference(new int[]{7, 1, 5, 4}));
        /**
         * 示例 2：
         * 输入：nums = [9,4,3,2]
         * 输出：-1
         * 解释：
         * 不存在同时满足 i < j 和 nums[i] < nums[j] 这两个条件的 i, j 组合。
         */
        System.out.println(maxDifferenceElements.maximumDifference(new int[]{9, 4, 3, 2}));
        /**
         * 示例 3：
         * 输入：nums = [1,5,2,10]
         * 输出：9
         * 解释：
         * 最大差值出现在 i = 0 且 j = 3 时，nums[j] - nums[i] = 10 - 1 = 9 。
         */
        System.out.println(maxDifferenceElements.maximumDifference(new int[]{1, 5, 2, 10}));
    }
}
