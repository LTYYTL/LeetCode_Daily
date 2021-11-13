package com.interview.L0108;

/**
 * 面试题 01.08. 零矩阵
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 *
 * 示例 1：
 * 输入：
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * 输出：
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 *
 * 示例 2：
 * 输入：
 * [
 *   [0,1,2,0],
 *   [3,4,5,2],
 *   [1,3,1,5]
 * ]
 * 输出：
 * [
 *   [0,0,0,0],
 *   [0,4,5,0],
 *   [0,3,1,0]
 * ]
 */
public class ZeroMatrix {
    /**
     * 方法：模拟
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        //记录变成零的标志
        boolean[][] vis = new boolean[matrix.length][matrix[0].length];

        //遍历
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //当前是0且不是变成的零
                if (matrix[i][j] == 0 && !vis[i][j])
                    setZeroes(matrix,vis,i,j);
            }
        }
    }

    /**
     * 改变矩阵0
     * @param matrix
     * @param vis
     * @param i
     * @param j
     */
    private void setZeroes(int[][] matrix, boolean[][] vis, int i, int j) {
        //行定，遍历列
        for (int x = 0; x < matrix[0].length; x++) {
            //本身不等于0，变成0，改变标志位
            if (matrix[i][x] != 0) {
                matrix[i][x] = 0;
                vis[i][x] = true;
            }
        }

        //列定，遍历行
        for (int y = 0; y < matrix.length; y++) {
            //本身不等于0，变成0，改变标志位
            if (matrix[y][j] != 0){
                matrix[y][j] = 0;
                vis[y][j] = true;
            }
        }
    }
}
