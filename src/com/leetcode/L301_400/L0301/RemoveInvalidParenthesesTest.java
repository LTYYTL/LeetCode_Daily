package com.leetcode.L301_400.L0301;

public class RemoveInvalidParenthesesTest {
    public static void main(String[] args) {
        RemoveInvalidParentheses removeInvalidParentheses = new RemoveInvalidParentheses();
        /**
         * 示例 1：
         * 输入：s = "()())()"
         * 输出：["(())()","()()()"]
         */
        System.out.println(removeInvalidParentheses.removeInvalidParentheses("()())()"));
        /**
         * 示例 2：
         * 输入：s = "(a)())()"
         * 输出：["(a())()","(a)()()"]
         */
        System.out.println(removeInvalidParentheses.removeInvalidParentheses("(a)())()"));
        /**
         * 示例 3：
         * 输入：s = ")("
         * 输出：[""]
         */
        System.out.println(removeInvalidParentheses.removeInvalidParentheses(")("));
    }
}
