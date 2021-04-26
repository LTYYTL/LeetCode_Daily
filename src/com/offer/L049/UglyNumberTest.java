package com.offer.L049;

public class UglyNumberTest {
    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        /**
         * 示例:
         * 输入: n = 10
         * 输出: 12
         * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
         */
        System.out.println(uglyNumber.nthUglyNumber(10));
        System.out.println(uglyNumber.nthUglyNumber_dp(10));
    }
}
