package com.interview.L0809;

public class BracketTest {
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        /*
          例如，给出 n = 3，生成结果为：
          [
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
          ]
         */
        System.out.println(bracket.generateParenthesis(3));
    }
}
