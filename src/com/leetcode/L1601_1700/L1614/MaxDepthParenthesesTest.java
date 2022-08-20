package com.leetcode.L1601_1700.L1614;

public class MaxDepthParenthesesTest {
    public static void main(String[] args) {
        MaxDepthParentheses maxDepthParentheses = new MaxDepthParentheses();
        /* * 示例 1：
          输入：s = "(1+(2*3)+((8)/4))+1"
          输出：3
          解释：数字 8 在嵌套的 3 层括号中。
         */
        System.out.println(maxDepthParentheses.maxDepth("(1+(2*3)+((8)/4))+1"));
        /*
          示例 2：
          输入：s = "(1)+((2))+(((3)))"
          输出：3
         */
        System.out.println(maxDepthParentheses.maxDepth("(1)+((2))+(((3)))"));
        /*
          示例 3：
          输入：s = "1+(2*3)/(2-1)"
          输出：1
         */
        System.out.println(maxDepthParentheses.maxDepth("1+(2*3)/(2-1)"));
        /*
          示例 4：
          输入：s = "1"
          输出：0
         */
        System.out.println(maxDepthParentheses.maxDepth("1"));
    }
}
