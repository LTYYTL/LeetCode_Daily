package com.interview.L1605;

/**
 * 面试题 16.05. 阶乘尾数
 * 设计一个算法，算出 n 阶乘有多少个尾随零。
 *
 * 示例 1:
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 *
 * 示例 2:
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 *
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 */
public class FactorialZeros {
    /**
     * 方法：数学
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        //记录5出现的次数
        int count = 0;
        for (long i = 5; n / i > 0; i*=5) {
            count += n / i;
        }
        return count;
    }
}
