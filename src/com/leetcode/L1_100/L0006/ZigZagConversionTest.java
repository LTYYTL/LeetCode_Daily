package com.leetcode.L1_100.L0006;

public class ZigZagConversionTest {
    public static void main(String[] args) {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        /**
         * 示例 1：
         * 输入：s = "PAYPALISHIRING", numRows = 3
         * 输出："PAHNAPLSIIGYIR"
         */
        System.out.println(zigZagConversion.convert("PAYPALISHIRING", 3));
        /**
         * 示例 2：
         * 输入：s = "PAYPALISHIRING", numRows = 4
         * 输出："PINALSIGYAHRPI"
         * 解释：
         * P     I    N
         * A   L S  I G
         * Y A   H R
         * P     I
         */
        System.out.println(zigZagConversion.convert("PAYPALISHIRING", 4));
        /**
         * 示例 3：
         * 输入：s = "A", numRows = 1
         * 输出："A"
         */
        System.out.println(zigZagConversion.convert("A", 1));
    }
}
