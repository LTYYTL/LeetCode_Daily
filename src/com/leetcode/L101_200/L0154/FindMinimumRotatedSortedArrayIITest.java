package com.leetcode.L101_200.L0154;

public class FindMinimumRotatedSortedArrayIITest {
    public static void main(String[] args) {
        FindMinimumRotatedSortedArrayII findMinimumRotatedSortedArrayII = new FindMinimumRotatedSortedArrayII();
        /*
          示例 1：
          输入：nums = [1,3,5]
          输出：1
         */
        System.out.println(findMinimumRotatedSortedArrayII.findMin(new int[]{1, 3, 5}));
        /*
          示例 2：
          输入：nums = [2,2,2,0,1]
          输出：0
         */
        System.out.println(findMinimumRotatedSortedArrayII.findMin(new int[]{2, 2, 2, 0, 1}));
    }
}
