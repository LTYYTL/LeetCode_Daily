package com.leetcode.L1801_1900.L1832;

public class CheckSentenceIsPangramTest {
    public static void main(String[] args) {
        CheckSentenceIsPangram checkSentenceIsPangram = new CheckSentenceIsPangram();
        /** * 示例 1：
         * 输入：sentence = "thequickbrownfoxjumpsoverthelazydog"
         * 输出：true
         * 解释：sentence 包含英语字母表中每个字母至少一次。
         */
        System.out.println(checkSentenceIsPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        /**
         * 示例 2：
         * 输入：sentence = "leetcode"
         * 输出：false
         */
        System.out.println(checkSentenceIsPangram.checkIfPangram("leetcode"));
    }
}
