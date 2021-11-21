package com.leetcode.L1_100.L0005;

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 *
 * 示例 2：
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 * 示例 3：
 * 输入：s = "a"
 * 输出："a"
 *
 * 示例 4：
 * 输入：s = "ac"
 * 输出："a"
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 */
public class LongestPalindromicSubstring {
    /**
     * 方法：模拟
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            //以s[i]为中心的回文子串
            String s1 = palindrome(s,i,i);
            //以s[i]和s[i+1]为中心的回文子串
            String s2 = palindrome(s,i,i+1);
            //获取最长
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    private String palindrome(String s, int left, int right) {
        //判断是否相等，且防止越界
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            //向外扩张
            left--;
            right++;
        }

        return s.substring(left+1,right);
    }
}
