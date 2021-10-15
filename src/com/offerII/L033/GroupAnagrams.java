package com.offerII.L033;

import java.util.*;

/**
 * 剑指 Offer II 033. 变位词组
 * 给定一个字符串数组 strs ，将 变位词 组合在一起。 可以按任意顺序返回结果列表。
 * 注意：若两个字符串中每个字符出现的次数都相同，则称它们互为变位词。
 *
 * 示例 1:
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * 示例 2:
 * 输入: strs = [""]
 * 输出: [[""]]
 *
 * 示例 3:
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 *
 * 提示：
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] 仅包含小写字母
 *
 * 注意：本题与主站 49 题相同： https://leetcode-cn.com/problems/group-anagrams/
 */
public class GroupAnagrams {
    /**
     * 方法：map映射
     * @param strs
     * @return
     */
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
