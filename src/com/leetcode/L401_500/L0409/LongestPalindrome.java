package com.leetcode.L401_500.L0409;

/**
 * 409. 最长回文串
 * 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
 * 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
 * <p>
 * 示例 1:
 * 输入:s = "abccccdd"
 * 输出:7
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * <p>
 * 示例 2:
 * 输入:s = "a"
 * 输入:1
 * <p>
 * 示例 3:
 * 输入:s = "bb"
 * 输入: 2
 * <p>
 * 提示:
 * 1 <= s.length <= 2000
 * s 只能由小写和/或大写英文字母组成
 */
public class LongestPalindrome {
    /**
     * 方法：模拟
     *
     * @param s
     * @return
     */
    public int longestPalindrome(String s) {
        //记录字母出现的个数
        int[] arr = new int[26 + 26];
        //遍历
        for (int i = 0; i < s.length(); i++) {
            //当前字符
            char c = s.charAt(i);
            //判断大小写
            if (Character.isLowerCase(c)) {
                arr[c - 'a']++;
            } else {
                arr[c - 'A' + 26]++;
            }
        }

        //长度
        int res = 0;
        //记录奇数字母的个数
        int odd = 0;
        //遍历
        for (int j : arr) {
            //奇数记录
            if (j % 2 == 1)
                odd++;
            res += j;
        }
        //分情况
        return odd == 0 ? res : res - odd + 1;
    }
}
