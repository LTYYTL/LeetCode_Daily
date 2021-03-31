package com.leetcode.L0054;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 *
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 *
 * 示例 2：
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * 提示：
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 */
public class SpiralMatrix {
    /**
     * 方法：模拟
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        //结果集合
        List<Integer> res = new ArrayList<>();
        //四周边值
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int down = matrix.length - 1;
        while (true){
            //从左往右
            for (int i = left; i <= right; ++i){
                res.add(matrix[top][i]);
            }
            //上层加入集合，改变上边值
            top++;
            //判断越界
            if (top > down) break;

            //从上往下
            for (int i = top; i <= down; ++i){
                res.add(matrix[i][right]);
            }
            //右边加入集合，改变右边值
            right--;
            //判断越界
            if (right < left) break;

            //从右往左
            for (int i = right; i >= left; --i){
                res.add(matrix[down][i]);
            }
            //下层加入集合，改变下边值
            down--;
            //判断越界
            if (down < top) break;

            //从下往上
            for (int i = down; i >= top; --i){
                res.add(matrix[i][left]);
            }
            //左边加入集合，改变左边值
            left++;
            //判断越界
            if (left > right) break;

        }
        return res;
    }
}
