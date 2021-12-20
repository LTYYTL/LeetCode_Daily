package com.leetcode.L901_1000.L0921;

public class MinParenthesesValidTest {
    public static void main(String[] args) {
        MinParenthesesValid minParenthesesValid = new MinParenthesesValid();
        /**
         * 示例 1：
         * 输入："())"
         * 输出：1
         */
        System.out.println(minParenthesesValid.minAddToMakeValid("())"));
        /**
         * 示例 2：
         * 输入："((("
         * 输出：3
         */
        System.out.println(minParenthesesValid.minAddToMakeValid("((("));
        /**
         * 示例 3：
         * 输入："()"
         * 输出：0
         */
        System.out.println(minParenthesesValid.minAddToMakeValid("()"));
        /**
         * 示例 4：
         * 输入："()))(("
         * 输出：4
         */
        System.out.println(minParenthesesValid.minAddToMakeValid("()))(("));
    }
}
