package com.leetcode.L301_400.L0372;

public class SuperPowTest {
    public static void main(String[] args) {
        SuperPow superPow = new SuperPow();
        /*
          示例 1：
          输入：a = 2, b = [3]
          输出：8
         */
        System.out.println(superPow.superPow(2, new int[]{3}));
        /*
          示例 2：
          输入：a = 2, b = [1,0]
          输出：1024
         */
        System.out.println(superPow.superPow(2, new int[]{1, 0}));
        /*
          示例 3：
          输入：a = 1, b = [4,3,3,8,5,2]
          输出：1
         */
        System.out.println(superPow.superPow(1, new int[]{4, 3, 3, 8, 5, 2}));
        /*
          示例 4：
          输入：a = 2147483647, b = [2,0,0]
          输出：1198
         */
        System.out.println(superPow.superPow(2147483647, new int[]{2, 0, 0}));
    }
}
