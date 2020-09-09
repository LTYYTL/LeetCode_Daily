package com.leetcode.L0064;

/**
 * 64. 最小路径和
 * 给定一个包含非负整数的 m x n网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 */
public class MinPathSum {
    /**
     * 方法一：动态规划
     * 时间复杂度：O(mn)，其中 m 和 n 分别是网格的行数和列数。需要对整个网格遍历一次，计算 dp 的每个元素的值。
     * 空间复杂度：O(mn)，其中 m 和 n 分别是网格的行数和列数。创建一个二维数组 dp，和网格大小相同。
     *
     * 动态方程分析：dp[i][j]表示到此点的最小路径和
     *
     * 1、每次只能向下或者向右移动一步，所以dp[i][j]的值与此点的上位置（i，j-1）和右位置（i-1，j）的数有关,我们在这两个位置中选择一个路径和较小的来进行转移
     * 即：dp[i][j] = min(dp[i][j-1],dp[i-1][j])+grid[i][j]
     *
     * 2、当i=0时（位于最上层时），没有（i-1，j）位置,所以dp[i][j]的值只与此点的右位置（i，j-1）有关
     * 即：dp[0][j] = dp[0][j-1] + grid[0][j];
     *
     * 3、当j=0时（位于最左侧），没有（i,j-1）位置，所以dp[i][j]的值只与此点的上位置（i-1，j）有关
     * 即：dp[i][0] = dp[i-1][0] + grid[i][0]
     *
     * 4、所有都从（0，0）出发，dp[0][0] = grid[0][0]
     *
     * @param grid  二维的网格数组
     * @return  到右下角的最小路径和
     */
    public int minPathSum(int[][] grid) {
        //行数
        int row = grid.length;
        //列数
        int column = grid[0].length;
        //网格数组为空的情况
        if ( grid == null || row == 0 || column == 0)
            return 0;
        //构建状态数组，dp[i][j]表示到此点的最小路径和
        int[][] dp = new int[row][column];
        //（0，0）点的dp
        dp[0][0] = grid[0][0];
        //计算最左侧的dp[i][0]
        for (int i = 1; i < row; ++i){
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        //计算最上层的dp[0][j]
        for (int j = 1; j < column; ++j){
            dp[0][j] = dp[0][j-1] + grid[0][j-1];
        }
        //计算除去最上层和最左侧的dp[i][j]
        for (int i = 1; i < column; ++i){
            for (int j = 1; j < row; ++j){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        //返回右下角的最小路径和
        return dp[row - 1][column - 1];
    }

    /**
     * 方法二：动态规划 + 空间优化（原地修改）
     * 时间复杂度 O(M×N) ： 遍历整个 grid 矩阵元素。
     * 空间复杂度 O(1) ： 直接修改原矩阵，不使用额外空间。
     *
     * 其实我们完全不需要建立 dp 矩阵浪费额外空间，直接遍历 grid[i][j]] 修改即可。
     * 这是因为：grid[i][j] = min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j] ；
     * 原 grid 矩阵元素中被覆盖为 dp 元素后（都处于当前遍历点的左上方），不会再被使用到。
     *
     * @param grid  二维的网格数组
     * @return  到右下角的最小路径和
     */
    public int minPathSum_zeroStructure(int[][] grid) {
        //行数
        int row = grid.length;
        //列数
        int column = grid[0].length;
        //网格数组为空的情况
        if ( grid == null || row == 0 || column == 0)
            return 0;
        //计算状态数组
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < column; ++j){
                if (i == 0 && j == 0)//（0，0）点
                    continue;
                else if (i == 0)//最上层的点
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                else if (j == 0)//最左侧的点
                    grid[i][j] = grid[i-1][j] + grid[i][j];
                else//除去最上层和最左侧的点
                    grid[i][j] = Math.min(grid[i][j - 1],grid[i - 1][j]) + grid[i][j];
            }
        }
        //返回右下角的最小路径和
        return grid[row -  1][column - 1];
    }

    /**
     * 方法三：动态规划 + 动态规划（一维数组）
     * 时间复杂度 O(M×N) ： 遍历整个 grid 矩阵元素。
     * 空间复杂度 O(n) ： 创建一个一维数组 dp，和网格列一样大。
     *
     * 其实我们可以建立一个一维的 dp
     * 这是因为：每一个点只与其上和左有关系 ，即：可以让dp在一行结束后存储本行的最小路径和 ；
     * 故：dp[i] = min(dp[i-1],dp[i]) + grid[i][j],其中dp[i-1]表示当前点左侧的点，dp[i]表示当前点上面的点
     *
     * @param grid  二维的网格数组
     * @return  到右下角的最小路径和
     */
    public int minPathSum_OneStructure(int[][] grid) {
        //行数
        int row = grid.length;
        //列数
        int column = grid[0].length;
        //网格数组为空的情况
        if ( grid == null || row == 0 || column == 0)
            return 0;
        //构建状态数组dp,dp[i]表示到此点的最小路径和
        int[] dp = new int[column];
        //（0，0）的dp
        dp[0] = grid[0][0];
        //最上层的点
        for (int i = 1; i < column; ++i){
            dp[i] = dp[i -1] + grid[0][i];
        }
        //每次循环后dp存储的只有本行的
        for (int i = 1; i < row; ++i){
            //每层最左侧的点
            dp[0] = dp[0] + grid[i][0];
            //计算本行除去左侧点的dp
            for (int j = 1; j < column; ++j){
                dp[j] = Math.min(dp[j-1],dp[j]) + grid[i][j];
            }
        }
        //返回右下角的最小路径和
        return dp[column - 1];
    }
}
