package com.offerII.L098;

import java.util.Arrays;

/**
 * 剑指 Offer II 098. 路径的数目
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 *
 * 示例 1：
 * 输入：m = 3, n = 7
 * 输出：28
 *
 * 示例 2：
 * 输入：m = 3, n = 2
 * 输出：3
 * 解释：
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向下
 *
 * 示例 3：
 * 输入：m = 7, n = 3
 * 输出：28
 *
 * 示例 4：
 * 输入：m = 3, n = 3
 * 输出：6
 *
 * 提示：
 * 1 <= m, n <= 100
 * 题目数据保证答案小于等于 2 * 109
 *
 * 注意：本题与主站 62 题相同： https://leetcode-cn.com/problems/unique-paths/
 */
public class UniquePaths {
    /**
     * 方法一：动态规划
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //每个都为1
        for (int i = 0; i < m; i++){
            Arrays.fill(dp[i],1);
        }
        //当前的路径数是左边和上边的路径和
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }

    /**
     * 方法二：数学
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths_math(int m, int n) {
        long res = 1;
        for (int i = n, j = 1; j < m; i++,j++) {
            res = res * i / j;
        }

        return (int) res;
    }
}
