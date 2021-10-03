package com.leetcode.L601_700.L0678;

public class ValidParenthesisStringTest {
    public static void main(String[] args) {
        ValidParenthesisString validParenthesisString = new ValidParenthesisString();
        /**
         * 示例 1:
         * 输入: "()"
         * 输出: True
         */
        System.out.println(validParenthesisString.checkValidString("()"));
        /**
         * 示例 2:
         * 输入: "(*)"
         * 输出: True
         */
        System.out.println(validParenthesisString.checkValidString("(*)"));
        /**
         * 示例 3:
         * 输入: "(*))"
         * 输出: True
         */
        System.out.println(validParenthesisString.checkValidString("(*))"));
    }
}
