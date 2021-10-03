package com.leetcode.L1001_1100.L1074;

public class NumberSubmatricesThatSumTargetTest {
    public static void main(String[] args) {
        NumberSubmatricesThatSumTarget numberSubmatricesThatSumTarget = new NumberSubmatricesThatSumTarget();
        /**
         * 示例 1：
         * 输入：matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
         * 输出：4
         * 解释：四个只含 0 的 1x1 子矩阵。
         */
        System.out.println(numberSubmatricesThatSumTarget.numSubmatrixSumTarget(new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 0));
        /**
         * 示例 2：
         * 输入：matrix = [[1,-1],[-1,1]], target = 0
         * 输出：5
         * 解释：两个 1x2 子矩阵，加上两个 2x1 子矩阵，再加上一个 2x2 子矩阵。
         */
        /**
         * 示例 3：
         * 输入：matrix = [[904]], target = 0
         * 输出：0
         */
    }
}
