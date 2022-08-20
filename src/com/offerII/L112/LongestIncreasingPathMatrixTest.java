package com.offerII.L112;

public class LongestIncreasingPathMatrixTest {
    public static void main(String[] args) {
        LongestIncreasingPathMatrix longestIncreasingPathMatrix = new LongestIncreasingPathMatrix();
        /*
          示例 1：
          输入：matrix = [[9,9,4],[6,6,8],[2,1,1]]
          输出：4
          解释：最长递增路径为 [1, 2, 6, 9]。
         */
        System.out.println(longestIncreasingPathMatrix.longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}}));
        /*
          示例 2：
          输入：matrix = [[3,4,5],[3,2,6],[2,2,1]]
          输出：4
          解释：最长递增路径是 [3, 4, 5, 6]。注意不允许在对角线方向上移动。
         */
        System.out.println(longestIncreasingPathMatrix.longestIncreasingPath(new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}}));
        /*
          示例 3：
          输入：matrix = [[1]]
          输出：1
         */
        System.out.println(longestIncreasingPathMatrix.longestIncreasingPath(new int[][]{{1}}));
    }
}
