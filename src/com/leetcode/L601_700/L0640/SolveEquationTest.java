package com.leetcode.L601_700.L0640;

public class SolveEquationTest {
    public static void main(String[] args) {
        SolveEquation solveEquation = new SolveEquation();
        /*
          示例 1：
          输入: equation = "x+5-3+x=6+x-2"
          输出: "x=2"
         */
        System.out.println(solveEquation.solveEquation("x+5-3+x=6+x-2"));
        /*
          示例 2:
          输入: equation = "x=x"
          输出: "Infinite solutions"
         */
        System.out.println(solveEquation.solveEquation("x=x"));
        /*
          示例 3:
          输入: equation = "2x=x"
          输出: "x=0"
         */
        System.out.println(solveEquation.solveEquation("x=0"));
    }
}
