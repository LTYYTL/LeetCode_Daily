package com.interview.L1711;

/**
 * 面试题 17.11. 单词距离
 * 有个内含单词的超大文本文件，给定任意两个单词，找出在这个文件中这两个单词的最短距离(相隔单词数)。
 * 如果寻找过程在这个文件中会重复多次，而每次寻找的单词不同，你能对此优化吗?
 *
 * 示例：
 * 输入：words = ["I","am","a","student","from","a","university","in","a","city"], word1 = "a", word2 = "student"
 * 输出：1
 *
 * 提示：
 * words.length <= 100000
 */
public class FindClosest {
    /**
     * 方法：暴力法
     * @param words
     * @param word1
     * @param word2
     * @return
     */
    public int findClosest(String[] words, String word1, String word2) {
        //最小值
        int min = Integer.MAX_VALUE;
        //第一个单词索引
        int index1 = -1;
        //第一个单词索引
        int index2 = -1;
        //遍历
        for (int i = 0; i < words.length; i++) {
            //记录第一个单词索引
            if (words[i].equals(word1))
                index1 = i;
            //记录第二个单词索引
            if (words[i].equals(word2))
                index2 = i;
            //没有出现的情况直接继续
            if (index1 == -1 || index2 == -1)
                continue;
            //获取距离
            int temp = Math.abs(index1-index2);
            //记录最短距离
            min = Math.min(min,temp);
        }

        return min;
    }
}
