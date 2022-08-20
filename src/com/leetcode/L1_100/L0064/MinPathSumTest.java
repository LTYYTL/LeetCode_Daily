package com.leetcode.L1_100.L0064;

public class MinPathSumTest {

    public static void main(String[] args) {
        MinPathSum minPathSum = new MinPathSum();
        /*
          示例:
          输入:
          [
            [1,3,1],
            [1,5,1],
            [4,2,1]
          ]
          输出: 7
          解释: 因为路径 1→3→1→1→1 的总和最小。
         */
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        //方法一：动态规划
        System.out.println(minPathSum.minPathSum(grid));
        //方法三：动态规划 + 空间优化（一维数组）（此方法要在方法二之前，因为方法二会修改grid数组）
        System.out.println(minPathSum.minPathSum_OneStructure(grid));
        //方法二：动态规划 + 空间优化（原地修改）
        System.out.println(minPathSum.minPathSum_zeroStructure(grid));
    }
}
