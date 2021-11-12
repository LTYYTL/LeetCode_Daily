package com.interview.L0102;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.02. 判定是否互为字符重排
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 *
 * 示例 2：
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 *
 * 说明：
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 */
public class CheckPermutation {
    /**
     * 方法：Map映射
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        //记录字母出现的次数
        Map<Character,Integer> map = new HashMap<>();
        //记录s1中出现的字母
        for (char c : s1.toCharArray()) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        //遍历s2
        for (char c : s2.toCharArray()) {
            //不存在直接返回
            if (!map.containsKey(c))
                return false;
            //存在，次数-1
            map.put(c,map.getOrDefault(c,0)-1);
            //字母次数为0，将其移除
            if (map.get(c) == 0)
                map.remove(c);
        }
        //判断map中没有字母了
        return map.size() == 0;
    }
}
