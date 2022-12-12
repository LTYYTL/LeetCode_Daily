package com.leetcode.L1701_1800.L1796;

/**
 * 1796. 字符串中第二大的数字
 * 给你一个混合字符串 s ，请你返回 s 中 第二大 的数字，如果不存在第二大的数字，请你返回 -1 。
 * 混合字符串 由小写英文字母和数字组成。
 * <p>
 * 示例 1：
 * 输入：s = "dfa12321afd"
 * 输出：2
 * 解释：出现在 s 中的数字包括 [1, 2, 3] 。第二大的数字是 2 。
 * <p>
 * 示例 2：
 * 输入：s = "abc1111"
 * 输出：-1
 * 解释：出现在 s 中的数字只包含 [1] 。没有第二大的数字。
 * <p>
 * 提示：
 * 1 <= s.length <= 500
 * s 只包含小写英文字母和（或）数字。
 */
public class SecondDigitString {
    /**
     * 方法：模拟
     */
    public int secondHighest(String s) {
        // 第一大
        int first = -1;
        // 第二大
        int second = -1;

        // 遍历
        for (int i = 0; i < s.length(); i++) {
            // 当前字符
            char c = s.charAt(i);
            // 是数字
            if (Character.isDigit(c)) {
                // 转化成数字
                int num = c - '0';
                // 比第一个大
                if (num > first) {
                    // 将第一大变成第二大
                    second = first;
                    // 更新第一大
                    first = num;
                } else if (num < first && num > second) {// 介于第一大和第二大之间
                    second = num;
                }
            }
        }
        return second;
    }
}
