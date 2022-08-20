package com.leetcode.L801_900.L0829;

public class ConsecutiveNumbersSumTest {
    public static void main(String[] args) {
        ConsecutiveNumbersSum consecutiveNumbersSum = new ConsecutiveNumbersSum();
        /*
          示例 1:
          输入: n = 5
          输出: 2
          解释: 5 = 2 + 3，共有两组连续整数([5],[2,3])求和后为 5。
         */
        System.out.println(consecutiveNumbersSum.consecutiveNumbersSum(5));
        /*
          示例 2:
          输入: n = 9
          输出: 3
          解释: 9 = 4 + 5 = 2 + 3 + 4
         */
        System.out.println(consecutiveNumbersSum.consecutiveNumbersSum(9));
        /*
          示例 3:
          输入: n = 15
          输出: 4
          解释: 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
         */
        System.out.println(consecutiveNumbersSum.consecutiveNumbersSum(15));
    }
}
