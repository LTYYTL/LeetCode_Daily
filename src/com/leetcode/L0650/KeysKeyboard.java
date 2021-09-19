package com.leetcode.L0650;

/**
 * 650. 只有两个键的键盘
 * 最初记事本上只有一个字符 'A' 。你每次可以对这个记事本进行两种操作：
 * Copy All（复制全部）：复制这个记事本中的所有字符（不允许仅复制部分字符）。
 * Paste（粘贴）：粘贴 上一次 复制的字符。
 * 给你一个数字 n ，你需要使用最少的操作次数，在记事本上输出 恰好 n 个 'A' 。返回能够打印出 n 个 'A' 的最少操作次数。
 *
 * 示例 1：
 * 输入：3
 * 输出：3
 * 解释：
 * 最初, 只有一个字符 'A'。
 * 第 1 步, 使用 Copy All 操作。
 * 第 2 步, 使用 Paste 操作来获得 'AA'。
 * 第 3 步, 使用 Paste 操作来获得 'AAA'。
 *
 * 示例 2：
 * 输入：n = 1
 * 输出：0
 *
 * 提示：
 * 1 <= n <= 1000
 */
public class KeysKeyboard {
    /**
     * 方法：动态规划
     * @param n
     * @return
     */
    public int minSteps(int n) {
        int[] dp = new int[n+1];
        for (int i = 2; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i ; j++) {
                //j是i的因数
                if(i % j == 0){
                    //有j个A，需要复制i/j次
                    dp[i] = Math.min(dp[i],dp[j]+i/j);
                    //有i/j个A，需要复制j次
                    dp[i] = Math.min(dp[i],dp[i/j]+j);
                }
            }
        }
        return dp[n];
    }
}
