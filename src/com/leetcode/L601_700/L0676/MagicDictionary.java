package com.leetcode.L601_700.L0676;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 剑指 Offer II 064. 神奇的字典
 * 设计一个使用单词列表进行初始化的数据结构，单词列表中的单词 互不相同 。
 * 如果给出一个单词，请判定能否只将这个单词中一个字母换成另一个字母，使得所形成的新单词存在于已构建的神奇字典中。
 *
 * 实现 MagicDictionary 类：
 * （1）MagicDictionary() 初始化对象
 * （2）void buildDict(String[] dictionary) 使用字符串数组 dictionary 设定该数据结构，dictionary 中的字符串互不相同
 * （3）bool search(String searchWord) 给定一个字符串 searchWord ，判定能否只将字符串中 一个 字母换成另一个字母，使得所形成的新字符串能够与字典中的任一字符串匹配。如果可以，返回 true ；否则，返回 false 。
 *
 * 示例：
 * 输入
 * inputs = ["MagicDictionary", "buildDict", "search", "search", "search", "search"]
 * inputs = [[], [["hello", "leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
 * 输出
 * [null, null, false, true, false, false]
 * 解释
 * MagicDictionary magicDictionary = new MagicDictionary();
 * magicDictionary.buildDict(["hello", "leetcode"]);
 * magicDictionary.search("hello"); // 返回 False
 * magicDictionary.search("hhllo"); // 将第二个 'h' 替换为 'e' 可以匹配 "hello" ，所以返回 True
 * magicDictionary.search("hell"); // 返回 False
 * magicDictionary.search("leetcoded"); // 返回 False
 *
 * 提示：
 * 1 <= dictionary.length <= 100
 * 1 <= dictionary[i].length <= 100
 * dictionary[i] 仅由小写英文字母组成
 * dictionary 中的所有字符串 互不相同
 * 1 <= searchWord.length <= 100
 * searchWord 仅由小写英文字母组成
 * buildDict 仅在 search 之前调用一次
 * 最多调用 100 次 search
 *
 * 注意：本题与主站 676 题相同： https://leetcode-cn.com/problems/implement-magic-dictionary/
 */
public class MagicDictionary {
    /**
     * 方法：map映射
     */
    Map<Integer, List<String>> map;

    public MagicDictionary() {
        map = new HashMap<>();
    }

    public void buildDict(String[] dictionary) {
        for (String dic : dictionary) {
            int len = dic.length();
            if (!map.containsKey(len)) map.put(len, new ArrayList<>());
            map.get(len).add(dic);
        }
    }

    public boolean search(String searchWord) {
        int len = searchWord.length();
        if (!map.containsKey(len)) return false; //符合条件的必定是和要验证的字符串的长度相等的
        for (String dic : map.get(len)) {
            int cnt = 0; //修改次数
            for (int i = 0; i < len; i++) {
                if (dic.charAt(i) != searchWord.charAt(i)) cnt++;
                if (cnt > 1) break;
            }
            if (cnt == 1) return true; //说明可以只修改一个字母,就使得所形成的新字符串能够与字典中的任一字符串匹配
        }
        return false;
    }
    /**
     * 方法：字典树
     *//*
    public Node root;

    public MagicDictionary() {
        root = new Node();
    }

    public void buildDict(String[] dictionary) {
        //遍历字符串数组
        for (String s : dictionary) {
            //调用字符串添加方法逐个添加
            insert(s);
        }
    }

    *//**
     * 暴力法搜索
     * @param searchWord
     * @return
     *//*
    public boolean search(String searchWord) {
        for (int i = 0; i < searchWord.length(); i++) {
            //当前单词
            char c = searchWord.charAt(i);
            //遍历26个字母
            for (int j = 0; j < 26; j++) {
                char d = (char) ('a' + j);
                //两个不等时，使用字母代替单词
                if (c != d){
                    //新字符串
                    String s = searchWord.substring(0,i) + d + searchWord.substring(i+1);
                    //异位存在
                    if (search_tire(s))
                        return true;
                }
            }
        }
        return false;
    }

    *//**
     * 字符串添加
     * @param s
     *//*
    private void insert(String s) {
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            //当前字符
            char c = s.charAt(i);
            //不存在创建
            if (cur.next.get(c) == null)
                cur.next.put(c,new Node());
            //指针后移
            cur = cur.next.get(c);
        }
        //是单词的结尾
        cur.isWord = true;
    }

    *//**
     * 单词判断
     * @param searchWord
     * @return
     *//*
    public boolean search_tire(String searchWord) {
        Node cur = root;
        for (int i = 0; i < searchWord.length(); i++) {
            //当前字符
            char c = searchWord.charAt(i);
            //不存在
            if (cur.next.get(c) == null){
                return false;
            }
            cur = cur.next.get(c);
        }
        //看是否是单词结尾
        return cur.isWord;
    }

    private class Node{
        public boolean isWord;
        public TreeMap<Character,Node> next;

        public Node(){
            this(false);
        }
        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }
    }*/
}
