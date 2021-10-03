package com.leetcode.L1_100.L0058;

public class LastWordLengthTest {
    public static void main(String[] args) {
        LastWordLength lastWordLength = new LastWordLength();
        /**
         * 示例:
         * 输入: "Hello World"
         * 输出: 5
         */
        //暴力法
        System.out.println(lastWordLength.lengthOfLastWord("Hello World"));
        //应用trim()
        System.out.println(lastWordLength.lengthOfLastWord_trim("Hello World"));
        //应用split
        System.out.println(lastWordLength.lengthOfLastWord_split("Hello World"));
    }
}
