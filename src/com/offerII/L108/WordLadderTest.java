package com.offerII.L108;

import java.util.Arrays;
import java.util.List;

public class WordLadderTest {
    public static void main(String[] args) {
        WordLadder wordLadder = new WordLadder();
        /**
         * 示例 1：
         * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
         * 输出：5
         * 解释：一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog", 返回它的长度 5。
         */
        List<String> list = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        System.out.println(wordLadder.ladderLength("hit", "cog", list));
        /**
         * 示例 2：
         * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
         * 输出：0
         * 解释：endWord "cog" 不在字典中，所以无法进行转换。
         */
        list = Arrays.asList("hot", "dot", "dog", "lot", "log");
        System.out.println(wordLadder.ladderLength("hit", "cog", list));
    }
}
