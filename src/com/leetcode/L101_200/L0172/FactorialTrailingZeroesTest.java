package com.leetcode.L101_200.L0172;

public class FactorialTrailingZeroesTest {
    public static void main(String[] args) {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        /*
          示例 1：
          输入：n = 3
          输出：0
          解释：3! = 6 ，不含尾随 0
         */
        System.out.println(factorialTrailingZeroes.trailingZeroes(3));
        /*
          示例 2：
          输入：n = 5
          输出：1
          解释：5! = 120 ，有一个尾随 0
         */
        System.out.println(factorialTrailingZeroes.trailingZeroes(5));
        /*
          示例 3：
          输入：n = 0
          输出：0
         */
        System.out.println(factorialTrailingZeroes.trailingZeroes(0));
    }
}
