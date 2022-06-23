package com.leetcode.L1_100.L0030;

public class SubstringAllWordsTest {
    public static void main(String[] args) {
        SubstringAllWords substringAllWords = new SubstringAllWords();
        /**
         * 示例 1：
         * 输入：s = "barfoothefoobarman", words = ["foo","bar"]
         * 输出：[0,9]
         * 解释：
         * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
         * 输出的顺序不重要, [9,0] 也是有效答案。
         */
        System.out.println(substringAllWords.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        /**
         * 示例 2：
         * 输入：s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
         * 输出：[]
         */
        System.out.println(substringAllWords.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}));
        /**
         * 示例 3：
         * 输入：s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
         * 输出：[6,9,12]
         */
        System.out.println(substringAllWords.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}));

    }
}
