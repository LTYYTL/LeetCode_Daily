package com.leetcode.L401_500.L0442;

public class FindDuplicatesArrayTest {
    public static void main(String[] args) {
        FindDuplicatesArray findDuplicatesArray = new FindDuplicatesArray();
        /**
         * 示例 1：
         * 输入：nums = [4,3,2,7,8,2,3,1]
         * 输出：[2,3]
         */
        System.out.println(findDuplicatesArray.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        /**
         * 示例 2：
         * 输入：nums = [1,1,2]
         * 输出：[1]
         */
        System.out.println(findDuplicatesArray.findDuplicates(new int[]{1, 1, 2}));
        /**
         * 示例 3：
         * 输入：nums = [1]
         * 输出：[]
         */
        System.out.println(findDuplicatesArray.findDuplicates(new int[]{1}));
    }
}
