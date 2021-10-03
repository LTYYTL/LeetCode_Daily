package com.leetcode.L1_100.L0074;

/**
 * 74. 搜索二维矩阵
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 1、每行中的整数从左到右按升序排列。
 * 2、每行的第一个整数大于前一行的最后一个整数。
 *
 * 示例 1：
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 *
 * 示例 2：
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 *
 * 提示：
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 */
public class Search2DMatrix {
    /**
     * 方法:二分法
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;
        while (low <= high){
            int mid = (high - low)/ 2 + low;
            int x = matrix[mid / n][mid % n];
            if (x < target){
                low = mid + 1;
            }else if (x > target){
                high = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
