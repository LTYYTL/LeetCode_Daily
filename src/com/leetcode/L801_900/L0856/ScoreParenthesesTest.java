package com.leetcode.L801_900.L0856;

public class ScoreParenthesesTest {
    public static void main(String[] args) {
        ScoreParentheses scoreParentheses = new ScoreParentheses();
        /*
          示例 1：
          输入： "()"
          输出： 1
         */
        System.out.println(scoreParentheses.scoreOfParentheses("()"));
        /*
          示例 2：
          输入： "(())"
          输出： 2
         */
        System.out.println(scoreParentheses.scoreOfParentheses("(())"));
        /*
          示例 3：
          输入： "()()"
          输出： 2
         */
        System.out.println(scoreParentheses.scoreOfParentheses("()()"));
        /*
          示例 4：
          输入： "(()(()))"
          输出： 6
         */
        System.out.println(scoreParentheses.scoreOfParentheses("(()(()))"));
    }
}
