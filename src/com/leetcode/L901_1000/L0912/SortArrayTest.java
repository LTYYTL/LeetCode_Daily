package com.leetcode.L901_1000.L0912;

import java.util.Arrays;

public class SortArrayTest {
    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        /**
         * 示例 1：
         * 输入：nums = [5,2,3,1]
         * 输出：[1,2,3,5]
         */
        System.out.println(Arrays.toString(sortArray.sortArray(new int[]{5, 2, 3, 1})));
        /**
         * 示例 2：
         * 输入：nums = [5,1,1,2,0,0]
         * 输出：[0,0,1,1,2,5]
         */
        System.out.println(Arrays.toString(sortArray.sortArray(new int[]{5, 1, 1, 2, 0, 0})));
    }
}
