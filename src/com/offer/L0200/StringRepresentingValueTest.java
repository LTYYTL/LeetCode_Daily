package com.offer.L0200;

public class StringRepresentingValueTest {
    public static void main(String[] args) {
        StringRepresentingValue stringRepresentingValue = new StringRepresentingValue();
        /**
         * 示例 1：
         * 输入：s = "0"
         * 输出：true
         */
        System.out.println(stringRepresentingValue.isNumber("0"));
        /**
         * 示例 2：
         * 输入：s = "e"
         * 输出：false
         */
        System.out.println(stringRepresentingValue.isNumber("e"));
        /**
         * 示例 3：
         * 输入：s = "."
         * 输出：false
         */
        System.out.println(stringRepresentingValue.isNumber("."));
        /**
         * 示例 4：
         * 输入：s = "    .1  "
         * 输出：true
         */
        System.out.println(stringRepresentingValue.isNumber("    .1  "));
    }
}
