package com.leetcode.L0169;

public class MajorityElementTest {
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        /**
         * 示例 1：
         * 输入：[3,2,3]
         * 输出：3
         */
        System.out.println(majorityElement.majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement.majorityElement_sort(new int[]{3, 2, 3}));
        System.out.println(majorityElement.majorityElement_moore(new int[]{3, 2, 3}));
        /**
         * 示例 2：
         * 输入：[2,2,1,1,1,2,2]
         * 输出：2
         */
        System.out.println(majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(majorityElement.majorityElement_sort(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(majorityElement.majorityElement_moore(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
