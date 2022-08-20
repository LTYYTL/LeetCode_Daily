package com.leetcode.L101_200.L0150;

public class EvaluateReversePolishNotationTest {

    public static void main(String[] args) {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        /*
          示例 1：
          输入：tokens = ["2","1","+","3","*"]
          输出：9
          解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
         */
        String[] arr1 = {"2", "1", "+", "3", "*"};
        System.out.println(evaluateReversePolishNotation.evalRPN(arr1));
        /*
          示例 2：
          输入：tokens = ["4","13","5","/","+"]
          输出：6
          解释：该算式转化为常见的中缀算术表达式为：(4 + (13 / 5)) = 6
         */
        String[] arr2 = {"4", "13", "5", "/", "+"};
        System.out.println(evaluateReversePolishNotation.evalRPN(arr2));
        /*
          示例 3：
          输入：tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
          输出：22
          解释：
          该算式转化为常见的中缀算术表达式为：
            ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
          = ((10 * (6 / (12 * -11))) + 17) + 5
          = ((10 * (6 / -132)) + 17) + 5
          = ((10 * 0) + 17) + 5
          = (0 + 17) + 5
          = 17 + 5
          = 22
         */
        String[] arr3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evaluateReversePolishNotation.evalRPN(arr3));
    }
}
