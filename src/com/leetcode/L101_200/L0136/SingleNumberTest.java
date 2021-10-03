package com.leetcode.L101_200.L0136;

public class SingleNumberTest {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        /**
         * 示例 1:
         * 输入: [2,2,1]
         * 输出: 1
         */
        System.out.println(singleNumber.singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber.singleNumber_bit(new int[]{2, 2, 1}));
        /**
         * 示例 2:
         * 输入: [4,1,2,1,2]
         * 输出: 4
         */
        System.out.println(singleNumber.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber.singleNumber_bit(new int[]{4,1,2,1,2}));
    }
}
