package com.leetcode.L1501_1600.L1582;

import java.util.Arrays;

/**
 * 1582. 二进制矩阵中的特殊位置
 * 给你一个大小为 rows x cols 的矩阵 mat，其中 mat[i][j] 是 0 或 1，请返回 矩阵 mat 中特殊位置的数目 。
 * 特殊位置 定义：如果 mat[i][j] == 1 并且第 i 行和第 j 列中的所有其他元素均为 0（行和列的下标均 从 0 开始 ），则位置 (i, j) 被称为特殊位置。
 * <p>
 * 示例 1：
 * 输入：mat = [[1,0,0],
 * [0,0,1],
 * [1,0,0]]
 * 输出：1
 * 解释：(1,2) 是一个特殊位置，因为 mat[1][2] == 1 且所处的行和列上所有其他元素都是 0
 * <p>
 * 示例 2：
 * 输入：mat = [[1,0,0],
 * [0,1,0],
 * [0,0,1]]
 * 输出：3
 * 解释：(0,0), (1,1) 和 (2,2) 都是特殊位置
 * <p>
 * 示例 3：
 * 输入：mat = [[0,0,0,1],
 * [1,0,0,0],
 * [0,1,1,0],
 * [0,0,0,0]]
 * 输出：2
 * <p>
 * 示例 4：
 * 输入：mat = [[0,0,0,0,0],
 * [1,0,0,0,0],
 * [0,1,0,0,0],
 * [0,0,1,0,0],
 * [0,0,0,1,1]]
 * 输出：3
 * <p>
 * 提示：
 * rows == mat.length
 * cols == mat[i].length
 * 1 <= rows, cols <= 100
 * mat[i][j] 是 0 或 1
 */
public class SpecialPositionsMatrix {
    /**
     * 方法：模拟
     */
    public int numSpecial(int[][] mat) {
        // 结果
        int res = 0;
        // 遍历
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                // 是1的情况
                if (ints[j] == 1) {
                    // 行中有多个1
                    if (Arrays.stream(ints).sum() > 1) {
                        break;
                    }
                    // 列中1的个数
                    int row = 0;
                    // 计算列中1的个数
                    for (int[] value : mat) {
                        row += value[j];
                    }
                    // 列中有多个1
                    if (row > 1) {
                        break;
                    }
                    // 计数
                    res++;
                }
            }
        }
        return res;
    }
}
