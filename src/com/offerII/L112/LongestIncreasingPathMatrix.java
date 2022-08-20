package com.offerII.L112;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 剑指 Offer II 112. 最长递增路径
 * 给定一个 m x n 整数矩阵 matrix ，找出其中 最长递增路径 的长度。
 * 对于每个单元格，你可以往上，下，左，右四个方向移动。 不能 在 对角线 方向上移动或移动到 边界外（即不允许环绕）。
 *
 * 示例 1：
 * 输入：matrix = [[9,9,4],[6,6,8],[2,1,1]]
 * 输出：4
 * 解释：最长递增路径为 [1, 2, 6, 9]。
 *
 * 示例 2：
 * 输入：matrix = [[3,4,5],[3,2,6],[2,2,1]]
 * 输出：4
 * 解释：最长递增路径是 [3, 4, 5, 6]。注意不允许在对角线方向上移动。
 *
 * 示例 3：
 * 输入：matrix = [[1]]
 * 输出：1
 *
 * 提示：
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 200
 * 0 <= matrix[i][j] <= 231 - 1
 *
 * 注意：本题与主站 329 题相同： <a href="https://leetcode-cn.com/problems/longest-increasing-path-in-a-matrix/">https://leetcode-cn.com/problems/longest-increasing-path-in-a-matrix/</a>
 */
public class LongestIncreasingPathMatrix {
    /**
     * 方法：动态规划
     * @param matrix
     * @return
     */
    public int longestIncreasingPath(int[][] matrix) {
        //长度
        int m = matrix.length;
        int n = matrix[0].length;
        //将大的放在前面
        Queue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[2]-o1[2]);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                queue.offer(new int[]{i,j,matrix[i][j]});
            }
        }

        int[][] dp = new int[m][n];
        //默认1
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i],1);
        }
        //结果
        int res = 0;
        //四个方向
        int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};
        //遍历
        while (!queue.isEmpty()){
            //获取队头元素
            int[] cur = queue.poll();
            int i = cur[0];
            int j = cur[1];
            int val = cur[2];
            //四个方向
            for (int[] di : dis) {
                int x = i + di[0];
                int y = j + di[1];
                if (x >= 0 && y >= 0 && x < m && y < n && matrix[x][y] > matrix[i][j]) {
                    // 没有越界且相邻的节点值比当前节点大，就可以从它转移而来
                    dp[i][j] = Math.max(dp[i][j], dp[x][y] + 1);
                }
            }
            // 记录所有节点出发的最大值
            res = Math.max(res,dp[i][j]);
        }
        return res;
    }
}
