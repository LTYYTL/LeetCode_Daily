package com.leetcode.L201_300.L0240;

/**
 * 240. 搜索二维矩阵 II
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *
 * 示例 1：
 * 输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
 * 输出：true
 *
 * 示例 2：
 * 输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
 * 输出：false
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

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] == target)
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
