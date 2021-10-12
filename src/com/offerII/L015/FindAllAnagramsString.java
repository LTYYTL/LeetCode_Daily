package com.offerII.L015;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 剑指 Offer II 015. 字符串中的所有变位词
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 变位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * 变位词 指字母相同，但排列不同的字符串。
 *
 * 示例 1:
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的变位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的变位词。
 *
 * 示例 2:
 * 输入: s = "abab", p = "ab"
 * 输出: [0,1,2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的变位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的变位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的变位词。
 *
 * 提示:
 * 1 <= s.length, p.length <= 3 * 104
 * s 和 p 仅包含小写字母
 *
 * 注意：本题与主站 438 题相同： https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAllAnagramsString {
    /**
     * 方法；滑动窗口
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
