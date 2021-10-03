package com.leetcode.L301_400.L0347;

import java.util.Arrays;

public class KHightElementTest {
    public static void main(String[] args) {
        KHighElement kHighElement = new KHighElement();
        /**
         * 示例 1:
         * 输入: nums = [1,1,1,2,2,3], k = 2
         * 输出: [1,2]
         */
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(kHighElement.topKFrequent(nums,2)));

        /**
         * 示例 2:
         * 输入: nums = [1], k = 1
         * 输出: [1]
         */
        int[] nums1 = {1};
        System.out.println(Arrays.toString(kHighElement.topKFrequent(nums1,1)));
    }
}
