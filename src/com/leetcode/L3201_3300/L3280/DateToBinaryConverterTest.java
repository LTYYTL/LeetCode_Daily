package com.leetcode.L3201_3300.L3280;

public class DateToBinaryConverterTest {
    public static void main(String[] args) {
        DateToBinaryConverter dateToBinaryConverter = new DateToBinaryConverter();
        /*
         * 示例 1：
         * 输入： date = "2080-02-29"
         * 输出： "100000100000-10-11101"
         * 解释：
         * 100000100000, 10 和 11101 分别是 2080, 02 和 29 的二进制表示。
         */
        System.out.println(dateToBinaryConverter.convertDateToBinary("2080-02-29"));
        /*
         * 示例 2：
         * 输入： date = "1900-01-01"
         * 输出： "11101101100-1-1"
         * 解释：
         * 11101101100, 1 和 1 分别是 1900, 1 和 1 的二进制表示。
         */
        System.out.println(dateToBinaryConverter.convertDateToBinary("1900-01-01"));
    }
}
