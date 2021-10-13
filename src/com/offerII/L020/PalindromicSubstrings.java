package com.offerII.L020;

/**
 * 剑指 Offer II 020. 回文子字符串的个数
 * 给定一个字符串 s ，请计算这个字符串中有多少个回文子字符串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 *
 * 示例 1：
 * 输入：s = "abc"
 * 输出：3
 * 解释：三个回文子串: "a", "b", "c"
 *
 * 示例 2：
 * 输入：s = "aaa"
 * 输出：6
 * 解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s 由小写英文字母组成
 *
 * 注意：本题与主站 647 题相同：https://leetcode-cn.com/problems/palindromic-substrings/
 */
public class PalindromicSubstrings {
    /**
     * 方法：动态规划
     * @param s
     * @return
     */
    public int countSubstrings(String s) {
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        int count = 0;//回文串的数量
        for (int j = 0; j < length; j++) {
            for (int i = 0; i <= j; i++) {
                //如果i和j指向的字符不一样，那么dp[i][j]就
                //不能构成回文字符串
                if (s.charAt(i) != s.charAt(j))
                    continue;
                dp[i][j] = j - i <= 2 || dp[i + 1][j - 1];
                //如果从i到j能构成回文串，count就加1
                if (dp[i][j])
                    count++;
            }
        }
        return count;
    }
}
