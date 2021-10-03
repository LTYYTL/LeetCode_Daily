package com.leetcode.L401_500.L0451;

import java.util.*;

/**
 * 451. 根据字符出现频率排序
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 *
 * 示例 1:
 * 输入:
 * "tree"
 * 输出:
 * "eert"
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 *
 * 示例 2:
 * 输入:
 * "cccaaa"
 * 输出:
 * "cccaaa"
 * 解释:
 * 'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
 * 注意"cacaca"是不正确的，因为相同的字母必须放在一起。
 *
 * 示例 3:
 * 输入:
 * "Aabb"
 * 输出:
 * "bbAa"
 * 解释:
 * 此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
 * 注意'A'和'a'被认为是两种不同的字符。
 */
public class SortCharactersByFrequency {

    /**
     * 方法：哈希表
     * @param s
     * @return
     */
    public String frequencySort(String s) {
        //结果集
        StringBuilder res = new StringBuilder();
        //记录每个字符出现的数量
        Map<Character,Integer> map = new HashMap<>();
        //遍历字符串
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //将字符存入list
        List<Character> list = new ArrayList<>(map.keySet());
        //将出现次数多的字符放在前面
        Collections.sort(list,(a,b)-> map.get(b)- map.get(a));
        //遍历list
        for (Character c : list) {
            int size =map.get(c);
            for (int i = 0; i < size; i++) {
                res.append(c);
            }
        }
        return res.toString();
    }
}
