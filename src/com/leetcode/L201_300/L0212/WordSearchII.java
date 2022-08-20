package com.leetcode.L201_300.L0212;

import java.util.*;

/**
 * 212. 单词搜索 II
 * 给定一个 m x n 二维字符网格 board 和一个单词（字符串）列表 words，找出所有同时在二维网格和字典中出现的单词。
 * 单词必须按照字母顺序，通过 相邻的单元格 内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。
 *
 * 示例 1：
 * 输入：board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
 * 输出：["eat","oath"]
 *
 * 示例 2：
 * 输入：board = [["a","b"],["c","d"]], words = ["abcb"]
 * 输出：[]
 *
 * 提示：
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 12
 * board[i][j] 是一个小写英文字母
 * 1 <= words.length <= 3 * 104
 * 1 <= words[i].length <= 10
 * words[i] 由小写英文字母组成
 * words 中的所有字符串互不相同
 */
public class WordSearchII {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    /**
     * 方法：字典树+回溯算法
     * @param board
     * @param words
     * @return
     */
    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        //将所有单词放入字典树
        for (String word : words) {
            trie.insert(word);
        }
        //去重
        Set<String> ans = new HashSet<>();
        //遍历单词
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                dfs(board, trie, i, j, ans);
            }
        }

        return new ArrayList<>(ans);
    }

    /**
     * 深度优先搜索
     * @param board
     * @param now
     * @param i1
     * @param j1
     * @param ans
     */
    public void dfs(char[][] board, Trie now, int i1, int j1, Set<String> ans) {
        //当前单词不村在，当前单词字典树中
        if (!now.children.containsKey(board[i1][j1])) {
            return;
        }
        //当前字母
        char ch = board[i1][j1];
        //指向当前字母的字典树
        now = now.children.get(ch);
        //是单词的结尾
        if (!"".equals(now.word)) {
            ans.add(now.word);
        }
        //变成已访问
        board[i1][j1] = '#';
        //遍历4个方位
        for (int[] dir : dirs) {
            //新坐标
            int i2 = i1 + dir[0], j2 = j1 + dir[1];
            //判断是否越界
            if (i2 >= 0 && i2 < board.length && j2 >= 0 && j2 < board[0].length) {
                dfs(board, now, i2, j2, ans);
            }
        }
        //变回未访问
        board[i1][j1] = ch;
    }
}

/**
 * 字典树
 */
class Trie {
    //单词全拼
    String word;
    //子字母对应的字典树
    Map<Character, Trie> children;

    public Trie() {
        this.word = "";
        this.children = new HashMap<>();
    }

    public void insert(String word) {
        //当前字典树
        Trie cur = this;
        //遍历单词字母
        for (int i = 0; i < word.length(); ++i) {
            //字母
            char c = word.charAt(i);
            //字母是否已经在此字典树中存在
            if (!cur.children.containsKey(c)) {
                //创建子字典树
                cur.children.put(c, new Trie());
            }
            //改变指向
            cur = cur.children.get(c);
        }
        //遍历完将是单词的结尾
        cur.word = word;
    }
}
