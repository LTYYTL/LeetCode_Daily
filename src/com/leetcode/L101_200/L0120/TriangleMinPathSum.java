package com.leetcode.L101_200.L0120;

import java.util.List;

/**
 * 120. 三角形最小路径和
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 *
 * 例如，给定三角形：
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 *
 * 说明：
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 */
public class TriangleMinPathSum {
    /**
     * 方法一：动态规划
     * 时间复杂度：O(n^2),其中 nn 是三角形的行数。
     * 空间复杂度：O(n^2)。我们需要一个 n*n 的二维数组存放所有的状态。
     *
     * 动态方程分析：dp[i][j]表示到此点的最小路径和,c[i][j]表示当前的值
     *
     * 1、由于每一步只能移动到下一行「相邻的节点」上，因此要想走到位置 (i, j)，上一步就只能在位置 (i-1,j-1)或者位置 (i-1,j)。我们在这两个位置中选择一个路径和较小的来进行转移
     * 状态方程为：dp[i][j] = min(dp[i-1][j],d[i-1][j-1])+c[i][j]
     *
     * 2、最左侧的点，即j=0,没有（i,j-1）的位置
     * 状态方程：dp[i][0] = dp[i-1][0] + c[i][j]
     *
     * 3、每一行最右面的点，即i=j,没有（i-1,j）的位置
     * 状态方程：dp[i][i] = dp[i-1][j-1] + c[i][j]
     *
     * 4、顶点状态方程：dp[0][0] = c[0][0]
     *
     * @param triangle  三角形
     * @return  最小路径和
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        //获取长度
        int n = triangle.size();
        //构建状态数组，dp[i][j]表示到此点的最小路径和
        int[][] dp = new int[n][n];
        //顶点的最短路径为本身
        dp[0][0] = triangle.get(0).get(0);
        //计算每层的每个点的dp[i][j]
        for (int i = 1; i < n; ++i ){
            //最左侧的点的状态方程
            dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
            //计算每层除去最左侧和最右侧的两个点之后的dp[i][j]
            for (int j = 1; j < i; ++j)
                dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]) + triangle.get(i).get(j);
            //最右侧的点的状态方程
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }
        //通过查询最后一层的dp的最小值,可找到自顶向下的最小路径和
        int min = dp[n-1][0];
        for (int i = 1; i < n; ++i)
            //获取最小值
            min = Math.min(min,dp[n-1][i]);
        return min;
    }

    /**
     * 方法二：动态规划+空间优化（一维数组）
     * 时间复杂度：O(n^2)，其中 n 是三角形的行数。
     * 空间复杂度：O(n)。
     *
     * 动态方程分析：c[i][j]表示当前的值
     * 从顶点到底部的最小路径和，只用关心最后的最小路径和即可，中间的状态可以不用过多的存储
     * 即dp[i][j]与dp[i-1][...]有关，与dp[i-1][...]的以上状态无关
     * 故dp[i]表示从顶点到该点的最终的最小路径和
     *
     * @param triangle 三角形
     * @return 最小路径和
     */
    public int minimumTotal_structure(List<List<Integer>> triangle) {
        //获得长度
        int n = triangle.size();
        //构建状态数组，dp[i]表示到此点的最小路径和
        int[] dp = new int[n];
        //顶点的最短路径为本身
        dp[0] = triangle.get(0).get(0);
        //从1层开始计算每一层的dp[i]，每一次循环结束，dp[i]表示从顶点到当前层的最小路径和
        for (int i = 1; i < n; ++i){
            //最右侧点的最小路径和：上一层最右侧点最小路径和+该点的值
            dp[i] = dp[i-1] + triangle.get(i).get(i);
            //从后往前，逐个计算
            for (int j = i - 1; j > 0; --j){
                dp[j] = Math.min(dp[j],dp[j-1]) +triangle.get(i).get(j);
            }
            //最左侧的最小路径和：上一层最左侧点最小路径和+该点的值
            dp[0] += triangle.get(i).get(0);
        }

        //通过查询最后一层的dp的最小值,可找到自顶向下的最小路径和
        int min = dp[0];
        for (int nums : dp) {
            //获得最小值
            min = Math.min(min,nums);
        }
        return min;
    }

}
