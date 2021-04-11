package com.leetcode.L0264;

public class UglyNumberIITest {
    public static void main(String[] args) {
        UglyNumberII uglyNumberII = new UglyNumberII();
        /*** 示例 1：
         * 输入：n = 10
         * 输出：12
         * 解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
         */
        System.out.println(uglyNumberII.nthUglyNumber(10));
        /**
         * 示例 2：
         * 输入：n = 1
         * 输出：1
         * 解释：1 通常被视为丑数。
         */
        System.out.println(uglyNumberII.nthUglyNumber(1));
    }
}
