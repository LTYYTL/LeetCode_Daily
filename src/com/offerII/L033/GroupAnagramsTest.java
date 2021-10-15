package com.offerII.L033;

import java.util.List;

public class GroupAnagramsTest {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        /**
         * 示例 1:
         * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
         * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
         */
        List<List<String>> lists = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for (List<String> list : lists) {
            System.out.println(list);
        }
        /**
         * 示例 2:
         * 输入: strs = [""]
         * 输出: [[""]]
         */
        lists = groupAnagrams.groupAnagrams(new String[]{""});
        for (List<String> list : lists) {
            System.out.println(list);
        }
        /**
         * 示例 3:
         * 输入: strs = ["a"]
         * 输出: [["a"]]
         */
        lists = groupAnagrams.groupAnagrams(new String[]{"a"});
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}
