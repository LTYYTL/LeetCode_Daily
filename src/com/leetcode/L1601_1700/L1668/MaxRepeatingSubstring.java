package com.leetcode.L1601_1700.L1668;

/**
 * 1668. 最大重复子字符串
 * 给你一个字符串 sequence ，如果字符串 word 连续重复 k 次形成的字符串是 sequence 的一个子字符串，那么单词 word 的 重复值为 k 。
 * 单词 word 的 最大重复值 是单词 word 在 sequence 中最大的重复值。如果 word 不是 sequence 的子串，那么重复值 k 为 0 。
 * <p>
 * 给你一个字符串 sequence 和 word ，请你返回 最大重复值 k 。
 * <p>
 * 示例 1：
 * 输入：sequence = "ababc", word = "ab"
 * 输出：2
 * 解释："abab" 是 "ababc" 的子字符串。
 * <p>
 * 示例 2：
 * 输入：sequence = "ababc", word = "ba"
 * 输出：1
 * 解释："ba" 是 "ababc" 的子字符串，但 "baba" 不是 "ababc" 的子字符串。
 * <p>
 * 示例 3：
 * 输入：sequence = "ababc", word = "ac"
 * 输出：0
 * 解释："ac" 不是 "ababc" 的子字符串。
 * <p>
 * 提示：
 * 1 <= sequence.length <= 100
 * 1 <= word.length <= 100
 * sequence 和 word 都只包含小写英文字母。
 */
public class MaxRepeatingSubstring {
    /**
     * 方法 ：暴力法
     */
    public int maxRepeating(String sequence, String word) {
        // 长度
        int length = sequence.length();
        int wordLen = word.length();

        // 结果
        int res = 0;
        // 遍历
        for (int i = 0; i < length; i++) {
            // 不符合条件
            if (sequence.charAt(i) != word.charAt(0)) {
                continue;
            }
            // 索引
            int j = 0;
            // 不越界并且匹配，有连续需要取余
            while (i + j < length && sequence.charAt(i + j) == word.charAt(j % wordLen)) {
                j++;
            }
            // 记录最大的连续
            res = Math.max(res, j / wordLen);
        }
        return res;
    }
}
