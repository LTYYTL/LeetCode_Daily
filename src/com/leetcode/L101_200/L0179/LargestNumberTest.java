package com.leetcode.L101_200.L0179;

public class LargestNumberTest {
    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        /**
         * 示例 1：
         * 输入：nums = [10,2]
         * 输出："210"
         */
        System.out.println(largestNumber.largestNumber(new int[]{10,2}));
        /**
         * 示例 2：
         * 输入：nums = [3,30,34,5,9]
         * 输出："9534330"
         */
        System.out.println(largestNumber.largestNumber(new int[]{3, 30, 34, 5, 9}));
        /**
         * 示例 3：
         * 输入：nums = [1]
         * 输出："1"
         */
        System.out.println(largestNumber.largestNumber(new int[]{1}));
        /**
         * 示例 4：
         * 输入：nums = [10]
         * 输出："10"
         */
        System.out.println(largestNumber.largestNumber(new int[]{10}));
    }
}
