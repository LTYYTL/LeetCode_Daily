package com.leetcode.L501_600.L0526;

public class BeautifulArrangementTest {
    public static void main(String[] args) {
        BeautifulArrangement beautifulArrangement = new BeautifulArrangement();
        /*
          示例 1：
          输入：n = 2
          输出：2
          解释：
          第 1 个优美的排列是 [1,2]：
              - perm[1] = 1 能被 i = 1 整除
              - perm[2] = 2 能被 i = 2 整除
          第 2 个优美的排列是 [2,1]:
              - perm[1] = 2 能被 i = 1 整除
              - i = 2 能被 perm[2] = 1 整除
         */
        System.out.println(beautifulArrangement.countArrangement(2));
        System.out.println(beautifulArrangement.countArrangement_dp(2));
        /*
          示例 2：
          输入：n = 1
          输出：1
         */
        System.out.println(beautifulArrangement.countArrangement(1));
        System.out.println(beautifulArrangement.countArrangement_dp(1));
    }
}
