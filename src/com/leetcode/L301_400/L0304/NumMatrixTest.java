package com.leetcode.L301_400.L0304;

public class NumMatrixTest {
    public static void main(String[] args) {
        /**
         * 示例 1：
         * 输入:
         * ["NumMatrix","sumRegion","sumRegion","sumRegion"]
         * [[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]]
         * 输出:
         * [null, 8, 11, 12]
         * 解释:
         * NumMatrix numMatrix = new NumMatrix([[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]]);
         * numMatrix.sumRegion(2, 1, 4, 3); // return 8 (红色矩形框的元素总和)
         * numMatrix.sumRegion(1, 1, 2, 2); // return 11 (绿色矩形框的元素总和)
         * numMatrix.sumRegion(1, 2, 2, 4); // return 12 (蓝色矩形框的元素总和)
         */
        NumMatrix numMatrix = new NumMatrix(new int[][]{
                {3,0,1,4,2},
                {5,6,3,2,1},
                {1,2,0,1,5},
                {4,1,0,1,7},
                {1,0,3,0,5}
        });

        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
    }
}
