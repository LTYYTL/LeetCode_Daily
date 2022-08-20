package com.leetcode.L901_1000.L0977;

import java.util.Arrays;

public class SquaresSortedArrayTest {
    public static void main(String[] args) {
        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        /*
          示例 1：
          输入：[-4,-1,0,3,10]
          输出：[0,1,9,16,100]
         */
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(squaresSortedArray.sortedSquares(nums1)));
        /*
          示例 2：
          输入：[-7,-3,2,3,11]
          输出：[4,9,9,49,121]
         */
        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(squaresSortedArray.sortedSquares(nums2)));
    }
}
