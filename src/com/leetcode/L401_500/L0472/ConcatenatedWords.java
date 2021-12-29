package com.leetcode.L401_500.L0472;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 472. 连接词
 * 给你一个 不含重复 单词的字符串数组 words ，请你找出并返回 words 中的所有 连接词 。
 * 连接词 定义为：一个完全由给定数组中的至少两个较短单词组成的字符串。
 *
 * 示例 1：
 * 输入：words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
 * 输出：["catsdogcats","dogcatsdog","ratcatdogcat"]
 * 解释："catsdogcats" 由 "cats", "dog" 和 "cats" 组成;
 *      "dogcatsdog" 由 "dog", "cats" 和 "dog" 组成;
 *      "ratcatdogcat" 由 "rat", "cat", "dog" 和 "cat" 组成。
 *
 * 示例 2：
 * 输入：words = ["cat","dog","catdog"]
 * 输出：["catdog"]
 *
 * 提示：
 * 1 <= words.length <= 104
 * 0 <= words[i].length <= 1000
 * words[i] 仅由小写字母组成
 * 0 <= sum(words[i].length) <= 105
 */
public class ConcatenatedWords {
    //字典树
    Tire root = new Tire();;

    /**
     * 方法：字典树+深度优先搜索
     * @param words
     * @return
     */
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        //结果集
        List<String> res = new ArrayList<>();
        //按照字符串大小排序
        Arrays.sort(words,(a,b) -> a.length() - b.length());
        //遍历
        for (String word : words) {
            //空串
            if (word.length() == 0)
                continue;
            //进行深度优先搜索
            if (dfs(word,0))
                res.add(word);
            else
                insert(word);
        }
        return res;
    }

    /**
     * 深度优先搜索
     * @param word
     * @param i
     * @return
     */
    private boolean dfs(String word, int i) {
        //遍历到最后
        if (word.length() == i)
            return true;
        //字典树
        Tire cur = root;
        //遍历
        for (int j = i; j < word.length(); j++) {
            //当前字符
            int c = word.charAt(j) - 'a';
            //指针向后移动
            cur = cur.next[c];
            //不存在
            if (cur == null)
                return false;

            //是单词结尾
            if (cur.isWord){
                //从下一个字符进行深度优先搜索
                if (dfs(word,j+1))
                    return true;
            }
        }
        return false;
    }

    //向字典树中加入单词
    public void insert(String word){
        Tire cur = root;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if (cur.next[c] == null)
                cur.next[c] = new Tire();
            cur = cur.next[c];
        }

        cur.isWord = true;
    }

    class Tire{
        boolean isWord;
        Tire[] next;

        public Tire(boolean isWord){
            this.isWord = isWord;
            this.next = new Tire[26];
        }

        public Tire(){
            this(false);
        }
    }
}
