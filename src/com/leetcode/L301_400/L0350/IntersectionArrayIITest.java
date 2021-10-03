package com.leetcode.L301_400.L0350;

import java.util.Arrays;

public class IntersectionArrayIITest {
    public static void main(String[] args) {
        IntersectionArrayII intersectionArrayII = new IntersectionArrayII();
        /**
         * 示例 1：
         * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
         * 输出：[2,2]
         */
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        //方法一：set集合
        System.out.println(Arrays.toString(intersectionArrayII.intersect(nums1,nums2)));
        //方法二：双指针
        System.out.println(Arrays.toString(intersectionArrayII.intersect_doublePointer(nums1,nums2)));

        /**
         * 示例 2：
         * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
         * 输出：[9,4]
         */
        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        //方法一：set集合
        System.out.println(Arrays.toString(intersectionArrayII.intersect(nums3,nums4)));
        //方法二：双指针
        System.out.println(Arrays.toString(intersectionArrayII.intersect_doublePointer(nums3,nums4)));
    }
}
