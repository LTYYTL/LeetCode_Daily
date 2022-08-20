package com.leetcode.L1701_1800.L1736;

public class LatestTimeReplacingHiddenDigitsTest {
    public static void main(String[] args) {
        LatestTimeReplacingHiddenDigits latestTimeReplacingHiddenDigits = new LatestTimeReplacingHiddenDigits();
        /*
          示例 1：
          输入：time = "2?:?0"
          输出："23:50"
          解释：以数字 '2' 开头的最晚一小时是 23 ，以 '0' 结尾的最晚一分钟是 50 。
         */
        System.out.println(latestTimeReplacingHiddenDigits.maximumTime("2?:?0"));
        /*
          示例 2：
          输入：time = "0?:3?"
          输出："09:39"
         */
        System.out.println(latestTimeReplacingHiddenDigits.maximumTime("0?:3?"));
        /*
          示例 3：
          输入：time = "1?:22"
          输出："19:22"
         */
        System.out.println(latestTimeReplacingHiddenDigits.maximumTime("1?:22"));
    }
}
