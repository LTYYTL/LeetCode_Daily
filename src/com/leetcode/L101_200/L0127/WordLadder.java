package com.leetcode.L101_200.L0127;

import java.util.*;

/**
 * 127. 单词接龙
 * 字典 wordList 中从单词 beginWord 和 endWord 的 转换序列 是一个按下述规格形成的序列：
 * (1)序列中第一个单词是 beginWord 。
 * (2)序列中最后一个单词是 endWord 。
 * (3)每次转换只能改变一个字母。
 * (4)转换过程中的中间单词必须是字典 wordList 中的单词。
 * 给你两个单词 beginWord 和 endWord 和一个字典 wordList ，找到从 beginWord 到 endWord 的 最短转换序列 中的 单词数目 。如果不存在这样的转换序列，返回 0。
 *
 * 示例 1：
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * 输出：5
 * 解释：一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog", 返回它的长度 5。
 *
 * 示例 2：
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * 输出：0
 * 解释：endWord "cog" 不在字典中，所以无法进行转换。
 *
 * 提示：
 * 1 <= beginWord.length <= 10
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 5000
 * wordList[i].length == beginWord.length
 * beginWord、endWord 和 wordList[i] 由小写英文字母组成
 * beginWord != endWord
 * wordList 中的所有字符串 互不相同
 */
public class WordLadder {
    /**
     * 方法：广度优先搜索
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> word = new HashSet<>(wordList); //转换为hashset 加快速度
        if (word.size() == 0 || !word.contains(endWord)) {  //特殊情况判断
            return 0;
        }
        //记录访问
        Set<String> vis = new HashSet<>();
        vis.add(beginWord);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        //步长
        int step = 1;
        //遍历
        while (!queue.isEmpty()){
            //当前层长度
            int size = queue.size();
            //遍历当前层
            for (int i = 0; i < size; i++) {
                //队首元素
                String cur = queue.poll();
                //获取与队首元素相差一个字母并且为访问的集合
                for (String s : changeWord(cur, vis, word)) {
                    //等于结果直接返回
                    if (endWord.equals(s))
                        return step+1;
                    //加入队列
                    queue.add(s);
                    //变成已访问
                    vis.add(s);
                }
            }
            //遍历完一层步长+1
            step++;
        }

        return 0;
    }

    /**
     * 获取相差一个字母的集合
     * @param cur
     * @param vis
     * @param word
     * @return
     */
    private List<String> changeWord(String cur, Set<String> vis, Set<String> word) {
        //结果
        List<String> res = new ArrayList<>();
        //
        for (int i = 0; i < cur.length(); i++) {
            //变成数组
            char[] chars = cur.toCharArray();
            //改变当前位的字母
            for (char j = 'a'; j <= 'z' ; j++) {
                chars[i] = j;
                //转换成字符串
                String s = String.valueOf(chars);
                //未访问且在字典中
                if (!vis.contains(s) && word.contains(s))
                    res.add(s);
            }
        }
        return res;
    }
}
