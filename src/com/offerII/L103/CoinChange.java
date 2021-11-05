package com.offerII.L103;

import java.util.Arrays;

/**
 * 剑指 Offer II 103. 最少的硬币数目
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * 你可以认为每种硬币的数量是无限的。
 *
 * 示例 1：
 * 输入：coins = [1, 2, 5], amount = 11
 * 输出：3
 * 解释：11 = 5 + 5 + 1
 *
 * 示例 2：
 * 输入：coins = [2], amount = 3
 * 输出：-1
 *
 * 示例 3：
 * 输入：coins = [1], amount = 0
 * 输出：0
 *
 * 示例 4：
 * 输入：coins = [1], amount = 1
 * 输出：1
 *
 * 示例 5：
 * 输入：coins = [1], amount = 2
 * 输出：2
 *
 * 提示：
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 231 - 1
 * 0 <= amount <= 104
 *
 * 注意：本题与主站 322 题相同： https://leetcode-cn.com/problems/coin-change/
 */
public class CoinChange {
    /**
     * 方法：动态规划
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        //dp数组
        int[] dp = new int[amount+1];
        //amount最多有amount枚硬币组成(全为1元)，amount+1为正无穷
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i < amount+1; i++) {
            //遍历硬币
            for (int coin : coins) {
                //无解的情况
                if (i - coin < 0)
                    continue;
                dp[i] = Math.min(dp[i],dp[i-coin]+1);
            }
        }
        //如果是正无穷则返回-1
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }
}
