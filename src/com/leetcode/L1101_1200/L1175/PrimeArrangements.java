package com.leetcode.L1101_1200.L1175;

import static com.util.Math.isPrime;

/**
 * 1175. 质数排列
 * 请你帮忙给从 1 到 n 的数设计排列方案，使得所有的「质数」都应该被放在「质数索引」（索引从 1 开始）上；你需要返回可能的方案总数。
 * 让我们一起来回顾一下「质数」：质数一定是大于 1 的，并且不能用两个小于它的正整数的乘积来表示。
 * 由于答案可能会很大，所以请你返回答案 模 mod 10^9 + 7 之后的结果即可。
 * <p>
 * 示例 1：
 * 输入：n = 5
 * 输出：12
 * 解释：举个例子，[1,2,5,4,3] 是一个有效的排列，但 [5,2,3,4,1] 不是，因为在第二种情况里质数 5 被错误地放在索引为 1 的位置上。
 * <p>
 * 示例 2：
 * 输入：n = 100
 * 输出：682289015
 * <p>
 * 提示：
 * 1 <= n <= 100
 */
public class PrimeArrangements {
    /**
     * 方法：数学
     *
     * @param n
     * @return
     */
    final static int MOD = 1000000007;

    public int numPrimeArrangements(int n) {
        //记录质数个数
        int count = 0;
        //遍历
        for (int i = 2; i <= n; i++) {
            //判断是否是质数
            if (isPrime(i))
                count++;
        }

        //计算全排序
        return (int) ((f(count) % MOD * f(n - count) % MOD) % MOD);
    }

    /**
     * 全排序
     *
     * @param n
     * @return
     */
    private long f(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            result %= MOD;
        }
        return result % MOD;
    }
}
