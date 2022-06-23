package com.leetcode.L1_100.L0030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 30. 串联所有单词的子串
 * 给定一个字符串 s 和一些 长度相同 的单词 words 。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 * <p>
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符 ，但不需要考虑 words 中单词串联的顺序。
 * <p>
 * 示例 1：
 * 输入：s = "barfoothefoobarman", words = ["foo","bar"]
 * 输出：[0,9]
 * 解释：
 * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 * <p>
 * 示例 2：
 * 输入：s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
 * 输出：[]
 * <p>
 * 示例 3：
 * 输入：s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
 * 输出：[6,9,12]
 * <p>
 * 提示：
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 * 1 <= words.length <= 5000
 * 1 <= words[i].length <= 30
 * words[i] 由小写英文字母组成
 */
public class SubstringAllWords {
    /**
     * 方法：滑动窗口
     *
     * @param s
     * @param words
     * @return
     */
    public List<Integer> findSubstring(String s, String[] words) {
        //单词个数
        int n = words.length;
        //单词长度
        int wordLength = words[0].length();
        //结果
        List<Integer> res = new ArrayList<>();
        //存放单词出现饿个数
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }

        //滑动窗口
        for (int i = 0; i < s.length() - n * wordLength + 1; i++) {
            //记录窗口中出现的单词
            HashMap<String, Integer> window = new HashMap<>();
            //出现异常
            boolean flag = false;
            //遍历
            for (int j = 0; j < n; j++) {
                //截取单词
                String cur = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
                //是否存在这个单词
                if (!wordsMap.containsKey(cur)) {
                    //异常
                    flag = true;
                    break;
                }

                //记录窗口单词
                window.put(cur, window.getOrDefault(cur, 0) + 1);

                //窗口中单词出现次数比原本的多的情况
                if (window.get(cur) > wordsMap.get(cur)) {
                    flag = true;
                    break;
                }
            }
            //不是异常情况
            if (!flag) {
                res.add(i);
            }
        }
        return res;
    }
}
