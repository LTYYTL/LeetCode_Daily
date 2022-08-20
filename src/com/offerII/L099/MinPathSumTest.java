package com.offerII.L099;

public class MinPathSumTest {
    public static void main(String[] args) {
        MinPathSum minPathSum = new MinPathSum();
        /*
          示例 1：
          输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
          输出：7
          解释：因为路径 1→3→1→1→1 的总和最小。
         */
        System.out.println(minPathSum.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        /*
          示例 2：
          输入：grid = [[1,2,3],[4,5,6]]
          输出：12
         */
        System.out.println(minPathSum.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
