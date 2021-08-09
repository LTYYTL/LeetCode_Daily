package com.leetcode.L0313;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 313. 超级丑数
 * 超级丑数 是一个正整数，并满足其所有质因数都出现在质数数组 primes 中。
 * 给你一个整数 n 和一个整数数组 primes ，返回第 n 个 超级丑数 。
 * 题目数据保证第 n 个 超级丑数 在 32-bit 带符号整数范围内。
 *
 * 示例 1：
 * 输入：n = 12, primes = [2,7,13,19]
 * 输出：32
 * 解释：给定长度为 4 的质数数组 primes = [2,7,13,19]，前 12 个超级丑数序列为：[1,2,4,7,8,13,14,16,19,26,28,32] 。
 *
 * 示例 2：
 * 输入：n = 1, primes = [2,3,5]
 * 输出：1
 * 解释：1 不含质因数，因此它的所有质因数都在质数数组 primes = [2,3,5] 中。
 *
 * 提示：
 * 1 <= n <= 106
 * 1 <= primes.length <= 100
 * 2 <= primes[i] <= 1000
 * 题目数据 保证 primes[i] 是一个质数
 * primes 中的所有值都 互不相同 ，且按 递增顺序 排列
 */
public class SuperUglyNumber {
    /**
     * 方法一：堆
     * @param n
     * @param primes
     * @return
     */
    public int nthSuperUglyNumber(int n, int[] primes) {
        //去除重复
        Set<Long> set = new HashSet<>();
        //小根堆
        PriorityQueue<Long> queue = new PriorityQueue<>();
        //存入1
        set.add(1L);
        queue.add(1L);
        //结果集
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            //堆首元素
            long cur = queue.poll();
            //转换成int
            ugly = (int)cur;
            //遍历质数
            for (int prime : primes) {
                long next = cur * prime;
                //判断是否出现过
                if (set.add(next)){
                    queue.add(next);
                }
            }
        }
        return ugly;
    }

    /**
     * 方法二：动态规划
     * @param n
     * @param primes
     * @return
     */
    public int nthSuperUglyNumber_dp(int n, int[] primes) {
        // 动态规划
        int[] dp = new int[n + 1];
        // 初始化
        dp[0] = 1;
        int m = primes.length;
        // 计数数组，将每个质数所累乘的个数记录
        int[] pointers = new int[m];
        // 每个都初始化为0
        Arrays.fill(pointers, 0);
        // 直到找到对应的数
        for (int i = 1; i < n; i++) {
            int minNum = Integer.MAX_VALUE;
            int minBase = 0;
            for (int j = 0; j < m; j++) {
                // 为什么用的是pointers[]，而不是直接i-1
                // 因为这是一个多指针的问题，不能直接在dp[i-1]的基础上往上乘一个质数
                // 对于dp数组中的每一个数，他们都要资格乘一个当前的质数
                int newNums = dp[pointers[j]] * primes[j];
                // 出现重复的要跳过，比如2*7与7*2
                if(newNums == minNum){
                    pointers[j]++;
                    continue;
                }
                // 找到其中最小的
                if(newNums < minNum){
                    minNum = newNums;
                    minBase = j;
                }
            }

            // 最小的当然就是下一个了
            dp[i] = minNum;
            // System.out.println(dp[i]);
            // 将对应的pointers指针后移
            pointers[minBase]++;
        }
        return dp[n-1];
    }

}
