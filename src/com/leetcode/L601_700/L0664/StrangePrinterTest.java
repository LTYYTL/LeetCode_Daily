package com.leetcode.L601_700.L0664;

public class StrangePrinterTest {
    public static void main(String[] args) {
        StrangePrinter strangePrinter = new StrangePrinter();
        /** * 示例 1：
         * 输入：s = "aaabbb"
         * 输出：2
         * 解释：首先打印 "aaa" 然后打印 "bbb"。
         */
        System.out.println(strangePrinter.strangePrinter("aaabbb"));
        /**
         * 示例 2：
         * 输入：s = "aba"
         * 输出：2
         * 解释：首先打印 "aaa" 然后在第二个位置打印 "b" 覆盖掉原来的字符 'a'。
         */
        System.out.println(strangePrinter.strangePrinter("aba"));
    }
}
