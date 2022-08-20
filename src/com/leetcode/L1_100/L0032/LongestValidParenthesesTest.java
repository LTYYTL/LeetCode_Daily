package com.leetcode.L1_100.L0032;

public class LongestValidParenthesesTest {
    public static void main(String[] args) {
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        /* *
          示例 1：
          输入：s = "(()"
          输出：2
          解释：最长有效括号子串是 "()"
         */
        System.out.println(longestValidParentheses.longestValidParentheses("(()"));
        /*
          示例 2：
          输入：s = ")()())"
          输出：4
          解释：最长有效括号子串是 "()()"
         */
        System.out.println(longestValidParentheses.longestValidParentheses(")()())"));
        /*
          示例 3：
          输入：s = ""
          输出：0
         */
        System.out.println(longestValidParentheses.longestValidParentheses(""));
    }
}
