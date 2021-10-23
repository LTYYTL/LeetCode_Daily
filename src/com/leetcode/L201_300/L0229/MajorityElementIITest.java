package com.leetcode.L201_300.L0229;

public class MajorityElementIITest {
    public static void main(String[] args) {
        MajorityElementII majorityElementII = new MajorityElementII();
        /**
         * 示例 1：
         * 输入：[3,2,3]
         * 输出：[3]
         */
        System.out.println(majorityElementII.majorityElement(new int[]{3, 2, 3}));
        /**
         * 示例 2：
         * 输入：nums = [1]
         * 输出：[1]
         */
        System.out.println(majorityElementII.majorityElement(new int[]{1}));
        /**
         * 示例 3：
         * 输入：[1,1,1,3,3,2,2,2]
         * 输出：[1,2]
         */
        System.out.println(majorityElementII.majorityElement(new int[]{1, 1, 1, 3, 3, 2, 2, 2}));
    }
}
