package com.leetcode.L501_600.L0566;

public class ReshapeMatrixTest {
    public static void main(String[] args) {
        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();
        /*** 示例 1:
         * 输入:
         * nums =
         * [[1,2],
         *  [3,4]]
         * r = 1, c = 4
         * 输出:
         * [[1,2,3,4]]
         * 解释:
         * 行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。
         */
        int[][] nums = new int[][]{
                {1,2},
                {3,4}
        };
        System.out.println(reshapeMatrix.matrixReshape(nums,1,4));
    }
}
