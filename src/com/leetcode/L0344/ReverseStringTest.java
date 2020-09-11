package com.leetcode.L0344;

public class ReverseStringTest {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();

        /**
         * 示例 1：
         * 输入：["h","e","l","l","o"]
         * 输出：["o","l","l","e","h"]
         */
        char[] s1 = "hello".toCharArray();
        reverseString.reverseString(s1);
        System.out.println(s1);
        /**
         * 示例 2：
         * 输入：["H","a","n","n","a","h"]
         * 输出：["h","a","n","n","a","H"]
         */
        char[] s2 = "Hannah".toCharArray();
        reverseString.reverseString(s2);
        System.out.println(s2);
    }
}
