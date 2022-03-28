package com.leetcode.L601_700.L0693;

public class BinaryNumberAlternatingTest {
    public static void main(String[] args) {
        BinaryNumberAlternating binaryNumberAlternating = new BinaryNumberAlternating();
        /**
         * 示例 1：
         * 输入：n = 5
         * 输出：true
         * 解释：5 的二进制表示是：101
         */
        System.out.println(binaryNumberAlternating.hasAlternatingBits(5));
        /**
         * 示例 2：
         * 输入：n = 7
         * 输出：false
         * 解释：7 的二进制表示是：111.
         */
        System.out.println(binaryNumberAlternating.hasAlternatingBits(7));
        /**
         * 示例 3：
         * 输入：n = 11
         * 输出：false
         * 解释：11 的二进制表示是：1011.
         */
        System.out.println(binaryNumberAlternating.hasAlternatingBits(11));
    }
}
