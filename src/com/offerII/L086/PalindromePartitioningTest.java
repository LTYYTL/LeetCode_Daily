package com.offerII.L086;

import java.util.Arrays;

public class PalindromePartitioningTest {
    public static void main(String[] args) {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        /*
          示例 1：
          输入：s = "aab"
          输出：[["a","a","b"],["aa","b"]]
         */
        System.out.println(Arrays.deepToString(palindromePartitioning.partition("aab")));
        /*
          示例 2：
          输入：s = "a"
          输出：[["a"]]
         */
        System.out.println(Arrays.deepToString(palindromePartitioning.partition("a")));
    }
}
