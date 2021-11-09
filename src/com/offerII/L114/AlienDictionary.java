package com.offerII.L114;

import java.util.*;

/**
 * 剑指 Offer II 114. 外星文字典
 * 现有一种使用英语字母的外星文语言，这门语言的字母顺序与英语顺序不同。
 * 给定一个字符串列表 words ，作为这门语言的词典，words 中的字符串已经 按这门新语言的字母顺序进行了排序 。
 * 请你根据该词典还原出此语言中已知的字母顺序，并 按字母递增顺序 排列。若不存在合法字母顺序，返回 "" 。若存在多种可能的合法字母顺序，返回其中 任意一种 顺序即可。
 *
 * 字符串 s 字典顺序小于 字符串 t 有两种情况：
 * (1)在第一个不同字母处，如果 s 中的字母在这门外星语言的字母顺序中位于 t 中字母之前，那么 s 的字典顺序小于 t 。
 * (2)如果前面 min(s.length, t.length) 字母都相同，那么 s.length < t.length 时，s 的字典顺序也小于 t 。
 *
 * 示例 1：
 * 输入：words = ["wrt","wrf","er","ett","rftt"]
 * 输出："wertf"
 *
 * 示例 2：
 * 输入：words = ["z","x"]
 * 输出："zx"
 *
 * 示例 3：
 * 输入：words = ["z","x","z"]
 * 输出：""
 * 解释：不存在合法字母顺序，因此返回 "" 。
 *
 * 提示：
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] 仅由小写英文字母组成
 *
 * 注意：本题与主站 269 题相同： https://leetcode-cn.com/problems/alien-dictionary/
 */
public class AlienDictionary {
    /**
     * 方法：拓扑排序
     * @param words
     * @return
     */
    public String alienOrder(String[] words) {
        //构造有向图
        Map<Character, Set<Character>> graph = creatGraph(words);
        // 不存在合法字母顺序 返回 ""
        if (graph == null) {
            return "";
        }
        //拓扑排序
        return topologicalSort(graph);
    }

    /**
     * 构建有向图
     * @param words
     * @return
     */
    private Map<Character, Set<Character>> creatGraph(String[] words) {
        //有向图
        Map<Character,Set<Character>> graph = new HashMap<>();
        //遍历
        for (String word : words) {
            //遍历每个单词的每个字母
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                graph.putIfAbsent(c,new HashSet<>());
            }
        }
        //遍历
        for (int i = 0; i < words.length - 1; i++) {
            //索引
            int index = 0;
            while (index < words[i].length() && index < words[i+1].length()){
                //不同的时候，按照字母小的放在前面
                if (words[i].charAt(index) != words[i+1].charAt(index)){
                    graph.get(words[i].charAt(index)).add(words[i+1].charAt(index));
                    break;
                }
                //索引+1
                index++;
            }

            // 针对相邻字符串为 "abc" 与 "ab"的情况
            if (index == Math.min(words[i].length(), words[i + 1].length())) {
                if (words[i].length() > words[i + 1].length()) {
                    return null;
                }
            }
        }
        return graph;
    }

    /**
     * 拓扑排序
     * @param graph
     * @return
     */
    private String topologicalSort(Map<Character, Set<Character>> graph) {
        //获取字母入度
        Map<Character, Integer> indegree = getIndegree(graph);
        //入度为0的入队
        Queue<Character> queue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : indegree.entrySet()) {
            if (entry.getValue() == 0)
                queue.offer(entry.getKey());
        }
        // 记录排序结果
        StringBuilder res = new StringBuilder();

        //遍历
        while (!queue.isEmpty()){
            //获取队首元素
            Character cur = queue.poll();
            //加入结果
            res.append(cur);
            //获取其邻居字母
            for (Character c : graph.get(cur)) {
                //入度-1
                indegree.put(c,indegree.get(c)-1);
                //入度为0的入队
                if (indegree.get(c) == 0)
                    queue.offer(c);
            }
        }

        // 如果有些字符没有出现在字典排序中 返回""
        return (res.length() == indegree.size()) ? res.toString() : "";

    }

    /**
     * 构建每个字母的入度
     * @param graph
     * @return
     */
    private Map<Character,Integer> getIndegree(Map<Character, Set<Character>> graph) {
        //记录字母入度
        Map<Character,Integer> indegree  = new HashMap<>();

        // 初始化所有点的度为0
        for (Character c : graph.keySet()) {
            indegree.put(c, 0);
        }

        //遍历
        for (Map.Entry<Character, Set<Character>> entry : graph.entrySet()) {
            //获取当前字母的相邻字母
            Set<Character> value = entry.getValue();
            //相邻节点入度+1
            for (Character c : value) {
                indegree .put(c,indegree .get(c)+1);
            }
        }
        return indegree;
    }
}
