package com.interview.L1002;

import java.util.*;

/**
 * 面试题 10.02. 变位词组
 * 编写一种方法，对字符串数组进行排序，将所有变位词组合在一起。变位词是指字母相同，但排列不同的字符串。
 * 注意：本题相对原题稍作修改
 *
 * 示例:
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
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
    /**
     * 方法：哈希表
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        //结果集
        Map<String, List<String>> map = new HashMap<>();
        //遍历字符串数组
        for (String str : strs) {
            //转换成字符数组
            char[] array = str.toCharArray();
            //排序
            Arrays.sort(array);
            //排序后的数组作为key
            String key = new String(array);
            //当前key对应的值存在就取出，不存在新建
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            //将值存入list
            list.add(str);
            //放入map中
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
