package com.leetcode.L3001_3100.L3046;

public class ArraySplitterTest {
    public static void main(String[] args) {
        ArraySplitter arraySplitter = new ArraySplitter();
        /*
         * 示例 1：
         * 输入：nums = [1,1,2,2,3,4]
         * 输出：true
         * 解释：分割 nums 的可行方案之一是 nums1 = [1,2,3] 和 nums2 = [1,2,4] 。
         */
        System.out.println(arraySplitter.isPossibleToSplit(new int[]{1, 1, 2, 2, 3, 4}));
        /*
         * 示例 2：
         * 输入：nums = [1,1,1,1]
         * 输出：false
         * 解释：分割 nums 的唯一可行方案是 nums1 = [1,1] 和 nums2 = [1,1] 。但 nums1 和 nums2 都不是由互不相同的元素构成。因此，返回 false 。
         */
        System.out.println(arraySplitter.isPossibleToSplit(new int[]{1, 1, 1, 1}));

    }
}
