package com.leetcode.L2101_2200.L2169;

public class CountOperationsZeroTest {
    public static void main(String[] args) {
        CountOperationsZero countOperationsZero = new CountOperationsZero();
        /* *
          示例 1：
          输入：num1 = 2, num2 = 3
          输出：3
          解释：
          - 操作 1 ：num1 = 2 ，num2 = 3 。由于 num1 < num2 ，num2 减 num1 得到 num1 = 2 ，num2 = 3 - 2 = 1 。
          - 操作 2 ：num1 = 2 ，num2 = 1 。由于 num1 > num2 ，num1 减 num2 。
          - 操作 3 ：num1 = 1 ，num2 = 1 。由于 num1 == num2 ，num1 减 num2 。
          此时 num1 = 0 ，num2 = 1 。由于 num1 == 0 ，不需要再执行任何操作。
          所以总操作数是 3 。
         */
        System.out.println(countOperationsZero.countOperations(2, 3));
        /*
          示例 2：
          输入：num1 = 10, num2 = 10
          输出：1
          解释：
          - 操作 1 ：num1 = 10 ，num2 = 10 。由于 num1 == num2 ，num1 减 num2 得到 num1 = 10 - 10 = 0 。
          此时 num1 = 0 ，num2 = 10 。由于 num1 == 0 ，不需要再执行任何操作。
          所以总操作数是 1 。
         */
        System.out.println(countOperationsZero.countOperations(10, 10));
    }
}
