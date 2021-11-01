package com.offerII.L093;

public class LengthLongestFibonacciSubsequenceTest {
    public static void main(String[] args) {
        LengthLongestFibonacciSubsequence lengthLongestFibonacciSubsequence = new LengthLongestFibonacciSubsequence();
        /**
         * 示例 1：
         * 输入: arr = [1,2,3,4,5,6,7,8]
         * 输出: 5
         * 解释: 最长的斐波那契式子序列为 [1,2,3,5,8] 。
         */
        System.out.println(lengthLongestFibonacciSubsequence.lenLongestFibSubseq(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        /**
         * 示例 2：
         * 输入: arr = [1,3,7,11,12,14,18]
         * 输出: 3
         * 解释: 最长的斐波那契式子序列有 [1,11,12]、[3,11,14] 以及 [7,11,18] 。
         */
        System.out.println(lengthLongestFibonacciSubsequence.lenLongestFibSubseq(new int[]{1, 3, 7, 11, 12, 14, 18}));
    }
}
