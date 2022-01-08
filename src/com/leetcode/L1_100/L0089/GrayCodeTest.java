package com.leetcode.L1_100.L0089;

public class GrayCodeTest {
    public static void main(String[] args) {
        GrayCode grayCode = new GrayCode();
        /**
         * 示例 1：
         * 输入：n = 2
         * 输出：[0,1,3,2]
         * 解释：
         * [0,1,3,2] 的二进制表示是 [00,01,11,10] 。
         * - 00 和 01 有一位不同
         * - 01 和 11 有一位不同
         * - 11 和 10 有一位不同
         * - 10 和 00 有一位不同
         * [0,2,3,1] 也是一个有效的格雷码序列，其二进制表示是 [00,10,11,01] 。
         * - 00 和 10 有一位不同
         * - 10 和 11 有一位不同
         * - 11 和 01 有一位不同
         * - 01 和 00 有一位不同
         */
        System.out.println(grayCode.grayCode(2));
        /**
         * 示例 2：
         * 输入：n = 1
         * 输出：[0,1]
         */
        System.out.println(grayCode.grayCode(1));
    }
}
