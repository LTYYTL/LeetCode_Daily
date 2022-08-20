package com.interview.L1605;

public class FactorialZerosTest {
    public static void main(String[] args) {
        FactorialZeros factorialZeros = new FactorialZeros();
        /*
          示例 1:
          输入: 3
          输出: 0
          解释: 3! = 6, 尾数中没有零。
         */
        System.out.println(factorialZeros.trailingZeroes(3));
        /*
          示例 2:
          输入: 5
          输出: 1
          解释: 5! = 120, 尾数中有 1 个零.
         */
        System.out.println(factorialZeros.trailingZeroes(5));
    }
}
