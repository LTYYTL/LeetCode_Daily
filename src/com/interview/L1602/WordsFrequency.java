package com.interview.L1602;

import java.util.TreeMap;

/**
 * 面试题 16.02. 单词频率
 * 设计一个方法，找出任意指定单词在一本书中的出现频率。
 *
 * 你的实现应该支持如下操作：
 * (1)WordsFrequency(book)构造函数，参数为字符串数组构成的一本书
 * (2)get(word)查询指定单词在书中出现的频率
 *
 * 示例：
 * WordsFrequency wordsFrequency = new WordsFrequency({"i", "have", "an", "apple", "he", "have", "a", "pen"});
 * wordsFrequency.get("you"); //返回0，"you"没有出现过
 * wordsFrequency.get("have"); //返回2，"have"出现2次
 * wordsFrequency.get("an"); //返回1
 * wordsFrequency.get("apple"); //返回1
 * wordsFrequency.get("pen"); //返回1
 *
 * 提示：
 * book[i]中只包含小写字母
 * 1 <= book.length <= 100000
 * 1 <= book[i].length <= 10
 * get函数的调用次数不会超过100000
 */
public class WordsFrequency {
    /**
     * 方法：字典树
     */
    //根节点
    Node root = new Node();

    //初始化
    public WordsFrequency(String[] book) {
        //将字符串加入字典树
        for (String s : book) {
            insert(s);
        }
    }

    public int get(String word) {
        //获取临时根节点
        Node cur = root;
        //遍历
        for (int i = 0; i < word.length(); i++) {
            //当前字符
            char c = word.charAt(i);
            //不存在直接返回
            if (cur.next.get(c) == null)
                return 0;
            //指针向后移动
            cur = cur.next.get(c);
        }
        //返回次数
        return cur.count;
    }

    private void insert(String s){
        //获取根节点指针
        Node cur = root;
        //遍历
        for (int i = 0; i < s.length(); i++) {
            //获取当前字符
            char c = s.charAt(i);
            //不存在创建
            if (cur.next.get(c) == null)
                cur.next.put(c, new Node());
            //指针向后移动
            cur = cur.next.get(c);
        }
        //单词结尾
        cur.isWord = true;
        //单词数量+1
        cur.count++;
    }

    static class Node {
        boolean isWord;
        TreeMap<Character, Node> next;
        int count;

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
            this.count = 0;
        }

        public Node(){
            this(false);
        }
    }
}
