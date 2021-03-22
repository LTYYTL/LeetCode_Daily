package com.leetcode.L0191;

public class NumberOneBitsTest {
    public static void main(String[] args) {
        NumberOneBits numberOneBits = new NumberOneBits();

        /** * 示例 1：
         * 输入：00000000000000000000000000001011
         * 输出：3
         * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
         */
        System.out.println(numberOneBits.hammingWeight(00000000000000000000000000001011));
        /**
         * 示例 2：
         * 输入：00000000000000000000000010000000
         * 输出：1
         * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
         */
        System.out.println(numberOneBits.hammingWeight(00000000000000000000000010000000));
        /**
         * 示例 3：
         * 输入：11111111111111111111111111111101
         * 输出：31
         * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
         */
        System.out.println(numberOneBits.hammingWeight(-3));
    }
}
