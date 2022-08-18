package com.leetcode.L201_300.L0211;

import java.util.TreeMap;

/**
 * 211. 添加与搜索单词 - 数据结构设计
 * 请你设计一个数据结构，支持 添加新单词 和 查找字符串是否与任何先前添加的字符串匹配 。
 *
 * 实现词典类 WordDictionary ：
 * WordDictionary() 初始化词典对象
 * void addWord(word) 将 word 添加到数据结构中，之后可以对它进行匹配
 * bool search(word) 如果数据结构中存在字符串与 word 匹配，则返回 true ；否则，返回  false 。word 中可能包含一些 '.' ，每个 . 都可以表示任何一个字母。
 *
 * 示例：
 * 输入：
 * ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
 * [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
 * 输出：
 * [null,null,null,null,false,true,true,true]
 * 解释：
 * WordDictionary wordDictionary = new WordDictionary();
 * wordDictionary.addWord("bad");
 * wordDictionary.addWord("dad");
 * wordDictionary.addWord("mad");
 * wordDictionary.search("pad"); // return False
 * wordDictionary.search("bad"); // return True
 * wordDictionary.search(".ad"); // return True
 * wordDictionary.search("b.."); // return True
 *
 * 提示：
 * 1 <= word.length <= 500
 * addWord 中的 word 由小写英文字母组成
 * search 中的 word 由 '.' 或小写英文字母组成
 * 最调用多 50000 次 addWord 和 search
 */
public class WordDictionary {
    /**
     * 方法：字典树
     */
    private class Node{
        //当前是否是单词结束
        public boolean isWord;
        //字母后的字母节点
        public TreeMap<Character, Node> next;

        public Node(boolean isWord){
            this.isWord = isWord;
            next = new TreeMap<>();
        }

        public Node(){
            this(false);
        }
    }

    private final Node root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Node();

    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Node cur = root;
        for(int i = 0; i < word.length(); i++){
            //单词当前字母
            char c = word.charAt(i);
            //不存在创建
            if(cur.next.get(c) == null)
                cur.next.put(c,new Node());
            //指针向后移
            cur = cur.next.get(c);
        }
        //是单词的结束
        cur.isWord = true;

    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {

        return match(root,word,0);
    }

    private boolean match(Node node,String word,int index){
        //单词遍历结束
        if(index == word.length())
            return node.isWord;
        //单词的字母
        char c = word.charAt(index);
        //分类讨论
        if(c != '.'){
            //字母不存在
            if(node.next.get(c) == null)
                return false;
            //指针向后移动
            return match(node.next.get(c),word,index+1);
        }else{
            for(char nextChar:node.next.keySet()){
                if(match(node.next.get(nextChar),word,index+1))
                    return true;
            }
            return false;
        }
    }
}
