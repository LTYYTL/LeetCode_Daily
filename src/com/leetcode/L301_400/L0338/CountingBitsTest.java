package com.leetcode.L301_400.L0338;

import java.util.Arrays;

public class CountingBitsTest {
    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        /*** 示例 1:
         * 输入: 2
         * 输出: [0,1,1]
         */
        System.out.println(Arrays.toString(countingBits.countBits(2)));
        /**
         * 示例 2:
         * 输入: 5
         * 输出: [0,1,1,2,1,2]
         */
        System.out.println(Arrays.toString(countingBits.countBits(5)));
    }
}
