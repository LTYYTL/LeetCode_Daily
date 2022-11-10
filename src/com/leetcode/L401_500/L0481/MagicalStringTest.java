package com.leetcode.L401_500.L0481;

public class MagicalStringTest {
    public static void main(String[] args) {
        MagicalString magicalString = new MagicalString();
        /*
          示例 1：
          输入：n = 6
          输出：3
          解释：神奇字符串 s 的前 6 个元素是 “122112”，它包含三个 1，因此返回 3 。
         */
        System.out.println(magicalString.magicalString(6));
        /*
          示例 2：
          输入：n = 1
          输出：1
         */
        System.out.println(magicalString.magicalString(1));
    }
}
