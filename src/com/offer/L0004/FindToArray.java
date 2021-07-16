package com.offer.L0004;

/**
 * 剑指 Offer 04. 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 示例:
 * 现有矩阵 matrix 如下：
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 *
 * 限制：
 * 0 <= n <= 1000
 * 0 <= m <= 1000
 * 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 */
public class FindToArray {
    /**
     * 方法一：暴力法
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //特殊情况
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    /**
     * 方法二：数学
     * 解题思路：从二维数组的右上角开始查找。
     *      （1）如果当前元素等于目标值，则返回 true。
     *      （2）如果当前元素大于目标值，则移到左边一列。
     *      （3）如果当前元素小于目标值，则移到下边一行。
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray_feature(int[][] matrix, int target) {
        //特殊情况
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while (i < m && j >= 0){
            int cur = matrix[i][j];
            if (cur < target){
                i++;
            }else if(cur > target){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
}
