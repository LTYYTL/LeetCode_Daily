package com.leetcode.L0003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
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
 */
public class NoRepeatLongestStr {
    /**
     * 方法一：Set集合
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        //字符串长度
        int n = s.length();
        //set集合，用于判断字符是否出现过
        Set<Character> set = new HashSet<>();
        //结果
        int result = 0;
        //双指针
        int i = 0,j = 0;
        while (i < n && j < n){
            //判断当前字符是否已经出现
            //（1）没有：将字符添加入set中，指针向后移，将窗口大小增大
            //（2）有：将字符从set中移除，指针向后移动
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                result = Math.max(result, j - i);
            }else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return result;
    }

    /**
     * 方法二：Map映射
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring_Map(String s){
        //字符串长度
        int n = s.length();
        //set集合，用于判断字符是否出现过
            Map<Character,Integer> map = new HashMap<>();
        //结果
        int result = 0;
        for (int right = 0, left = 0; right < n; right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left);
            }
            result = Math.max(result, right - left + 1);
            map.put(s.charAt(right), right + 1);
        }
        return result;
    }
}
