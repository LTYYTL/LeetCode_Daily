package com.leetcode.L1859;

public class SortingSentenceTest {
    public static void main(String[] args) {
        SortingSentence sortingSentence = new SortingSentence();
        /** * 示例 1：
         * 输入：s = "is2 sentence4 This1 a3"
         * 输出："This is a sentence"
         * 解释：将 s 中的单词按照初始位置排序，得到 "This1 is2 a3 sentence4" ，然后删除数字。
         */
        System.out.println(sortingSentence.sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortingSentence.sortSentence_map("is2 sentence4 This1 a3"));
        System.out.println(sortingSentence.sortSentence_array("is2 sentence4 This1 a3"));

        /**
         * 示例 2：
         * 输入：s = "Myself2 Me1 I4 and3"
         * 输出："Me Myself and I"
         * 解释：将 s 中的单词按照初始位置排序，得到 "Me1 Myself2 and3 I4" ，然后删除数字。
         */
        System.out.println(sortingSentence.sortSentence("Myself2 Me1 I4 and3"));
        System.out.println(sortingSentence.sortSentence_map("Myself2 Me1 I4 and3"));
        System.out.println(sortingSentence.sortSentence_array("Myself2 Me1 I4 and3"));
    }
}
