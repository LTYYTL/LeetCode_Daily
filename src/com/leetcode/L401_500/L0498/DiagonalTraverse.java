package com.leetcode.L401_500.L0498;

/**
 * 498. 对角线遍历
 * 给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
 * <p>
 * 示例 1：
 * 输入：mat = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,4,7,5,3,6,8,9]
 * <p>
 * 示例 2：
 * 输入：mat = [[1,2],[3,4]]
 * 输出：[1,2,3,4]
 * <p>
 * 提示：
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 104
 * 1 <= m * n <= 104
 * -105 <= mat[i][j] <= 105
 */
public class DiagonalTraverse {
    /**
     * 方法：模拟
     *
     * @param mat
     * @return
     */
    public int[] findDiagonalOrder(int[][] mat) {
        //长度
        int m = mat.length;
        int n = mat[0].length;
        //结果
        int[] res = new int[m * n];
        //索引
        int index = 0;
        //遍历m+n-1个对角线
        for (int i = 0; i < m + n - 1; i++) {
            //偶数判断起始位置
            if (i % 2 == 0) {
                //获取坐标
                int x = Math.min(i, m - 1);
                int y = i - x;
                //对角线遍历
                while (y < n && x >= 0) {
                    res[index++] = mat[x][y];
                    x--;
                    y++;
                }
            } else {
                //获取坐标
                int y = Math.min(i, n - 1);
                int x = i - y;
                //对角线遍历
                while (y >= 0 && x < m) {
                    res[index++] = mat[x][y];
                    x++;
                    y--;
                }
            }
        }
        return res;
    }
}
