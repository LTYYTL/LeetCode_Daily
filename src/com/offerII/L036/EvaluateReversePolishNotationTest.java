package com.offerII.L036;

public class EvaluateReversePolishNotationTest {
    public static void main(String[] args) {
        EvaluateReversePolishNotation reversePolishNotation = new EvaluateReversePolishNotation();
        /*
          示例 1：
          输入：tokens = ["2","1","+","3","*"]
          输出：9
          解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
         */
        System.out.println(reversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        /*
          示例 2：
          输入：tokens = ["4","13","5","/","+"]
          输出：6
          解释：该算式转化为常见的中缀算术表达式为：(4 + (13 / 5)) = 6
         */
        System.out.println(reversePolishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
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
        System.out.println(reversePolishNotation.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}
