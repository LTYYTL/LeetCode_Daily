package com.leetcode.L1863;

public class SumAllSubsetXORTotalsTest {
    public static void main(String[] args) {
        SumAllSubsetXORTotals sumAllSubsetXORTotals = new SumAllSubsetXORTotals();
        /**
         * 示例 1：
         * 输入：nums = [1,3]
         * 输出：6
         * 解释：[1,3] 共有 4 个子集：
         * - 空子集的异或总和是 0 。
         * - [1] 的异或总和为 1 。
         * - [3] 的异或总和为 3 。
         * - [1,3] 的异或总和为 1 XOR 3 = 2 。
         * 0 + 1 + 3 + 2 = 6
         */
        System.out.println(sumAllSubsetXORTotals.subsetXORSum(new int[]{1, 3}));
        /**
         * 示例 2：
         * 输入：nums = [5,1,6]
         * 输出：28
         * 解释：[5,1,6] 共有 8 个子集：
         * - 空子集的异或总和是 0 。
         * - [5] 的异或总和为 5 。
         * - [1] 的异或总和为 1 。
         * - [6] 的异或总和为 6 。
         * - [5,1] 的异或总和为 5 XOR 1 = 4 。
         * - [5,6] 的异或总和为 5 XOR 6 = 3 。
         * - [1,6] 的异或总和为 1 XOR 6 = 7 。
         * - [5,1,6] 的异或总和为 5 XOR 1 XOR 6 = 2 。
         * 0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28
         */
        System.out.println(sumAllSubsetXORTotals.subsetXORSum(new int[]{5,1,6}));
        /**
         * 示例 3：
         * 输入：nums = [3,4,5,6,7,8]
         * 输出：480
         * 解释：每个子集的全部异或总和值之和为 480 。
         */
        System.out.println(sumAllSubsetXORTotals.subsetXORSum(new int[]{3,4,5,6,7,8}));
    }
}
