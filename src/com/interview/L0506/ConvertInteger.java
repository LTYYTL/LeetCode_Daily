package com.interview.L0506;

/**
 * 面试题 05.06. 整数转换
 * 整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。
 *
 * 示例1:
 *  输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
 *  输出：2
 *
 * 示例2:
 *  输入：A = 1，B = 2
 *  输出：2
 *
 * 提示:
 * A，B范围在[-2147483648, 2147483647]之间
 */
public class ConvertInteger {
    /**
     * 方法：位运算
     * @param A
     * @param B
     * @return
     */
    public int convertInteger(int A, int B) {
        //异或获取不同的位数
        int res = A ^B;
        //计算异或结果中1的个数
        return Integer.bitCount(res);
    }
}
