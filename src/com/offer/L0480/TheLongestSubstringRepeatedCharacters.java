package com.offer.L0480;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 提示：
 *
 * s.length <= 40000
 * 注意：本题与主站 3 题相同：<a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/</a>
 */
public class TheLongestSubstringRepeatedCharacters {
    /**
     * 方法：滑动窗口
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        //窗口内字符出现的次数
        Map<Character,Integer> window = new HashMap<>();

        //窗口的左右边界
        int left = 0,right = 0;

        int res = 0;

        while (right < s.length()){
            //c是移入窗口的字符
            char c = s.charAt(right);
            //右移窗口
            right++;
            //进行窗口内数据的一系列更新
            window.put(c,window.getOrDefault(c,0)+1);

            while (window.get(c) > 1) {
                //d是将移除窗口的字符
                char d = s.charAt(left);
                //左移动窗口
                left++;

                window.put(d, window.get(d) - 1);
            }
            //更新答案
            res = Math.max(res,right - left);

        }
        return res;
    }
}
