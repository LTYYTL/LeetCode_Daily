package com.leetcode.L501_600.L0526;

import java.util.ArrayList;
import java.util.List;

/**
 * 526. 优美的排列
 * 假设有从 1 到 n 的 n 个整数。用这些整数构造一个数组 perm（下标从 1 开始），只要满足下述条件 之一 ，该数组就是一个 优美的排列 ：
 * perm[i] 能够被 i 整除
 * i 能够被 perm[i] 整除
 * 给你一个整数 n ，返回可以构造的 优美排列 的 数量 。
 *
 * 示例 1：
 * 输入：n = 2
 * 输出：2
 * 解释：
 * 第 1 个优美的排列是 [1,2]：
 *     - perm[1] = 1 能被 i = 1 整除
 *     - perm[2] = 2 能被 i = 2 整除
 * 第 2 个优美的排列是 [2,1]:
 *     - perm[1] = 2 能被 i = 1 整除
 *     - i = 2 能被 perm[2] = 1 整除
 *
 * 示例 2：
 * 输入：n = 1
 * 输出：1
 *
 * 提示：
 * 1 <= n <= 15
 */
public class BeautifulArrangement {
    /**
     * 方法一：回溯算法
     */
    List<Integer>[] match;
    boolean[] vis;
    int num;
    public int countArrangement(int n) {
        vis = new boolean[n+1];
        match = new List[n+1];

        for (int i = 0; i <= n; i++) {
            match[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0)
                    match[i].add(j);
            }
        }

        backtrack(1,n);
        return num;
    }

    private void backtrack(int index, int n) {
        if (index == n+1){
            num++;
            return;
        }
        for (Integer x : match[index]) {
            if (!vis[x]){
                vis[x] = true;
                backtrack(index+1, n);
                vis[x] = false;
            }
        }
    }

    /**
     * 方法：动态规划
     */
    public int countArrangement_dp(int n){
        int mask = 1 << n;
        int[][] f = new int[n + 1][mask];
        f[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            // 枚举所有的状态
            for (int state = 0; state < mask; state++) {
                // 枚举位置 i（最后一位）选的数值是 k
                for (int k = 1; k <= n; k++) {
                    // 首先 k 在 state 中必须是 1
                    if (((state >> (k - 1)) & 1) == 0) continue;
                    // 数值 k 和位置 i 之间满足任一整除关系
                    if (k % i != 0 && i % k != 0) continue;
                    // state & (~(1 << (k - 1))) 代表将 state 中数值 k 的位置置零
                    f[i][state] += f[i - 1][state & (~(1 << (k - 1)))];
                }
            }
        }
        return f[n][mask - 1];
    }
}
