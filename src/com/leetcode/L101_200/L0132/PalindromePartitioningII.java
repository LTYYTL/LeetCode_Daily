package com.leetcode.L101_200.L0132;

/**
 * 剑指 Offer II 094. 最少回文分割
 * 给定一个字符串 s，请将 s 分割成一些子串，使每个子串都是回文串。
 * 返回符合要求的 最少分割次数 。
 *
 * 示例 1：
 * 输入：s = "aab"
 * 输出：1
 * 解释：只需一次分割就可将 s 分割成 ["aa","b"] 这样两个回文子串。
 *
 * 示例 2：
 * 输入：s = "a"
 * 输出：0
 *
 * 示例 3：
 * 输入：s = "ab"
 * 输出：1
 *
 * 提示：
 * 1 <= s.length <= 2000
 * s 仅由小写英文字母组成
 *
 * 注意：本题与主站 132 题相同： <a href="https://leetcode-cn.com/problems/palindrome-partitioning-ii/">https://leetcode-cn.com/problems/palindrome-partitioning-ii/</a>
 */
public class PalindromePartitioningII {
    /**
     * 方法：动态规划
     * @param s
     * @return
     */
    public int minCut(String s) {
        //长度
        int n = s.length();
        //只有一个字符
        if (n < 2)
            return 0;
        //dp[i]:表示从0~i的字符串的最小分割数
        int[] dp = new int[n];
        //一个字符也是一个回文串，即初始化按每个字符分割
        for (int i = 0; i < n; i++) {
            dp[i] = i;
        }
        //遍历字符串，从0开始没有意义
        for (int i = 1; i < n; i++) {
            //判断从0~i是否是回文串
            if (isValid(s,0,i)){
                //字符串不用分割，直接变成0，进入下一个字符
                dp[i] = 0;
                continue;
            }
            //如果0~i不是回文串，在i之前找到分割点j，保证j+1~i是回文数
            //这样0~i的最小分割数就转换成0~j的最小分割数+1的情况了
            //即dp[i] = min(dp[i],dp[j]+1)
            for (int j = 0; j < i; j++) {
                if (isValid(s,j+1,i))
                    dp[i] = Math.min(dp[i],dp[j]+1);
            }
        }
        return dp[n-1];
    }

    /**
     * 判断是否是回文串
     * @param s
     * @param left
     * @param right
     * @return
     */
    private boolean isValid(String s, int left, int right) {
        while (left < right){
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
}
