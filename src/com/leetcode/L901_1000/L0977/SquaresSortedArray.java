package com.leetcode.L901_1000.L0977;

import java.util.Arrays;

/**
 * 977. 有序数组的平方
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 * 示例 1：
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 *
 * 示例 2：
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *
 * 提示：
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 */
public class SquaresSortedArray {
    /**
     * 方法一：暴力法
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        //计算每个数的平方
        for(int i = 0; i < A.length; ++i){
            A[i] = A[i] * A[i];
        }
        //排序
        Arrays.sort(A);
        return A;
    }
}
