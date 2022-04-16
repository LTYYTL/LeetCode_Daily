package com.leetcode.L801_900.L0819;

public class MostCommonWordTest {
    public static void main(String[] args) {
        MostCommonWord mostCommonWord = new MostCommonWord();
        /**
         * 示例：
         * 输入:
         * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
         * banned = ["hit"]
         * 输出: "ball"
         * 解释:
         * "hit" 出现了3次，但它是一个禁用的单词。
         * "ball" 出现了2次 (同时没有其他单词出现2次)，所以它是段落里出现次数最多的，且不在禁用列表中的单词。
         * 注意，所有这些单词在段落里不区分大小写，标点符号需要忽略（即使是紧挨着单词也忽略， 比如 "ball,"），
         * "hit"不是最终的答案，虽然它出现次数更多，但它在禁用单词列表中。
         */
        System.out.println(mostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord.mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));

    }
}
