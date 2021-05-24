package com.leetcode.L0692;

public class TopKFrequentWordsTest {
    public static void main(String[] args) {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        /**
         * 示例 1：
         * 输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
         * 输出: ["i", "love"]
         * 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
         *     注意，按字母顺序 "i" 在 "love" 之前。
         */
        System.out.println(topKFrequentWords.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
        /**
         * 示例 2：
         * 输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
         * 输出: ["the", "is", "sunny", "day"]
         * 解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
         *     出现次数依次为 4, 3, 2 和 1 次。
         */
        System.out.println(topKFrequentWords.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
    }
}
