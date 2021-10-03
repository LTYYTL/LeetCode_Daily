package com.leetcode.L201_300.L0242;

public class ValidAnagramTest {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        /*** 示例 1:
         * 输入: s = "anagram", t = "nagaram"
         * 输出: true
         */
        System.out.println(validAnagram.isAnagram("anagram","nagaram"));
        /**
         * 示例 2:
         * 输入: s = "rat", t = "car"
         * 输出: false
         */
        System.out.println(validAnagram.isAnagram("rat","car"));
    }
}
