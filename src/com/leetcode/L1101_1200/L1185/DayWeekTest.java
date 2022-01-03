package com.leetcode.L1101_1200.L1185;

public class DayWeekTest {
    public static void main(String[] args) {
        DayWeek dayWeek = new DayWeek();
        /**
         * 示例 1：
         * 输入：day = 31, month = 8, year = 2019
         * 输出："Saturday"
         */
        System.out.println(dayWeek.dayOfTheWeek(31, 8, 2019));
        /**
         * 示例 2：
         * 输入：day = 18, month = 7, year = 1999
         * 输出："Sunday"
         */
        System.out.println(dayWeek.dayOfTheWeek(18, 7, 1999));
        /**
         * 示例 3：
         * 输入：day = 15, month = 8, year = 1993
         * 输出："Sunday"
         */
        System.out.println(dayWeek.dayOfTheWeek(15, 8, 1993));
    }
}
