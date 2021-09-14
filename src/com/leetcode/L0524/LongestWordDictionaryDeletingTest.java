package com.leetcode.L0524;

import java.util.Arrays;
import java.util.List;

public class LongestWordDictionaryDeletingTest {
    public static void main(String[] args) {
        LongestWordDictionaryDeleting longestWordDictionaryDeleting = new LongestWordDictionaryDeleting();
        /**
         * 示例 1：
         * 输入：s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
         * 输出："apple"
         */
        List<String> dictionary = Arrays.asList(new String[]{"ale","apple","monkey","plea"});
        System.out.println(longestWordDictionaryDeleting.findLongestWord("abpcplea", dictionary));
        /**
         * 示例 2：
         * 输入：s = "abpcplea", dictionary = ["a","b","c"]
         * 输出："a
         */
        List<String> dictionary1 = Arrays.asList(new String[]{"a","b","c"});
        System.out.println(longestWordDictionaryDeleting.findLongestWord("abpcplea", dictionary1));
    }
}
