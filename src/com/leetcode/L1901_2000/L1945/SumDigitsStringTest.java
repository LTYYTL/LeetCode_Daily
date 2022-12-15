package com.leetcode.L1901_2000.L1945;

public class SumDigitsStringTest {
    public static void main(String[] args) {
        SumDigitsString sumDigitsString = new SumDigitsString();
        /*
          示例 1：
          输入：s = "iiii", k = 1
          输出：36
          解释：操作如下：
          - 转化："iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
          - 转换 #1：9999 ➝ 9 + 9 + 9 + 9 ➝ 36
          因此，结果整数为 36 。
         */
        System.out.println(sumDigitsString.getLucky("iiii", 1));
        /*
          示例 2：
          输入：s = "leetcode", k = 2
          输出：6
          解释：操作如下：
          - 转化："leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
          - 转换 #1：12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
          - 转换 #2：33 ➝ 3 + 3 ➝ 6
          因此，结果整数为 6 。
         */
        System.out.println(sumDigitsString.getLucky("leetcode", 2));
    }
}
