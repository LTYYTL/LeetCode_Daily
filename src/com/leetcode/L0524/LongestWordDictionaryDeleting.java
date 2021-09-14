package com.leetcode.L0524;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 524. 通过删除字母匹配到字典里最长单词
 * 给你一个字符串 s 和一个字符串数组 dictionary 作为字典，找出并返回字典中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
 * 如果答案不止一个，返回长度最长且字典序最小的字符串。如果答案不存在，则返回空字符串。
 *
 * 示例 1：
 * 输入：s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
 * 输出："apple"
 *
 * 示例 2：
 * 输入：s = "abpcplea", dictionary = ["a","b","c"]
 * 输出："a"
 *
 * 提示：
 * 1 <= s.length <= 1000
 * 1 <= dictionary.length <= 1000
 * 1 <= dictionary[i].length <= 1000
 * s 和 dictionary[i] 仅由小写英文字母组成
 */
public class LongestWordDictionaryDeleting {
    /**
     * 方法：双指针
     * @param s
     * @param dictionary
     * @return
     */
    public String findLongestWord(String s, List<String> dictionary) {
        //字符长度
        int n = s.length();
        //存储匹配的单词
        List<String> list = new ArrayList<>();
        //遍历字典
        for (String dir : dictionary) {
            //指向单词字母的指针
            int k = 0;
            //单词长度
            int len = dir.length();
            //查看单词是否匹配
            for (int i = 0; i < n && k < len;i++){
                if (s.charAt(i) == dir.charAt(k))
                    k++;
            }
            //当完全匹配放去集合
            if (k == len)
                list.add(dir);
        }
        //没有匹配的单词
        if (list.isEmpty())
            return "";
        //排序，长度从大到小，长度相等，按照字典序
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() != o2.length() ? o2.length()-o1.length():o1.compareTo(o2);
            }
        });
        //返回第一个
        return list.get(0);
    }
}
