package com.offerII.L003;

import java.util.Arrays;

public class CountingBitsTest {
    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        /** * 示例 1:
         * 输入: n = 2
         * 输出: [0,1,1]
         * 解释:
         * 0 --> 0
         * 1 --> 1
         * 2 --> 10
         */
        System.out.println(Arrays.toString(countingBits.countBits(2)));
        /**
         * 示例 2:
         * 输入: n = 5
         * 输出: [0,1,1,2,1,2]
         * 解释:
         * 0 --> 0
         * 1 --> 1
         * 2 --> 10
         * 3 --> 11
         * 4 --> 100
         * 5 --> 101
         */
        System.out.println(Arrays.toString(countingBits.countBits(5)));
    }
}
