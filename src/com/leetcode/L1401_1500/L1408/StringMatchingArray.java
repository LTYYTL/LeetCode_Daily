package com.leetcode.L1401_1500.L1408;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 1408. 数组中的字符串匹配
 * 给你一个字符串数组 words ，数组中的每个字符串都可以看作是一个单词。请你按 任意 顺序返回 words 中是其他单词的子字符串的所有单词。
 * 如果你可以删除 words[j] 最左侧和/或最右侧的若干字符得到 word[i] ，那么字符串 words[i] 就是 words[j] 的一个子字符串。
 * <p>
 * 示例 1：
 * 输入：words = ["mass","as","hero","superhero"]
 * 输出：["as","hero"]
 * 解释："as" 是 "mass" 的子字符串，"hero" 是 "superhero" 的子字符串。
 * ["hero","as"] 也是有效的答案。
 * <p>
 * 示例 2：
 * 输入：words = ["leetcode","et","code"]
 * 输出：["et","code"]
 * 解释："et" 和 "code" 都是 "leetcode" 的子字符串。
 * <p>
 * 示例 3：
 * 输入：words = ["blue","green","bu"]
 * 输出：[]
 * <p>
 * 提示：
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 30
 * words[i] 仅包含小写英文字母。
 * 题目数据 保证 每个 words[i] 都是独一无二的。
 */
public class StringMatchingArray {
    /**
     * 方法：排序
     *
     * @param words
     * @return
     */
    public List<String> stringMatching(String[] words) {
        //按照字符串长度从小到大排序
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        //结果
        List<String> res = new ArrayList<>();
        //遍历
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                //是否是别的字符串字串
                if (words[j].indexOf(words[i]) != -1) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}
