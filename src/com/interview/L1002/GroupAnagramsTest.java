package com.interview.L1002;

import java.util.List;

public class GroupAnagramsTest {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        /**
         * 示例:
         * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
         * 输出:
         * [
         *   ["ate","eat","tea"],
         *   ["nat","tan"],
         *   ["bat"]
         * ]
         */
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams.groupAnagrams(strs);

        for (List<String> list : lists) {
            System.out.println(list.toString());
        }
    }
}
