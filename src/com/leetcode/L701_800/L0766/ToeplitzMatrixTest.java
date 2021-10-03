package com.leetcode.L701_800.L0766;

public class ToeplitzMatrixTest {
    public static void main(String[] args) {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        /**
         * 示例 1：
         * 输入：matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
         * 输出：true
         * 解释：
         * 在上述矩阵中, 其对角线为:
         * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
         * 各条对角线上的所有元素均相同, 因此答案是 True 。
         *
         * 示例 2：
         * 输入：matrix = [[1,2],[2,2]]
         * 输出：false
         * 解释：
         * 对角线 "[1, 2]" 上的元素不同。
         */
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}
        };
        System.out.println(toeplitzMatrix.isToeplitzMatrix(matrix));
    }
}
