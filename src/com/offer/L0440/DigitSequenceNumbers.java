package com.offer.L0440;

/**
 * 剑指 Offer 44. 数字序列中某一位的数字
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 * 请写一个函数，求任意第n位对应的数字。
 *
 * 示例 1：
 * 输入：n = 3
 * 输出：3
 *
 * 示例 2：
 * 输入：n = 11
 * 输出：0
 *
 * 限制：
 * 0 <= n < 2^31
 * 注意：本题与主站 400 题相同：https://leetcode-cn.com/problems/nth-digit/
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
