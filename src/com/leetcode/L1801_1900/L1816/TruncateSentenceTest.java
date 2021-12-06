package com.leetcode.L1801_1900.L1816;

public class TruncateSentenceTest {
    public static void main(String[] args) {
        TruncateSentence truncateSentence = new TruncateSentence();
        /**
         * 示例 1：
         * 输入：s = "Hello how are you Contestant", k = 4
         * 输出："Hello how are you"
         * 解释：
         * s 中的单词为 ["Hello", "how" "are", "you", "Contestant"]
         * 前 4 个单词为 ["Hello", "how", "are", "you"]
         * 因此，应当返回 "Hello how are you"
         */
        System.out.println(truncateSentence.truncateSentence("Hello how are you Contestant", 4));
        /**
         * 示例 2：
         * 输入：s = "What is the solution to this problem", k = 4
         * 输出："What is the solution"
         * 解释：
         * s 中的单词为 ["What", "is" "the", "solution", "to", "this", "problem"]
         * 前 4 个单词为 ["What", "is", "the", "solution"]
         * 因此，应当返回 "What is the solution"
         */
        System.out.println(truncateSentence.truncateSentence("What is the solution to this problem", 4));
        /**
         * 示例 3：
         * 输入：s = "chopper is not a tanuki", k = 5
         * 输出："chopper is not a tanuki"
         */
        System.out.println(truncateSentence.truncateSentence("chopper is not a tanuki", 5));
    }
}
