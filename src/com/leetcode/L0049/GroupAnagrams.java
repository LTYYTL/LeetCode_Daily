package com.leetcode.L0049;

import java.util.*;

/**
 * 49. 字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * 说明：
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //结果集
        List<List<String>> res = new ArrayList<>();
        //数组为空
        if (strs.length == 0)
            return res;
        //用于存储含有相同字母的字符串，以排序后的字符串为key,以string集合为value
        Map<String,List<String>> map = new HashMap<>();
        //遍历数组
        for (String s:strs) {
            //将字符串转换成char数组
            char[] chars = s.toCharArray();
            //对数组进行排序
            Arrays.sort(chars);
            //将排序好char数组作为key
            String temp = new String(chars);
            //将由相同字母的字符串放到统一个集合
            List list = map.getOrDefault(temp,new ArrayList<>());
            list.add(s);
            map.put(temp,list);
        }
        res = new ArrayList<>(map.values());
        return res;
    }
}
