package com.leetcode.L201_300.L0204;

import java.util.Arrays;

/**
 * 204. 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例 1：
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 *
 * 示例 2：
 * 输入：n = 0
 * 输出：0
 *
 * 示例 3：
 * 输入：n = 1
 * 输出：0
 *
 * 提示：
 * 0 <= n <= 5 * 106
 */
public class CountPrimes {
    /**
     * 方法：埃氏筛
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        int ans = 0;
        for (int i = 2; i*i < n; ++i) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i< n; i++){
            if (isPrime[i])
                ans++;
        }
        return ans;
    }
}
