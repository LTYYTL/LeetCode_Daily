package com.leetcode.L701_800.L0704;

public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        /** * 示例 1:
         * 输入: nums = [-1,0,3,5,9,12], target = 9
         * 输出: 4
         * 解释: 9 出现在 nums 中并且下标为 4
         */
        System.out.println(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        /**
         * 示例 2:
         * 输入: nums = [-1,0,3,5,9,12], target = 2
         * 输出: -1
         * 解释: 2 不存在 nums 中因此返回 -1
         */
        System.out.println(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
