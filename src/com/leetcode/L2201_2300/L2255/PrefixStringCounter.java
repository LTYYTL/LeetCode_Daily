package com.leetcode.L2201_2300.L2255;

/**
 * 2255. 统计是给定字符串前缀的字符串数目
 * 给你一个字符串数组 words 和一个字符串 s ，其中 words[i] 和 s 只包含 小写英文字母 。
 * 请你返回 words 中是字符串 s 前缀 的 字符串数目 。
 *
 * 一个字符串的 前缀 是出现在字符串开头的子字符串。子字符串 是一个字符串中的连续一段字符序列。
 *
 * 示例 1：
 * 输入：words = ["a","b","c","ab","bc","abc"], s = "abc"
 * 输出：3
 * 解释：
 * words 中是 s = "abc" 前缀的字符串为：
 * "a" ，"ab" 和 "abc" 。
 * 所以 words 中是字符串 s 前缀的字符串数目为 3 。
 *
 * 示例 2：
 * 输入：words = ["a","a"], s = "aa"
 * 输出：2
 * 解释：
 * 两个字符串都是 s 的前缀。
 * 注意，相同的字符串可能在 words 中出现多次，它们应该被计数多次。
 *
 * 提示：
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, s.length <= 10
 * words[i] 和 s 只 包含小写英文字母。
 */
public class PrefixStringCounter {
    public int countPrefixes(String[] words, String s) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isPrefix(word, s)){
                result++;
            }
        }

        return result;
    }

    private boolean isPrefix(String prefix, String s){
        if (prefix.length() > s.length()){
            return false;
        }
        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
