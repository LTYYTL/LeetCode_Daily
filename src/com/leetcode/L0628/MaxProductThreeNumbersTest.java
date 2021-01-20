package com.leetcode.L0628;

public class MaxProductThreeNumbersTest {
    public static void main(String[] args) {
        MaxProductThreeNumbers maxProductThreeNumbers = new MaxProductThreeNumbers();
        /*** 示例 1:
         * 输入: [1,2,3]
         * 输出: 6
         */
        System.out.println(maxProductThreeNumbers.maximumProduct(new int[]{1,2,3}));
        /**
         * 示例 2:
         * 输入: [1,2,3,4]
         * 输出: 24
         */
        System.out.println(maxProductThreeNumbers.maximumProduct(new int[]{1,2,3,4}));
    }
}
