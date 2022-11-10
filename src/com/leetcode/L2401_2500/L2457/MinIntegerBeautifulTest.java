package com.leetcode.L2401_2500.L2457;

public class MinIntegerBeautifulTest {
    public static void main(String[] args) {
        MinIntegerBeautiful minIntegerBeautiful = new MinIntegerBeautiful();
        /*
          示例 1：
          输入：n = 16, target = 6
          输出：4
          解释：最初，n 是 16 ，且其每一位数字的和是 1 + 6 = 7 。在加 4 之后，n 变为 20 且每一位数字的和变成 2 + 0 = 2 。可以证明无法加上一个小于 4 的非负整数使 n 变成一个美丽整数。
         */
        System.out.println(minIntegerBeautiful.makeIntegerBeautiful(16, 6));
        /*
          示例 2：
          输入：n = 467, target = 6
          输出：33
          解释：最初，n 是 467 ，且其每一位数字的和是 4 + 6 + 7 = 17 。在加 33 之后，n 变为 500 且每一位数字的和变成 5 + 0 + 0 = 5 。可以证明无法加上一个小于 33 的非负整数使 n 变成一个美丽整数。
         */
        System.out.println(minIntegerBeautiful.makeIntegerBeautiful(467, 6));
        /*
          示例 3：
          输入：n = 1, target = 1
          输出：0
          解释：最初，n 是 1 ，且其每一位数字的和是 1 ，已经小于等于 target 。
         */
        System.out.println(minIntegerBeautiful.makeIntegerBeautiful(1, 1));
    }
}
