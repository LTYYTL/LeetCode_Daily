package com.leetcode.L301_400.L0313;

public class SuperUglyNumberTest {
    public static void main(String[] args) {
        SuperUglyNumber superUglyNumber = new SuperUglyNumber();
        /*
          示例 1：
          输入：n = 12, primes = [2,7,13,19]
          输出：32
          解释：给定长度为 4 的质数数组 primes = [2,7,13,19]，前 12 个超级丑数序列为：[1,2,4,7,8,13,14,16,19,26,28,32] 。
         */
        System.out.println(superUglyNumber.nthSuperUglyNumber(12, new int[]{2, 7, 13, 19}));
        System.out.println(superUglyNumber.nthSuperUglyNumber_dp(12, new int[]{2, 7, 13, 19}));
        /*
          示例 2：
          输入：n = 1, primes = [2,3,5]
          输出：1
          解释：1 不含质因数，因此它的所有质因数都在质数数组 primes = [2,3,5] 中。
         */
        System.out.println(superUglyNumber.nthSuperUglyNumber(1, new int[]{2, 3, 5}));
        System.out.println(superUglyNumber.nthSuperUglyNumber_dp(1, new int[]{2, 3, 5}));
    }
}
