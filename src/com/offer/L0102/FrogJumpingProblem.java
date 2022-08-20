package com.offer.L0102;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 * 输入：n = 2
 * 输出：2
 *
 * 示例 2：
 * 输入：n = 7
 * 输出：21
 *
 * 示例 3：
 * 输入：n = 0
 * 输出：1
 *
 * 提示：
 * 0 <= n <= 100
 * 注意：本题与主站 70 题相同：<a href="https://leetcode-cn.com/problems/climbing-stairs/">https://leetcode-cn.com/problems/climbing-stairs/</a>
 */
public class FrogJumpingProblem {
    /**
     * 方法：动态规划
     *
     * 上 1 阶台阶：有1种方式。
     * 上 2 阶台阶：有1+1和2两种方式。
     * 上 3 阶台阶：到达第3阶的方法总数就是到第1阶和第2阶的方法数之和。
     * 上 n 阶台阶，到达第n阶的方法总数就是到第 (n-1) 阶和第 (n-2) 阶的方法数之和。
     * 状态方程：dp[n] = dp[n-1] + dp[n-2]
     *
     * @param n 阶数
     * @return 方案数
     */
    public int numWays(int n) {
        //特殊情况
        if(n == 0 || n == 1)
            return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; ++i){
            dp[i] = (dp[i-1] + dp[i-2])%1000000007;
        }
        return dp[n];
    }
}
