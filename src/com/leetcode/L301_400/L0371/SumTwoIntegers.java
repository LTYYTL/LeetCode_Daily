package com.leetcode.L301_400.L0371;

/**
 * 371. 两整数之和
 * 给你两个整数 a 和 b ，不使用 运算符 + 和 - ，计算并返回两整数之和。
 *
 * 示例 1：
 * 输入：a = 1, b = 2
 * 输出：3
 *
 * 示例 2：
 * 输入：a = 2, b = 3
 * 输出：5
 *
 * 提示：
 * -1000 <= a, b <= 1000
 */
public class SumTwoIntegers {
    /**
     * 方法：位运算
     * @param a
     * @param b
     * @return
     */
    public int getSum(int a, int b) {
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }
}
