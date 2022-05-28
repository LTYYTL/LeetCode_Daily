package com.leetcode.L1001_1100.L1021;

public class RemoveOutermostParenthesesTest {
    public static void main(String[] args) {
        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();
        /**
         * 示例 1：
         * 输入：s = "(()())(())"
         * 输出："()()()"
         * 解释：
         * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
         * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
         */
        System.out.println(removeOutermostParentheses.removeOuterParentheses("(()())(())"));
        /**
         * 示例 2：
         * 输入：s = "(()())(())(()(()))"
         * 输出："()()()()(())"
         * 解释：
         * 输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
         * 删除每个部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
         */
        System.out.println(removeOutermostParentheses.removeOuterParentheses("(()())(())(()(()))"));
        /**
         * 示例 3：
         * 输入：s = "()()"
         * 输出：""
         * 解释：
         * 输入字符串为 "()()"，原语化分解得到 "()" + "()"，
         * 删除每个部分中的最外层括号后得到 "" + "" = ""。
         */
        System.out.println(removeOutermostParentheses.removeOuterParentheses("()()"));
    }
}
