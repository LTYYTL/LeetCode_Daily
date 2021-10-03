package com.leetcode.L1_100.L0081;

public class SearchRotatedSortedArrayIITest {
    public static void main(String[] args) {
        SearchRotatedSortedArrayII searchRotatedSortedArrayII = new SearchRotatedSortedArrayII();
        /** * 示例 1：
         * 输入：nums = [2,5,6,0,0,1,2], target = 0
         * 输出：true
         */
        System.out.println(searchRotatedSortedArrayII.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        /**
         * 示例 2：
         * 输入：nums = [2,5,6,0,0,1,2], target = 3
         * 输出：false
         */
        System.out.println(searchRotatedSortedArrayII.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
    }
}
