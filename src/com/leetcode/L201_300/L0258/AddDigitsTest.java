package com.leetcode.L201_300.L0258;

public class AddDigitsTest {
    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        /* *
          示例:
          输入: 38
          输出: 2
          解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
          进阶:
          你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
         */
        System.out.println(addDigits.addDigits(38));
    }
}
