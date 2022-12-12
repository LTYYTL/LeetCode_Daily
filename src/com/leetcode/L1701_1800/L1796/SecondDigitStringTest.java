package com.leetcode.L1701_1800.L1796;

public class SecondDigitStringTest {
    public static void main(String[] args) {
        SecondDigitString secondDigitString = new SecondDigitString();
        /*
          示例 1：
          输入：s = "dfa12321afd"
          输出：2
          解释：出现在 s 中的数字包括 [1, 2, 3] 。第二大的数字是 2 。
         */
        System.out.println(secondDigitString.secondHighest("dfa12321afd"));
        /*
          示例 2：
          输入：s = "abc1111"
          输出：-1
          解释：出现在 s 中的数字只包含 [1] 。没有第二大的数字。
         */
        System.out.println(secondDigitString.secondHighest("abc1111"));
    }
}
