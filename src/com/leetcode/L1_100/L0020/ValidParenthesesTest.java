package com.leetcode.L1_100.L0020;

public class ValidParenthesesTest {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        /**
         * 示例 1:
         * 输入: "()"
         * 输出: true
         */
        System.out.println(validParentheses.isValid("()"));
        /**
         * 示例 2:
         * 输入: "()[]{}"
         * 输出: true
         */
        System.out.println(validParentheses.isValid("()[]{}"));
    }
}
