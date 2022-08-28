package com.leetcode.L701_800.L0793;

public class PreimageFactorialZeroesSizeTest {
    public static void main(String[] args) {
        PreimageFactorialZeroesSize preimageFactorialZeroesSize = new PreimageFactorialZeroesSize();
        /* * 示例 1：
          输入：k = 0
          输出：5
          解释：0!, 1!, 2!, 3!, 和 4! 均符合 k = 0 的条件。
         */
        System.out.println(preimageFactorialZeroesSize.preimageSizeFZF(0));
        /*
          示例 2：
          输入：k = 5
          输出：0
          解释：没有匹配到这样的 x!，符合 k = 5 的条件。
         */
        System.out.println(preimageFactorialZeroesSize.preimageSizeFZF(5));
        /*
          示例 3:
          输入: k = 3
          输出: 5
         */
        System.out.println(preimageFactorialZeroesSize.preimageSizeFZF(3));
    }
}
