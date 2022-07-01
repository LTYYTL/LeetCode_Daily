package com.leetcode.L201_300.L0241;

public class DiffWaysAddParenthesesTest {
    public static void main(String[] args) {
        DiffWaysAddParentheses diffWaysAddParentheses = new DiffWaysAddParentheses();
        /**
         * 示例 1：
         * 输入：expression = "2-1-1"
         * 输出：[0,2]
         * 解释：
         * ((2-1)-1) = 0
         * (2-(1-1)) = 2
         */
        System.out.println(diffWaysAddParentheses.diffWaysToCompute("2-1-1"));
        /**
         * 示例 2：
         * 输入：expression = "2*3-4*5"
         * 输出：[-34,-14,-10,-10,10]
         * 解释：
         * (2*(3-(4*5))) = -34
         * ((2*3)-(4*5)) = -14
         * ((2*(3-4))*5) = -10
         * (2*((3-4)*5)) = -10
         * (((2*3)-4)*5) = 10
         */
        System.out.println(diffWaysAddParentheses.diffWaysToCompute("2*3-4*5"));
    }
}
