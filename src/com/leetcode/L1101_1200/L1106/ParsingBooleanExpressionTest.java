package com.leetcode.L1101_1200.L1106;

public class ParsingBooleanExpressionTest {
    public static void main(String[] args) {
        ParsingBooleanExpression parsingBooleanExpression = new ParsingBooleanExpression();
        /*
          示例 1：
          输入：expression = "!(f)"
          输出：true
         */
        System.out.println(parsingBooleanExpression.parseBoolExpr("!(f)"));
        /*
          示例 2：
          输入：expression = "|(f,t)"
          输出：true
         */
        System.out.println(parsingBooleanExpression.parseBoolExpr("|(f,t)"));
        /*
          示例 3：
          输入：expression = "&(t,f)"
          输出：false
         */
        System.out.println(parsingBooleanExpression.parseBoolExpr("&(t,f)"));
        /*
          示例 4：
          输入：expression = "|(&(t,f,t),!(t))"
          输出：false
         */
        System.out.println(parsingBooleanExpression.parseBoolExpr("|(&(t,f,t),!(t))"));
    }
}
