package com.leetcode.L201_300.L0221;

/**
 * 221. 最大正方形
 * 在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。
 *
 * 示例 1：
 * 输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 * 输出：4
 *
 * 示例 2：
 * 输入：matrix = [["0","1"],["1","0"]]
 * 输出：1
 *
 * 示例 3：
 * 输入：matrix = [["0"]]
 * 输出：0
 *
 * 提示：
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 300
 * matrix[i][j] 为 '0' 或 '1'
 */
public class MaxSquare {
    /**
     * 方法：动态规划
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) return 0;
        //长度
        int m = matrix.length;
        int n = matrix[0].length;
        //dp[i][j]:以当前位置为右下角组成正方形的边长
        int[][] dp = new int[m+1][n+1];
        int max = 0;
        //遍历
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //当前是1
                if (matrix[i-1][j-1] == '1'){
                    //附近的最小边
                    dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1])) + 1;
                }
                //最大边长
                max = Math.max(dp[i][j],max);
            }
        }

        return max * max;
    }
}
