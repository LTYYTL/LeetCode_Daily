package com.leetcode.L901_1000.L0961;

public class RepeatedElementArrayTest {
    public static void main(String[] args) {
        RepeatedElementArray repeatedElementArray = new RepeatedElementArray();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3,3]
         * 输出：3
         */
        System.out.println(repeatedElementArray.repeatedNTimes(new int[]{1, 2, 3, 3}));
        /**
         * 示例 2：
         * 输入：nums = [2,1,2,5,3,2]
         * 输出：2
         */
        System.out.println(repeatedElementArray.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        /**
         * 示例 3：
         * 输入：nums = [5,1,5,2,5,3,5,4]
         * 输出：5
         */
        System.out.println(repeatedElementArray.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }
}
