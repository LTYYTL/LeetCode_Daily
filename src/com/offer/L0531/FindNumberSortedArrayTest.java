package com.offer.L0531;

public class FindNumberSortedArrayTest {

    public static void main(String[] args) {
        FindNumberSortedArrayI findNumberSortedArrayI = new FindNumberSortedArrayI();
        /*
          示例 1:
          输入: nums = [5,7,7,8,8,10], target = 8
          输出: 2
         */
        System.out.println(findNumberSortedArrayI.search(new int[]{5, 7, 7, 8, 8, 10}, 8));
        /*
          示例 2:
          输入: nums = [5,7,7,8,8,10], target = 6
          输出: 0
         */
        System.out.println(findNumberSortedArrayI.search(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }
}
