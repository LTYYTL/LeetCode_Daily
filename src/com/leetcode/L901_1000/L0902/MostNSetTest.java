package com.leetcode.L901_1000.L0902;

public class MostNSetTest {
    public static void main(String[] args) {
        MostNSet mostNSet = new MostNSet();
        /*
          示例 1：
          输入：digits = ["1","3","5","7"], n = 100
          输出：20
          解释：
          可写出的 20 个数字是：
          1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.
         */
        System.out.println(mostNSet.atMostNGivenDigitSet(new String[]{"1", "3", "5", "7"}, 5321));
        /*
          示例 2：
          输入：digits = ["1","4","9"], n = 1000000000
          输出：29523
          解释：
          我们可以写 3 个一位数字，9 个两位数字，27 个三位数字，
          81 个四位数字，243 个五位数字，729 个六位数字，
          2187 个七位数字，6561 个八位数字和 19683 个九位数字。
          总共，可以使用D中的数字写出 29523 个整数。
         */
        System.out.println(mostNSet.atMostNGivenDigitSet(new String[]{"1", "4", "9"}, 1000000000));
        /*
          示例 3:
          输入：digits = ["7"], n = 8
          输出：1
         */
        System.out.println(mostNSet.atMostNGivenDigitSet(new String[]{"7"}, 8));
    }
}
