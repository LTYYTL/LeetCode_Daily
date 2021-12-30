package com.leetcode.L1601_1700.L1684;

import java.util.HashSet;
import java.util.Set;
/**
 * 1684. 统计一致字符串的数目
 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
 * 请你返回 words 数组中 一致字符串 的数目。
 *
 * 示例 1：
 * 输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * 输出：2
 * 解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
 *
 * 示例 2：
 * 输入：allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * 输出：7
 * 解释：所有字符串都是一致的。
 *
 * 示例 3：
 * 输入：allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * 输出：4
 * 解释：字符串 "cc"，"acd"，"ac" 和 "d" 是一致字符串。
 *
 * 提示：
 * 1 <= words.length <= 104
 * 1 <= allowed.length <= 26
 * 1 <= words[i].length <= 10
 * allowed 中的字符 互不相同 。
 * words[i] 和 allowed 只包含小写英文字母。
 */
public class CountNumConsistentStr {
    /**
     * 方法：set集合
     * @param allowed
     * @param words
     * @return
     */
    public int countConsistentStrings(String allowed, String[] words) {
        //存储出现的字母
        Set<Character> set = new HashSet<>();
        //遍历
        for (int i = 0; i < allowed.length(); i++) {
            //字母
            char c = allowed.charAt(i);
            //存入set
            set.add(c);
        }
        //结果
        int ans = 0;
        //遍历
        for (String word : words) {
            //存在字母的个数
            int len = 0;
            //遍历单词
            for (int i = 0; i < word.length(); i++) {
                //当前字母
                char c = word.charAt(i);
                //如果存在，存在字数+1
                if (!set.contains(c))
                    break;
                //如果存在，存在字数+1
                len++;
            }
            //每个字母都存在符合条件
            if (len == word.length())
                ans++;
        }
        return ans;
    }
}
