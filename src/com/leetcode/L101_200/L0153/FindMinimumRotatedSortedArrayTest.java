package com.leetcode.L101_200.L0153;

public class FindMinimumRotatedSortedArrayTest {
    public static void main(String[] args) {
        FindMinimumRotatedSortedArray findMinimumRotatedSortedArray = new FindMinimumRotatedSortedArray();
        /* 示例 1：
         输入：nums = [3,4,5,1,2]
         输出：1
         解释：原数组为 [1,2,3,4,5] ，旋转 3 次得到输入数组。
         */
        System.out.println(findMinimumRotatedSortedArray.findMin(new int[]{3, 4, 5, 1, 2}));
        /*
          示例 2：
          输入：nums = [4,5,6,7,0,1,2]
          输出：0
          解释：原数组为 [0,1,2,4,5,6,7] ，旋转 4 次得到输入数组。
         */
        System.out.println(findMinimumRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        /*
          示例 3：
          输入：nums = [11,13,15,17]
          输出：11
          解释：原数组为 [11,13,15,17] ，旋转 4 次得到输入数组。
         */
        System.out.println(findMinimumRotatedSortedArray.findMin(new int[]{11, 13, 15, 17}));
    }
}
