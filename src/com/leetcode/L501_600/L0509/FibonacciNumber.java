package com.leetcode.L501_600.L0509;

/**
 * 509. 斐波那契数
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 *
 * 示例 1：
 * 输入：2
 * 输出：1
 * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1
 *
 * 示例 2：
 * 输入：3
 * 输出：2
 * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2
 *
 * 示例 3：
 * 输入：4
 * 输出：3
 * 解释：F(4) = F(3) + F(2) = 2 + 1 = 3
 */
public class FibonacciNumber {
    /**
     * 方法一：递归
     * @param n
     * @return
     */
    public int fib(int n) {
        //0和1的情况
        if (n < 2)
           return n;

        return fib(n-1) + fib(n-2);
    }

    /**
     * 方法二：迭代
     * @param n
     * @return
     */
    public int fib_iteration(int n){
        int first = 0;
        int second = 1;
        while (n > 0){
            int temp = first + second;
            first = second;
            second = temp;
            n--;
        }
        return first;
    }
}
