package com.leetcode.L601_700.L0648;

import java.util.List;
import java.util.TreeMap;

/**
 * 648. 单词替换
 * 在英语中，我们有一个叫做 词根(root)的概念，它可以跟着其他一些词组成另一个较长的单词——我们称这个词为 继承词(successor)。
 * 例如，词根an，跟随着单词 other(其他)，可以形成新的单词 another(另一个)。
 * 现在，给定一个由许多词根组成的词典和一个句子。你需要将句子中的所有继承词用词根替换掉。如果继承词有许多可以形成它的词根，则用最短的词根替换它。
 * 你需要输出替换之后的句子。
 *
 * 示例 1：
 * 输入：dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
 * 输出："the cat was rat by the bat"
 *
 * 示例 2：
 * 输入：dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
 * 输出："a a b c"
 *
 * 示例 3：
 * 输入：dictionary = ["a", "aa", "aaa", "aaaa"], sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"
 * 输出："a a a a a a a a bbb baba a"
 *
 * 示例 4：
 * 输入：dictionary = ["catt","cat","bat","rat"], sentence = "the cattle was rattled by the battery"
 * 输出："the cat was rat by the bat"
 *
 * 示例 5：
 * 输入：dictionary = ["ac","ab"], sentence = "it is abnormal that this solution is accepted"
 * 输出："it is ab that this solution is ac"
 *
 * 提示：
 *
 * 1 <= dictionary.length <= 1000
 * 1 <= dictionary[i].length <= 100
 * dictionary[i] 仅由小写字母组成。
 * 1 <= sentence.length <= 10^6
 * sentence 仅由小写字母和空格组成。
 * sentence 中单词的总量在范围 [1, 1000] 内。
 * sentence 中每个单词的长度在范围 [1, 1000] 内。
 * sentence 中单词之间由一个空格隔开。
 * sentence 没有前导或尾随空格。
 */
public class ReplaceWords {
    /**
     * 方法：字典树
     */
    Node root;

    public String replaceWords(List<String> dictionary, String sentence) {
        root = new Node();
        //将词根加入字典树中
        for (String s : dictionary) {
            insert(s);
        }
        StringBuilder res = new StringBuilder();
        //分割字符串
        String[] data = sentence.split(" ");
        //遍历字符串，判断是否有前缀
        for (String s : data) {
            res.append(search(s));
            res.append(" ");
        }
        //去除最后一个空格
        return res.deleteCharAt(res.length()-1).toString();
    }

    /**
     * 向字典树中加入词根
     * @param s
     */
    private void insert(String s){
        Node cur = root;
        //遍历词根
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //不存在
            if (cur.next.get(c) == null)
                cur.next.put(c,new Node());
            cur = cur.next.get(c);
        }
        //词根结束
        cur.isWord = true;
    }

    /**
     * 查看是否能用词根代替
     * @param s
     * @return
     */
    private String search(String s) {
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //存在直接返回
            if (cur.next.get(c) == null)
                return s;
            cur = cur.next.get(c);
            //是词根，返回词根
            if (cur.isWord)
                return s.substring(0,i+1);
        }
        return s;
    }

    private class Node{
        public boolean isWord;
        public TreeMap<Character, Node> next;

        public Node(boolean isWord){
            this.isWord = isWord;
            next = new TreeMap<>();
        }

        public Node(){
            this(false);
        }
    }
}
