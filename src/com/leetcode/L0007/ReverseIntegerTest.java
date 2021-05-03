package com.leetcode.L0007;

public class ReverseIntegerTest {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        /**
         * 示例 1：
         * 输入：x = 123
         * 输出：321
         */
        System.out.println(reverseInteger.reverse(123));
        /**
         * 示例 2：
         * 输入：x = -123
         * 输出：-321
         */
        System.out.println(reverseInteger.reverse(-123));
        /**
         * 示例 3：
         * 输入：x = 120
         * 输出：21
         */
        System.out.println(reverseInteger.reverse(120));
        /**
         * 示例 4：
         * 输入：x = 0
         * 输出：0
         */
        System.out.println(reverseInteger.reverse(0));
    }
}
