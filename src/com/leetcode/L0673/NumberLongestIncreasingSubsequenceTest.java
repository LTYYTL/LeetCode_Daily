package com.leetcode.L0673;

public class NumberLongestIncreasingSubsequenceTest {
    public static void main(String[] args) {
        NumberLongestIncreasingSubsequence  numberLongestIncreasingSubsequence = new NumberLongestIncreasingSubsequence();
        /**
         * 示例 1:
         * 输入: [1,3,5,4,7]
         * 输出: 2
         * 解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
         */
        System.out.println(numberLongestIncreasingSubsequence.findNumberOfLIS(new int[]{1, 3, 5, 4, 7}));
        /**
         * 示例 2:
         * 输入: [2,2,2,2,2]
         * 输出: 5
         * 解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
         */
        System.out.println(numberLongestIncreasingSubsequence.findNumberOfLIS(new int[]{2, 2, 2, 2, 2}));
    }
}
