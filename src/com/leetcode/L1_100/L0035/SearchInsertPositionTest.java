package com.leetcode.L1_100.L0035;

public class SearchInsertPositionTest {
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        /*
          示例 1:
          输入: nums = [1,3,5,6], target = 5
          输出: 2
         */
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        /*
          示例 2:
          输入: nums = [1,3,5,6], target = 2
          输出: 1
         */
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        /*
          示例 3:
          输入: nums = [1,3,5,6], target = 7
          输出: 4
         */
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        /*
          示例 4:
          输入: nums = [1,3,5,6], target = 0
          输出: 0
         */
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
        /*
          示例 5:
          输入: nums = [1], target = 0
          输出: 0
         */
        System.out.println(searchInsertPosition.searchInsert(new int[]{1}, 0));
    }
}
