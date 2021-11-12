package com.interview.L0103;

public class StringURLTest {
    public static void main(String[] args) {
        StringURL stringURL = new StringURL();
        /**
         * 示例 1：
         * 输入："Mr John Smith    ", 13
         * 输出："Mr%20John%20Smith"
         */
        System.out.println(stringURL.replaceSpaces("Mr John Smith    ", 13));
        /**
         * 示例 2：
         * 输入："               ", 5
         * 输出："%20%20%20%20%20"
         */
        System.out.println(stringURL.replaceSpaces("               ", 5));
    }
}
