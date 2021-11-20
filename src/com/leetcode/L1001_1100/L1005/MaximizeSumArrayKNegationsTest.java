package com.leetcode.L1001_1100.L1005;

public class MaximizeSumArrayKNegationsTest {
    public static void main(String[] args) {
        MaximizeSumArrayKNegations maximizeSumArrayKNegations = new MaximizeSumArrayKNegations();
        /**
         * 示例 1：
         * 输入：A = [4,2,3], K = 1
         * 输出：5
         * 解释：选择索引 (1,) ，然后 A 变为 [4,-2,3]。
         */
        System.out.println(maximizeSumArrayKNegations.largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
        /**
         * 示例 2：
         * 输入：A = [3,-1,0,2], K = 3
         * 输出：6
         * 解释：选择索引 (1, 2, 2) ，然后 A 变为 [3,1,0,2]。
         */
        System.out.println(maximizeSumArrayKNegations.largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
        /**
         * 示例 3：
         * 输入：A = [2,-3,-1,5,-4], K = 2
         * 输出：13
         * 解释：选择索引 (1, 4) ，然后 A 变为 [2,3,-1,5,4]。
         */
        System.out.println(maximizeSumArrayKNegations.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
    }
}
