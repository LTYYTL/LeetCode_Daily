package com.leetcode.L201_300.L0282;

public class ExpressionAddOperatorsTest {
    public static void main(String[] args) {
        ExpressionAddOperators expressionAddOperators = new ExpressionAddOperators();
        /*
          示例 1:
          输入: num = "123", target = 6
          输出: ["1+2+3", "1*2*3"]
         */
        System.out.println(expressionAddOperators.addOperators("123", 6));
        /*
          示例 2:
          输入: num = "232", target = 8
          输出: ["2*3+2", "2+3*2"]
         */
        System.out.println(expressionAddOperators.addOperators("232", 8));
        /*
          示例 3:
          输入: num = "105", target = 5
          输出: ["1*0+5","10-5"]
         */
        System.out.println(expressionAddOperators.addOperators("105", 5));
        /*
          示例 4:
          输入: num = "00", target = 0
          输出: ["0+0", "0-0", "0*0"]
         */
        System.out.println(expressionAddOperators.addOperators("00", 0));
        /*
          示例 5:
          输入: num = "3456237490", target = 9191
          输出: []
         */
        System.out.println(expressionAddOperators.addOperators("3456237490", 9191));
    }
}
