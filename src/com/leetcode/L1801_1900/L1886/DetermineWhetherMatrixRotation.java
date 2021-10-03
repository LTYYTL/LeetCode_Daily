package com.leetcode.L1801_1900.L1886;

import java.util.Arrays;

/**
 * 1886. 判断矩阵经轮转后是否一致
 * 给你两个大小为 n x n 的二进制矩阵 mat 和 target 。现 以 90 度顺时针轮转 矩阵 mat 中的元素 若干次 ，如果能够使 mat 与 target 一致，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
 * 输出：true
 * 解释：顺时针轮转 90 度一次可以使 mat 和 target 一致。
 *
 * 示例 2：
 * 输入：mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
 * 输出：false
 * 解释：无法通过轮转矩阵中的元素使 equal 与 target 一致。
 *
 * 示例 3：
 * 输入：mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
 * 输出：true
 * 解释：顺时针轮转 90 度两次可以使 mat 和 target 一致。
 *
 * 提示：
 * n == mat.length == target.length
 * n == mat[i].length == target[i].length
 * 1 <= n <= 10
 * mat[i][j] 和 target[i][j] 不是 0 就是 1
 */
public class DetermineWhetherMatrixRotation {
    /**
     * 方法：模拟
     * @param mat
     * @param target
     * @return
     */
    public boolean findRotation(int[][] mat, int[][] target) {
        //长度
        int n = mat.length;
        //旋转4次
        for (int k = 0; k < 4; k++){
            //水平翻转
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[n-1-i][j];
                    mat[n-1-i][j] = temp;
                }
            }

            // 主对角线翻转
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < i; ++j) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            //比较是否相同
            if (Arrays.deepEquals(mat,target))
                return true;
        }
        return false;
    }
}
