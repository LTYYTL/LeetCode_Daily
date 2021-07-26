package com.leetcode.L1713;

public class MinimumOperationsMakeSubsequenceTest {
    public static void main(String[] args) {
        MinimumOperationsMakeSubsequence minimumOperationsMakeSubsequence = new MinimumOperationsMakeSubsequence();
        /**
         * 示例 1：
         * 输入：target = [5,1,3], arr = [9,4,2,3,4]
         * 输出：2
         * 解释：你可以添加 5 和 1 ，使得 arr 变为 [5,9,4,1,2,3,4] ，target 为 arr 的子序列。
         */
        System.out.println(minimumOperationsMakeSubsequence.minOperations(new int[]{5, 1, 3}, new int[]{9, 4, 2, 3, 4}));
        /**
         * 示例 2：
         * 输入：target = [6,4,8,1,3,2], arr = [4,7,6,2,3,8,6,1]
         * 输出：3
         */
        System.out.println(minimumOperationsMakeSubsequence.minOperations(new int[]{6,4,8,1,3,2}, new int[]{4,7,6,2,3,8,6,1}));
    }
}
