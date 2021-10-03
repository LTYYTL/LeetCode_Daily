package com.leetcode.L1_100.L0049;

public class GroupAnagramsTest {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        /***
         * 示例:
         * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
         * 输出:
         * [
         *   ["ate","eat","tea"],
         *   ["nat","tan"],
         *   ["bat"]
         * ]
         */
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams.groupAnagrams(strs).toString());
    }
}
