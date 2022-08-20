package com.offerII.L093;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 剑指 Offer II 093. 最长斐波那契数列
 * 如果序列 X_1, X_2, ..., X_n 满足下列条件，就说它是 斐波那契式 的：
 * (1)n >= 3
 * (2)对于所有 i + 2 <= n，都有 X_i + X_{i+1} = X_{i+2}
 * 给定一个严格递增的正整数数组形成序列 arr ，找到 arr 中最长的斐波那契式的子序列的长度。如果一个不存在，返回  0 。
 *
 * （回想一下，子序列是从原序列 arr 中派生出来的，它从 arr 中删掉任意数量的元素（也可以不删），而不改变其余元素的顺序。例如， [3, 5, 8] 是 [3, 4, 5, 6, 7, 8] 的一个子序列）
 *
 * 示例 1：
 * 输入: arr = [1,2,3,4,5,6,7,8]
 * 输出: 5
 * 解释: 最长的斐波那契式子序列为 [1,2,3,5,8] 。
 *
 * 示例 2：
 * 输入: arr = [1,3,7,11,12,14,18]
 * 输出: 3
 * 解释: 最长的斐波那契式子序列有 [1,11,12]、[3,11,14] 以及 [7,11,18] 。
 *
 * 提示：
 * 3 <= arr.length <= 1000
 * 1 <= arr[i] < arr[i + 1] <= 10^9
 * 注意：本题与主站 873题相同：<a href="https://leetcode-cn.com/problems/length-of-longest-fibonacci-subsequence/">https://leetcode-cn.com/problems/length-of-longest-fibonacci-subsequence/</a>
 *
 */
public class LengthLongestFibonacciSubsequence {
    /**
     * 方法：动态规划
     * @param arr
     * @return
     */
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        //dp[i][j]:表示以arr[i]、arr[j]为结尾的两个数
        int[][] dp = new int[n][n];
        //长度
        int res = 0;
        //记录每个数的索引
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }

        //从0开始没有意义，所以从1开始
        //i到n也是没有意义的操作
        for (int i = 1; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                //temp + arr[i] == arr[j]
                int temp = arr[j] - arr[i];
                //temp存在，且索引比i小
                if (map.containsKey(temp) && map.get(temp) < i){
                    //获得索引
                    int k = map.get(temp);
                    //在原来基础上加上一个长度
                    dp[i][j] = dp[k][i] + 1;
                    //+2的原因是因为初始化为0，必须有两个才可以
                    res = Math.max(res,dp[i][j]+2);
                }
            }
        }
        return res;
    }

    /**
     * 方法二：set集合
     * @param A
     * @return
     */
    public int lenLongestFibSubseq_set(int[] A) {
        int N = A.length;
        Set<Integer> S = new HashSet();
        for (int x: A) S.add(x);

        int ans = 0;
        for (int i = 0; i < N; ++i)
            for (int j = i+1; j < N; ++j) {
                /* With the starting pair (A[i], A[j]),
                 * y represents the future expected value in
                 * the fibonacci subsequence, and x represents
                 * the most current value found. */
                int x = A[j], y = A[i] + A[j];
                int length = 2;
                while (S.contains(y)) {
                    // x, y -> y, x+y
                    int tmp = y;
                    y += x;
                    x = tmp;
                    ans = Math.max(ans, ++length);
                }
            }

        return ans >= 3 ? ans : 0;
    }

}
