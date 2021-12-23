package com.leetcode.L1101_1200.L1154;

public class DayOfYearTest {
    public static void main(String[] args) {
        DayOfYear dayOfYear = new DayOfYear();
        /** *
         * 示例 1：
         * 输入：date = "2019-01-09"
         * 输出：9
         */
        System.out.println(dayOfYear.dayOfYear("2019-01-09"));
        /**
         * 示例 2：
         * 输入：date = "2019-02-10"
         * 输出：41
         */
        System.out.println(dayOfYear.dayOfYear("2019-02-10"));
        /**
         * 示例 3：
         * 输入：date = "2003-03-01"
         * 输出：60
         */
        System.out.println(dayOfYear.dayOfYear("2003-03-01"));
        /**
         * 示例 4：
         * 输入：date = "2004-03-01"
         * 输出：61
         */
        System.out.println(dayOfYear.dayOfYear("2004-03-01"));
    }
}
