package com.leetcode.L0088;

import java.util.Arrays;

public class MergeSortedArrayTest {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        /*** 示例 1：
         * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
         * 输出：[1,2,2,3,5,6]
         */
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedArray.merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
        /**
         * 示例 2：
         * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
         * 输出：[1]
         */
    }
}
