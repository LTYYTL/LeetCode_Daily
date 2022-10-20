package com.leetcode.L901_1000.L0940;

/**
 * 940. 不同的子序列 II
 * 给定一个字符串 s，计算 s 的 不同非空子序列 的个数。因为结果可能很大，所以返回答案需要对 10^9 + 7 取余 。
 * 字符串的 子序列 是经由原字符串删除一些（也可能不删除）字符但不改变剩余字符相对位置的一个新字符串。
 * 例如，"ace" 是 "abcde" 的一个子序列，但 "aec" 不是。
 * <p>
 * 示例 1：
 * 输入：s = "abc"
 * 输出：7
 * 解释：7 个不同的子序列分别是 "a", "b", "c", "ab", "ac", "bc", 以及 "abc"。
 * <p>
 * 示例 2：
 * 输入：s = "aba"
 * 输出：6
 * 解释：6 个不同的子序列分别是 "a", "b", "ab", "ba", "aa" 以及 "aba"。
 * <p>
 * 示例 3：
 * 输入：s = "aaa"
 * 输出：3
 * 解释：3 个不同的子序列分别是 "a", "aa" 以及 "aaa"。
 */
public class DistinctSubsequencesII {
    /**
     * 方法：字符串
     */
    public int distinctSubseqII(String s) {
        int mod = (int) 1e9 + 7;
        long result = 0L;
        long[] letter = new long[26]; // 记录26个字符每个字符的子序列总数
        for (char sc : s.toCharArray()) {
            long pre = letter[sc - 'a']; // 获得字符sc前一次统计的子序列数
            letter[sc - 'a'] = (result + 1) % mod; // 计算当前字符sc的子序列数
            result = (result + letter[sc - 'a'] - pre + mod) % mod; // 加mod的目的是为了防止结果溢出为负数
        }
        return (int) result;
    }
}
