package com.leetcode.L1801_1900.L1880;

public class CheckWordEqualsSummationTwoWordsTest {
    public static void main(String[] args) {
        CheckWordEqualsSummationTwoWords checkWordEqualsSummationTwoWords = new CheckWordEqualsSummationTwoWords();
        /**
         * 示例 1：
         * 输入：firstWord = "acb", secondWord = "cba", targetWord = "cdb"
         * 输出：true
         * 解释：
         * firstWord 的数值为 "acb" -> "021" -> 21
         * secondWord 的数值为 "cba" -> "210" -> 210
         * targetWord 的数值为 "cdb" -> "231" -> 231
         * 由于 21 + 210 == 231 ，返回 true
         */
        System.out.println(checkWordEqualsSummationTwoWords.isSumEqual("acb", "cba", "cdb"));
        /**
         * 示例 2：
         * 输入：firstWord = "aaa", secondWord = "a", targetWord = "aab"
         * 输出：false
         * 解释：
         * firstWord 的数值为 "aaa" -> "000" -> 0
         * secondWord 的数值为 "a" -> "0" -> 0
         * targetWord 的数值为 "aab" -> "001" -> 1
         * 由于 0 + 0 != 1 ，返回 false
         */
        System.out.println(checkWordEqualsSummationTwoWords.isSumEqual("aaa", "a", "aab"));
        /**
         * 示例 3：
         * 输入：firstWord = "aaa", secondWord = "a", targetWord = "aaaa"
         * 输出：true
         * 解释：
         * firstWord 的数值为 "aaa" -> "000" -> 0
         * secondWord 的数值为 "a" -> "0" -> 0
         * targetWord 的数值为 "aaaa" -> "0000" -> 0
         * 由于 0 + 0 == 0 ，返回 true
         */
        System.out.println(checkWordEqualsSummationTwoWords.isSumEqual("aaa", "a", "aaaa"));
    }
}
