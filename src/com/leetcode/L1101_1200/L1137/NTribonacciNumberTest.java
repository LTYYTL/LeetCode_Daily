package com.leetcode.L1101_1200.L1137;

public class NTribonacciNumberTest {
    public static void main(String[] args) {
        NTribonacciNumber nTribonacciNumber = new NTribonacciNumber();
        /*
          示例 1：
          输入：n = 4
          输出：4
          解释：
          T_3 = 0 + 1 + 1 = 2
          T_4 = 1 + 1 + 2 = 4
         */
        System.out.println(nTribonacciNumber.tribonacci(4));
        System.out.println(nTribonacciNumber.tribonacci_State(4));
        /*
          示例 2：
          输入：n = 25
          输出：1389537
         */
        System.out.println(nTribonacciNumber.tribonacci(25));
        System.out.println(nTribonacciNumber.tribonacci_State(25));
    }
}
