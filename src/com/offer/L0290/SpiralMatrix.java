package com.offer.L0290;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 *
 * 示例 2：
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * 限制：
 * 0 <= matrix.length <= 100
 * 0 <= matrix[i].length <= 100
 * 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/
 */
public class SpiralMatrix {
    /**
     * 方法：模拟
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {
        //特殊情况
        if (matrix.length == 0)
            return new int[0];
        //边界值
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        //结果
        int[] res = new int[(right+1)*(bottom+1)];
        //索引
        int index = 0;
        while (true){
            //从左向右
            for (int i = left; i <= right; ++i){
                res[index++] = matrix[top][i];
            }
            //上层加入集合，改变上边值
            //判断越界
            if (++top > bottom)
                break;

            //从上向下
            for (int i = top; i <= bottom; ++i){
                res[index++] = matrix[i][right];
            }
            //左层加入集合，改变左边值
            //判断越界
            if (--right < left)
                break;

            //从右向左
            for (int i = right; i >= left; --i){
                res[index++] = matrix[bottom][i];
            }
            //下层加入集合，改变下边值
            //判断越界
            if (--bottom < top)
                break;

            //从上向下
            for (int i = bottom; i >= top; --i){
                res[index++] = matrix[i][left];
            }
            //左层加入集合，改变左边值
            //判断越界
            if (++left > right)
                break;
        }
        return res;
    }
}
