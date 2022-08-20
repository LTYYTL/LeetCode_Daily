package com.leetcode.L201_300.L0263;

public class UglyNumberTest {
    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        /*
          示例 1：
          输入：n = 6
          输出：true
          解释：6 = 2 × 3
         */
        System.out.println(uglyNumber.isUgly(6));
        /*
          示例 2：
          输入：n = 8
          输出：true
          解释：8 = 2 × 2 × 2
         */
        System.out.println(uglyNumber.isUgly(8));
         /*
          示例 3：
          输入：n = 14
          输出：false
          解释：14 不是丑数，因为它包含了另外一个质因数 7 。
         */
        System.out.println(uglyNumber.isUgly(14));
         /*
          示例 4：
          输入：n = 1
          输出：true
          解释：1 通常被视为丑数。
         */
        System.out.println(uglyNumber.isUgly(1));
    }
}
