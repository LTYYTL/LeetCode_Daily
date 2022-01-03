package com.leetcode.L1101_1200.L1185;

/**
 * 1185. 一周中的第几天
 * 给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
 * 输入为三个整数：day、month 和 year，分别表示日、月、年。
 * 您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
 *
 * 示例 1：
 * 输入：day = 31, month = 8, year = 2019
 * 输出："Saturday"
 *
 * 示例 2：
 * 输入：day = 18, month = 7, year = 1999
 * 输出："Sunday"
 *
 * 示例 3：
 * 输入：day = 15, month = 8, year = 1993
 * 输出："Sunday"
 *
 * 提示：
 * 给出的日期一定是在 1971 到 2100 年之间的有效日期。
 */
public class DayWeek {
    /**
     * 方法：数学
     * @param day
     * @param month
     * @param year
     * @return
     */
    public String dayOfTheWeek(int day, int month, int year) {
        //1970年12月31日是星期四
        String[] week = {"Thursday","Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        //平年每个月的天数
        int[] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31};
        //计算当前年距离1971年有多少个整年的天数，并计算出这其中包括闰年的个数，每一个闰年就多加1天
        int sum = 365 *(year-1971) + (year - 1969) / 4;
        //计算当前年1月1日距离当前月1日的天数
        for (int i = 0; i < month-1; i++) {
            sum += monthDay[i];
        }
        //看是否是闰年，并且当前月是否超过2月，闰年的2月是29天，所以需要多+1天
        if ((year%400 == 0 ||(year%4 == 0 && year % 100 != 0)) && month >= 3)
            sum += 1;
        //距离当前月1日的天数
        sum += day;
        //取7的余数
        return week[sum%7];
    }
}
