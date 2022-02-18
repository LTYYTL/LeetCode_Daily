package com.leetcode.L1301_1400.L1380;

import java.util.ArrayList;
import java.util.List;

/**
 * 1380. 矩阵中的幸运数
 * 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 * (1)在同一行的所有元素中最小
 * (2)在同一列的所有元素中最大
 *
 * 示例 1：
 * 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * 输出：[15]
 * 解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 *
 * 示例 2：
 * 输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * 输出：[12]
 * 解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 *
 * 示例 3：
 * 输入：matrix = [[7,8],[1,2]]
 * 输出：[7]
 *
 * 提示：
 * m == mat.length
 * n == mat[i].length
 * 1 <= n, m <= 50
 * 1 <= matrix[i][j] <= 10^5
 * 矩阵中的所有元素都是不同的
 */
public class LuckyNumbersMatrix {
    /**
     * 方法：模拟
     * @param matrix
     * @return
     */
    public List<Integer> luckyNumbers (int[][] matrix) {
        //获取每行的最小值数组
        int[] min_low = getMinLow(matrix);
        //获取每列的最大值数组
        int[] max_row = getMaxRow(matrix);
        //结果
        List<Integer> res = new ArrayList<>();

        //遍历
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //当前行最小值，当前列最大值
                if (min_low[i] == max_row[j])
                    res.add(min_low[i]);
            }
        }

        return res;
    }

    /**
     * 获取列最大值
     * @param matrix
     * @return
     */
    private int[] getMaxRow(int[][] matrix) {
        //列长
        int n = matrix[0].length;
        //结果
        int[] res = new int[n];
        //遍历列
        for (int i = 0; i < matrix[0].length; i++) {
            //最大值
            int max = Integer.MIN_VALUE;
            //遍历行
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max,matrix[j][i]);
            }
            //当前列的最大值
            res[i] = max;
        }
        return res;
    }

    /**
     * 获取行最小值
     * @param matrix
     * @return
     */
    private int[] getMinLow(int[][] matrix) {
        //行长
        int m = matrix.length;
        //结果
        int[] res = new int[m];
        //遍历行
        for (int i = 0; i < matrix.length; i++) {
            //最小值
            int min = Integer.MAX_VALUE;
            //遍历列
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min,matrix[i][j]);
            }
            //当前行的最小值
            res[i] = min;
        }
        return res;
    }
}
