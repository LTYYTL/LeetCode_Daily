package com.leetcode.L1101_1200.L1108;

public class DefangingIPTest {
    public static void main(String[] args) {
        DefangingIP defangingIP = new DefangingIP();
        /**
         * 示例 1：
         * 输入：address = "1.1.1.1"
         * 输出："1[.]1[.]1[.]1"
         */
        System.out.println(defangingIP.defangIPaddr("1.1.1.1"));
        /**
         * 示例 2：
         * 输入：address = "255.100.50.0"
         * 输出："255[.]100[.]50[.]0"
         */
        System.out.println(defangingIP.defangIPaddr("255.100.50.0"));
    }
}
