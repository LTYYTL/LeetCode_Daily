package com.leetcode.L501_600.L0540;

public class SingleElementSortedArrayTest {
    public static void main(String[] args) {
        SingleElementSortedArray singleElementSortedArray = new SingleElementSortedArray();
        /**
         * 示例 1:
         * 输入: nums = [1,1,2,3,3,4,4,8,8]
         * 输出: 2
         */
        System.out.println(singleElementSortedArray.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(singleElementSortedArray.singleNonDuplicate_binary(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        /**
         * 示例 2:
         * 输入: nums =  [3,3,7,7,10,11,11]
         * 输出: 10
         */
        System.out.println(singleElementSortedArray.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
        System.out.println(singleElementSortedArray.singleNonDuplicate_binary(new int[]{3, 3, 7, 7, 10, 11, 11}));
    }
}
