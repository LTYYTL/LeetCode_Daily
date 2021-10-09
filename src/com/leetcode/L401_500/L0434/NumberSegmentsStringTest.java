package com.leetcode.L401_500.L0434;

public class NumberSegmentsStringTest {
    public static void main(String[] args) {
        NumberSegmentsString numberSegmentsString = new NumberSegmentsString();
        /**
         * 示例:
         * 输入: "Hello, my name is John"
         * 输出: 5
         * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
         */
        System.out.println(numberSegmentsString.countSegments("Hello, my name is John"));
    }
}
