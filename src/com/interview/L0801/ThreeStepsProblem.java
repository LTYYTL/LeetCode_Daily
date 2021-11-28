package com.interview.L0801;

/**
 * 面试题 08.01. 三步问题
 * 三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模1000000007。
 *
 * 示例1:
 *  输入：n = 3
 *  输出：4
 *  说明: 有四种走法
 *
 * 示例2:
 *
 *  输入：n = 5
 *  输出：13
 *
 * 提示:
 * n范围在[1, 1000000]之间
 */
public class ThreeStepsProblem {
    /**
     * 方法：动态规划
     * @param n
     * @return
     */
    public int waysToStep(int n) {
        //取模
        int MOD = 1000000007;
        //1的情况
        if (n == 1)
            return 1;
        //2的情况
        if (n == 2)
            return 2;
        //3的情况
        if (n == 3)
            return 4;
        //初始化
        long[] dp = new long[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        //从4开始，dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i-1]%MOD + dp[i-2]%MOD + dp[i-3]%MOD) % MOD;
        }
        return (int) dp[n];
    }
}
