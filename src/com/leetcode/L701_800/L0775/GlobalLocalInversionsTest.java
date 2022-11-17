package com.leetcode.L701_800.L0775;

public class GlobalLocalInversionsTest {
    public static void main(String[] args) {
        GlobalLocalInversions globalLocalInversions = new GlobalLocalInversions();
        /*
          示例 1：
          输入：nums = [1,0,2]
          输出：true
          解释：有 1 个全局倒置，和 1 个局部倒置。
         */
        System.out.println(globalLocalInversions.isIdealPermutation(new int[]{1, 0, 2}));
        /*
          示例 2：
          输入：nums = [1,2,0]
          输出：false
          解释：有 2 个全局倒置，和 1 个局部倒置。
         */
        System.out.println(globalLocalInversions.isIdealPermutation(new int[]{1, 2, 0}));
    }
}
