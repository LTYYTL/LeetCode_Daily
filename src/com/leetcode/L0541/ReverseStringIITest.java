package com.leetcode.L0541;

public class ReverseStringIITest {
    public static void main(String[] args) {
        ReverseStringII reverseStringII = new ReverseStringII();
        /**
         * 示例 1：
         * 输入：s = "abcdefg", k = 2
         * 输出："bacdfeg"
         */
        System.out.println(reverseStringII.reverseStr("abcdefg", 2));
        /**
         * 示例 2：
         * 输入：s = "abcd", k = 2
         * 输出："bacd"
         */
        System.out.println(reverseStringII.reverseStr("abcd", 2));
    }
}
