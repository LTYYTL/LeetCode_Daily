package com.leetcode.L0205;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. 同构字符串
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 *
 * 示例 1:
 * 输入: s = "egg", t = "add"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "foo", t = "bar"
 * 输出: false
 *
 * 示例 3:
 * 输入: s = "paper", t = "title"
 * 输出: true
 *
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度。
 */
public class IsomorphicStrings {
    /**
     * 方法：Map映射
     * 思路：双向映射
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        //双向映射
        Map<Character,Character> s2t = new HashMap<>();
        Map<Character,Character> t2s = new HashMap<>();
        //遍历字符串
        for (int i = 0; i < s.length(); ++i){
            //当前索引对应的字符
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //判断当前字符是否为已存在的双向映射，其中有一个不对应直接返回false
            if ((s2t.containsKey(sChar)&&s2t.get(sChar) != tChar) || (t2s.containsKey(tChar)&&t2s.get(tChar) != sChar)){
                return false;
            }
            //添加双向映射
            s2t.put(sChar,tChar);
            t2s.put(tChar,sChar);
        }
        return true;
    }
}
