package com.leetcode.L701_800.L0762;

public class PrimeNumberBitsTest {
    public static void main(String[] args) {
        PrimeNumberBits primeNumberBits = new PrimeNumberBits();
        /*
          示例 1：
          输入：left = 6, right = 10
          输出：4
          解释：
          6 -> 110 (2 个计算置位，2 是质数)
          7 -> 111 (3 个计算置位，3 是质数)
          9 -> 1001 (2 个计算置位，2 是质数)
          10-> 1010 (2 个计算置位，2 是质数)
          共计 4 个计算置位为质数的数字。
         */
        System.out.println(primeNumberBits.countPrimeSetBits(6, 10));
        /*
          示例 2：
          输入：left = 10, right = 15
          输出：5
          解释：
          10 -> 1010 (2 个计算置位, 2 是质数)
          11 -> 1011 (3 个计算置位, 3 是质数)
          12 -> 1100 (2 个计算置位, 2 是质数)
          13 -> 1101 (3 个计算置位, 3 是质数)
          14 -> 1110 (3 个计算置位, 3 是质数)
          15 -> 1111 (4 个计算置位, 4 不是质数)
          共计 5 个计算置位为质数的数字。
         */
        System.out.println(primeNumberBits.countPrimeSetBits(10, 15));
    }
}
