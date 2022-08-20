package com.leetcode.L701_800.L0738;

public class MonotoneIncreasingDigitsTest {
    public static void main(String[] args) {
        MonotoneIncreasingDigits monotoneIncreasingDigits = new MonotoneIncreasingDigits();
        /*
          示例 1:
          输入: N = 10
          输出: 9
         */
        System.out.println(monotoneIncreasingDigits.monotoneIncreasingDigits(10));
        /*
          示例 2:
          输入: N = 1234
          输出: 1234
         */
        System.out.println(monotoneIncreasingDigits.monotoneIncreasingDigits(1234));
        /*
          示例 3:
          输入: N = 332
          输出: 299
         */
        System.out.println(monotoneIncreasingDigits.monotoneIncreasingDigits(332));
    }
}
