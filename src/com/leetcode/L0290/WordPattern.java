package com.leetcode.L0290;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 290. 单词规律
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 示例1:
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 *
 * 示例 2:
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 *
 * 示例 3:
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 *
 * 示例 4:
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 *
 * 说明:
 * 你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。
 */
public class WordPattern {
    /**
     * 方法：哈希表
     * @param pattern
     * @param s
     * @return
     */
    public boolean wordPattern(String pattern, String s) {
        //转化成数组
        char[] chars = pattern.toCharArray();
        String[] strings = s.split(" ");
        //数组长度不同直接返回false
        if (chars.length != strings.length) {
            return false;
        }
        //双向映射
        Map<String, Character> str2ch = new HashMap<>();
        Map<Character, String> ch2str = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            //如果当前单词存在于以string的map中，其所对应的字母与当前的不符合直接返回false
            if (str2ch.containsKey(strings[i]) && str2ch.get(strings[i]) != chars[i]) {
                return false;
            }
            //如果当前字母存在于以char的map中，其所对应的单词与当前的不符合直接返回false
            if (ch2str.containsKey(chars[i]) && !ch2str.get(chars[i]).equals(strings[i])) {
                return false;
            }
            //都不存在时，将其双射加入对应的map中
            str2ch.put(strings[i], chars[i]);
            ch2str.put(chars[i], strings[i]);
        }
        return true;
    }
}
