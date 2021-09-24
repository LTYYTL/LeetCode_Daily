package com.offer.L0670;

public class StringToIntegerTest {
    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        /** * 示例 1：
         * 输入：s = "42"
         * 输出：42
         */
        System.out.println(stringToInteger.myAtoi("42"));
        /**
         * 示例 2：
         * 输入：s = "   -42"
         * 输出：-42。
         */
        System.out.println(stringToInteger.myAtoi("   -42"));
        /**
         * 示例 3：
         * 输入：s = "4193 with words"
         * 输出：4193
         */
        System.out.println(stringToInteger.myAtoi("4193 with words"));
        /**
         * 示例 4：
         * 输入：s = "words and 987"
         * 输出：0
         */
        System.out.println(stringToInteger.myAtoi("words and 987"));
        /**
         * 示例 5：
         * 输入：s = "-91283472332"
         * 输出：-2147483648
         */
        System.out.println(stringToInteger.myAtoi("-91283472332"));
    }
}
