package com.leetcode.L701_800.L0720;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * 720. 词典中最长的单词
 * 给出一个字符串数组 words 组成的一本英语词典。返回 words 中最长的一个单词，该单词是由 words 词典中其他单词逐步添加一个字母组成。
 * 若其中有多个可行的答案，则返回答案中字典序最小的单词。若无答案，则返回空字符串。
 *
 * 示例 1：
 * 输入：words = ["w","wo","wor","worl", "world"]
 * 输出："world"
 * 解释： 单词"world"可由"w", "wo", "wor", 和 "worl"逐步添加一个字母组成。
 *
 * 示例 2：
 * 输入：words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 * 输出："apple"
 * 解释："apply" 和 "apple" 都能由词典中的单词组成。但是 "apple" 的字典序小于 "apply"
 *
 * 提示：
 * 1 <= words.length <= 1000
 * 1 <= words[i].length <= 30
 * 所有输入的字符串 words[i] 都只包含小写字母。
 */
public class LongestWordDictionary {
    Node root = new Node();

    /**
     * 方法：字典树
     * @param words
     * @return
     */
    public String longestWord(String[] words) {
        //排序
        Arrays.sort(words);
        //结果
        String s = "";
        //遍历
        for (String word : words) {
            //加入字典树
            add(word);
            //判断是否符合条件
            if(get(word) && (s.length() < word.length() || (s.length() == word.length() && word.compareTo(s) < 0))){
                s = word;
            }
        }

        return s;
    }

    /**
     * 是否是前缀
     * @param word
     * @return
     */
    private boolean get(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null || !cur.next.get(c).isEnd)
                return false;
            cur = cur.next.get(c);
        }
        return cur.isEnd && cur != null;
    }

    /**
     * 加入字典树
     * @param word
     */
    private void add(String word){
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null)
                cur.next.put(c,new Node());
            cur = cur.next.get(c);
        }
        cur.isEnd = true;
    }

    /**
     * 字典树
     */
    class Node{
        boolean isEnd;
        TreeMap<Character,Node> next;

        public Node(){
            next = new TreeMap<>();
            this.isEnd = false;
        }
    }
}

