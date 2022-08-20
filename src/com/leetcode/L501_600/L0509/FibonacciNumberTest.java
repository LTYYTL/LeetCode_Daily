package com.leetcode.L501_600.L0509;

public class FibonacciNumberTest {
    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        /* * 示例 1：
          输入：2
          输出：1
          解释：F(2) = F(1) + F(0) = 1 + 0 = 1
         */
        //方法一：递归
        System.out.println(fibonacciNumber.fib(2));
        //方法二：迭代
        System.out.println(fibonacciNumber.fib_iteration(2));
        /*
          示例 2：
          输入：3
          输出：2
          解释：F(3) = F(2) + F(1) = 1 + 1 = 2
         */
        //方法一：递归
        System.out.println(fibonacciNumber.fib(3));
        //方法二：迭代
        System.out.println(fibonacciNumber.fib_iteration(3));
        /*
          示例 3：
          输入：4
          输出：3
          解释：F(4) = F(3) + F(2) = 2 + 1 = 3
         */
        //方法一：递归
        System.out.println(fibonacciNumber.fib(4));
        //方法二：迭代
        System.out.println(fibonacciNumber.fib_iteration(4));
    }
}
