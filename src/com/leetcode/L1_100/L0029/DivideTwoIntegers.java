package com.leetcode.L1_100.L0029;

/**
 * 29. 两数相除
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 *
 * 示例 1:
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
 *
 * 示例 2:
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 解释: 7/-3 = truncate(-2.33333..) = -2
 *
 * 提示：
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 */
public class DivideTwoIntegers {
    /**
     * 方法：数学
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {
        //除数为0
        if (divisor == 0)
            return 0;
        //溢出
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        //用异或来计算是否是异号
        boolean negative = (dividend ^ divisor) < 0;

        long t = Math.abs(dividend);
        long d = Math.abs(divisor);

        int result = 0;
        for (int i=31; i>=0;i--) {
            if ((t>>i) >= d) {//找出足够大的数2^n*divisor
                result += 1<<i;//将结果加上2^n
                t -= d<<i;//将被除数减去2^n*divisor
            }
        }
        return negative ? -result : result;
    }
}
