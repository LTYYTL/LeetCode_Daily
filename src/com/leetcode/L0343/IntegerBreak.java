package com.leetcode.L0343;

/**
 * 343. 整数拆分
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * 示例 1:
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 *
 * 示例 2:
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 * 说明: 你可以假设 n 不小于 2 且不大于 58。
 */
public class IntegerBreak {
    /**
     * 方法：数学
     * （1）当 n≤3 时，按照规则应不切分，但由于题目要求必须剪成 m>1 段，因此必须剪出一段长度为 1 的绳子，即返回 n - 1 。
     * （2）当 n>3 时，求 n 除以 3 的 整数部分 a 和 余数部分 b （即 n = 3a + b ），并分为以下三种情况：
     *  A.当 b = 0 时，直接返回 3^a
     *  B.当 b = 1 时，要将一个 1 + 3 转换为 2+2，因此返回 3^{a-1} * 4
     *  C.当 b = 2 时，返回 3^a *2
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        //n<=3的情况
        if (n <= 3){
            return n-1;
        }
        int a = n/3;
        int b = n%3;
        if (b == 0)
            return (int) Math.pow(3,a);
        if (b == 1)
            return (int) Math.pow(3,a-1) * 4;
        return (int) (Math.pow(3,a)*2);
    }
}
