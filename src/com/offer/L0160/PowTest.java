package com.offer.L0160;

public class PowTest {
    public static void main(String[] args) {
        Pow pow = new Pow();
        /**
         * 示例 1：
         * 输入：x = 2.00000, n = 10
         * 输出：1024.00000
         */
        System.out.println(pow.myPow(2, 10));
        System.out.println(pow.myPow_Math(2, 10));
        /**
         * 示例 2：
         * 输入：x = 2.10000, n = 3
         * 输出：9.26100
         */
        System.out.println(pow.myPow(2.1, 3));
        System.out.println(pow.myPow_Math(2.1, 3));
        /**
         * 示例 3：
         * 输入：x = 2.00000, n = -2
         * 输出：0.25000
         * 解释：2-2 = 1/22 = 1/4 = 0.25
         */
        System.out.println(pow.myPow(2, -2));
        System.out.println(pow.myPow_Math(2, -2));
    }
}
