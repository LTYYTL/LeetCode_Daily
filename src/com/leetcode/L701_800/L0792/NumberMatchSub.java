package com.leetcode.L701_800.L0792;

import java.util.ArrayList;
import java.util.List;

/**
 * 792. 匹配子序列的单词数
 * 给定字符串 s 和字符串数组 words, 返回  words[i] 中是s的子序列的单词个数 。
 * 字符串的 子序列 是从原始字符串中生成的新字符串，可以从中删去一些字符(可以是none)，而不改变其余字符的相对顺序。
 * 例如， “ace” 是 “abcde” 的子序列。
 * <p>
 * 示例 1:
 * 输入: s = "abcde", words = ["a","bb","acd","ace"]
 * 输出: 3
 * 解释: 有三个是 s 的子序列的单词: "a", "acd", "ace"。
 * <p>
 * 示例 2:
 * 输入: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
 * 输出: 2
 * <p>
 * 提示:
 * 1 <= s.length <= 5 * 104
 * 1 <= words.length <= 5000
 * 1 <= words[i].length <= 50
 * words[i]和 s 都只由小写字母组成。
 */
public class NumberMatchSub {
    /**
     * 方法：二分查找
     */
    public int numMatchingSubseq(String s, String[] words) {
        // 预处理
        List<Integer>[] index = new ArrayList[26];

        // 记录每个字母出现的索引
        for (int i = 0; i < s.length(); i++) {
            // 当前字符
            char c = s.charAt(i);
            // 初始化
            if (index[c - 'a'] == null) {
                index[c - 'a'] = new ArrayList<>();
            }
            // 记录索引
            index[c - 'a'].add(i);
        }

        // 结果
        int res = 0;

        // 遍历
        for (String word : words) {
            // word的索引
            int i = 0;
            // s的索引
            int j = 0;
            // 遍历
            for (; i < word.length(); i++) {
                // 当前字符
                char c = word.charAt(i);
                // 在s中不存在
                if (index[c - 'a'] == null) {
                    break;
                }

                // 符合条件的字符索引
                int pos = left_bound(index[c - 'a'], j);

                // 没有符合条件的索引
                if (pos == -1) {
                    break;
                }
                // 移动指针
                j = index[c - 'a'].get(pos) + 1;
            }
            // 完全匹配，则是子序列
            if (i == word.length()) {
                res++;
            }
        }

        return res;
    }

    private int left_bound(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size();
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (target > arr.get(mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (left == arr.size()) {
            return -1;
        }
        return left;
    }
}
