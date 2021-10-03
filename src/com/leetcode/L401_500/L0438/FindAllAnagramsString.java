package com.leetcode.L401_500.L0438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 438. 找到字符串中所有字母异位词
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 *
 * 说明：
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 *
 * 示例 1:
 * 输入:
 * s: "cbaebabacd" p: "abc"
 * 输出:
 * [0, 6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 *
 * 示例 2:
 * 输入:
 * s: "abab" p: "ab"
 * 输出:
 * [0, 1, 2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
 */
public class FindAllAnagramsString {
    /**
     * 方法：滑动窗口
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        //记录t中字符出现的次数
        Map<Character,Integer> needs = new HashMap<>();
        for (char c : p.toCharArray()) {
            needs.put(c,needs.getOrDefault(c,0)+1);
        }

        //窗口内字符出现的次数
        Map<Character,Integer> window = new HashMap<>();

        //窗口的左右边界
        int left = 0,right = 0;
        //表示记录窗口满足条件的字符个数
        int valid = 0;

        List<Integer> res = new ArrayList<>();

        while (right < s.length()){
            //c是移入窗口的字符
            char c = s.charAt(right);
            //右移窗口
            right++;
            //进行窗口内数据的一系列更新
            if (needs.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(needs.get(c)))
                    valid++;
            }

            while (right - left >= p.length()){
                //满足条件的合法排序
                if (valid == needs.size())
                    res.add(left);
                //d是将移除窗口的字符
                char d = s.charAt(left);
                //左移动窗口
                left++;
                //进行窗口内数据的一系列更新
                if (needs.containsKey(d)){
                    if (window.get(d).equals(needs.get(d)))
                        valid--;
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return res;
    }

}
