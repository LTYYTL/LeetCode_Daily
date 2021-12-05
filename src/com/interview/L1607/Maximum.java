package com.interview.L1607;

/**
 * 面试题 16.07. 最大数值
 * 编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。
 *
 * 示例：
 * 输入： a = 1, b = 2
 * 输出： 2
 */
public class Maximum {
    /**
     * 方法：数学
     * @param a
     * @param b
     * @return
     */
    public int maximum(int a, int b) {
        //两个数的差值
        long dif = (long)a - (long)b;
        //获取差值的符号位，正数符号位为0，负数符号位为1
        int k = (int)(dif >>> 63);
        //负数（b大）：k=1, k^1=0 a*(k^1) + b*k = b
        //正数（a大）：k=0, k^1=1 a*(k^1) + b*k = a
        return a*(k^1) + b*k;
    }
}
