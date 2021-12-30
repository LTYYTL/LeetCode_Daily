package com.leetcode.L2101_2200.L2114;

public class MaxNumWordsSentencesTest {
    public static void main(String[] args) {
        MaxNumWordsSentences maxNumWordsSentences = new MaxNumWordsSentences();
        /** *
         * 示例 1：
         * 输入：sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
         * 输出：6
         * 解释：
         * - 第一个句子 "alice and bob love leetcode" 总共有 5 个单词。
         * - 第二个句子 "i think so too" 总共有 4 个单词。
         * - 第三个句子 "this is great thanks very much" 总共有 6 个单词。
         * 所以，单个句子中有最多单词数的是第三个句子，总共有 6 个单词。
         */
        System.out.println(maxNumWordsSentences.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        /**
         * 示例 2：
         * 输入：sentences = ["please wait", "continue to fight", "continue to win"]
         * 输出：3
         * 解释：可能有多个句子有相同单词数。
         * 这个例子中，第二个句子和第三个句子（加粗斜体）有相同数目的单词数。
         */
        System.out.println(maxNumWordsSentences.mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));
    }
}
