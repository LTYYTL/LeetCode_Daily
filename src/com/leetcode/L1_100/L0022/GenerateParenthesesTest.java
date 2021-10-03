package com.leetcode.L1_100.L0022;

public class GenerateParenthesesTest {
    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        /**
         * 示例 1：
         * 输入：n = 3
         * 输出：["((()))","(()())","(())()","()(())","()()()"]
         */
        System.out.println(generateParentheses.generateParenthesis(3));
        /**
         * 示例 2：
         * 输入：n = 1
         * 输出：["()"]
         */
        System.out.println(generateParentheses.generateParenthesis(1));
    }
}
