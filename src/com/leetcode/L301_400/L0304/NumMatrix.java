package com.leetcode.L301_400.L0304;

/**
 * 304. 二维区域和检索 - 矩阵不可变
 * 给定一个二维矩阵 matrix，以下类型的多个请求：
 * 计算其子矩形范围内元素的总和，该子矩阵的 左上角 为 (row1, col1) ，右下角 为 (row2, col2) 。
 *
 * 实现 NumMatrix 类：
 * (1)NumMatrix(int[][] matrix) 给定整数矩阵 matrix 进行初始化
 * (2)int sumRegion(int row1, int col1, int row2, int col2) 返回 左上角 (row1, col1) 、右下角 (row2, col2) 所描述的子矩阵的元素 总和 。
 *
 * 示例 1：
 * 输入:
 * ["NumMatrix","sumRegion","sumRegion","sumRegion"]
 * [[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]]
 * 输出:
 * [null, 8, 11, 12]
 * 解释:
 * NumMatrix numMatrix = new NumMatrix([[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]]);
 * numMatrix.sumRegion(2, 1, 4, 3); // return 8 (红色矩形框的元素总和)
 * numMatrix.sumRegion(1, 1, 2, 2); // return 11 (绿色矩形框的元素总和)
 * numMatrix.sumRegion(1, 2, 2, 4); // return 12 (蓝色矩形框的元素总和)
 *
 * 提示：
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 200
 * -105 <= matrix[i][j] <= 105
 * 0 <= row1 <= row2 < m
 * 0 <= col1 <= col2 < n
 * 最多调用 104 次 sumRegion 方法
 */
public class NumMatrix {
    /**
     * 方法：前缀和
     */
    //记录和
    private int[][] sum;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 || n == 0)
            return;
        sum = new int[m+1][n+1];
        //记录每一行的前缀和
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n ; j++) {
                sum[i][j] = matrix[i-1][j-1] + sum[i-1][j] + sum[i][j-1] + sum[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[col2+1][row2+1] - sum[row1][col2+1] - sum[row2+1][col1] - sum[row1][col1];
    }
}
