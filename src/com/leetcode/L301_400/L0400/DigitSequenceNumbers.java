package com.leetcode.L301_400.L0400;

/**
 * 400. 第 N 位数字
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 位数字。
 *
 * 注意：n 是正数且在 32 位整数范围内（n < 231）。
 *
 * 示例 1：
 * 输入：3
 * 输出：3
 *
 * 示例 2：
 * 输入：11
 * 输出：0
 * 解释：第 11 位数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是 0 ，它是 10 的一部分。
 */
public class DigitSequenceNumbers {
    /**
     * 方法：数学
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        //位数
        int digit = 1;
        //开始的数
        long start = 1;
        //总共的位数
        long count = 9;
        while (n > count){
            //
            n -= count;
            //位数+1
            digit += 1;
            //开始的数
            start *= 10;
            //当前位数总共占多少位
            count = digit * start * 9;
        }
        //第几个数字
        long num = start + (n-1) /digit;
        return Long.toString(num).charAt((n-1) % digit) - '0';
    }
}
