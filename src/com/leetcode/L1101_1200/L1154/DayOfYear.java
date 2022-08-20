package com.leetcode.L1101_1200.L1154;

/**
 * 1154. 一年中的第几天
 * 给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。
 * 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
 *
 * 示例 1：
 * 输入：date = "2019-01-09"
 * 输出：9
 *
 * 示例 2：
 * 输入：date = "2019-02-10"
 * 输出：41
 *
 * 示例 3：
 * 输入：date = "2003-03-01"
 * 输出：60
 *
 * 示例 4：
 * 输入：date = "2004-03-01"
 * 输出：61
 *
 * 提示：
 * date.length == 10
 * date[4] == date[7] == '-'，其他的 date[i] 都是数字
 */
public class DayOfYear {
    /**
     * 方法 ：数学
     * @param date
     * @return
     */
    public int dayOfYear(String date) {
        //平年月份天数表
        int[] month_day = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        //分割字符串
        String[] split = date.split("-");
        //转换成数字
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        //结果,默认当月的天数
        int res = Integer.parseInt(split[2]);
        //将本月前的所有月的天数相加
        for (int i = 0; i < month; i++) {
            res += month_day[i];
        }
        //判断是是否是闰年，并且当前月份在2月之后则要加上1天
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month > 2)
            res += 1;
        return res;
    }
}
