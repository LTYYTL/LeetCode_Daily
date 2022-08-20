package com.interview.L0101;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 01.01. 判定字符是否唯一
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 * 输入: s = "leetcode"
 * 输出: false
 *
 * 示例 2：
 * 输入: s = "abc"
 * 输出: true
 *
 * 限制：
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 */
public class IsUnique {
    /**
     * 方法一：set方法
     * 解题思路：用set记录字符是否出现过
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); ++i){
            char c = astr.charAt(i);
            //判断字符是否存在于set中
            if (set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }

    /**
     * 方法二：String自带方法
     * @param astr
     * @return
     */
    public boolean isUnique_str(String astr) {
       for (int i = 0; i < astr.length(); ++i){
           char c = astr.charAt(i);
           //当前字符第一次出现的位置
           int first = astr.indexOf(c);
           //当前字符最后一次出现的位置
           int last = astr.lastIndexOf(c);
           if (first != last)
               return false;
       }
       return true;
    }

}
