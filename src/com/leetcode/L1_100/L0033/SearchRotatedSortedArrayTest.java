package com.leetcode.L1_100.L0033;

public class SearchRotatedSortedArrayTest {
    public static void main(String[] args) {
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        /**
         * 示例 1：
         * 输入：nums = [4,5,6,7,0,1,2], target = 0
         * 输出：4
         */
        System.out.println(searchRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(searchRotatedSortedArray.search_binary(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        /**
         * 示例 2：
         * 输入：nums = [4,5,6,7,0,1,2], target = 3
         * 输出：-1
         */
        System.out.println(searchRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println(searchRotatedSortedArray.search_binary(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        /**
         * 示例 3：
         * 输入：nums = [1], target = 0
         * 输出：-1
         */
        System.out.println(searchRotatedSortedArray.search(new int[]{1}, 0));
        System.out.println(searchRotatedSortedArray.search_binary(new int[]{1}, 0));
    }
}
