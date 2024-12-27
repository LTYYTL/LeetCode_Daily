package com.leetcode.L3001_3100.L3083;

public class StringReversalSubstringValidatorTest {
    public static void main(String[] args) {
        StringReversalSubstringValidator stringReversalSubstringValidator = new StringReversalSubstringValidator();
        /*
         * 示例 1：
         * 输入：s = "leetcode"
         * 输出：true
         * 解释：子字符串 "ee" 的长度为 2，它也出现在 reverse(s) == "edocteel" 中。
         */
        System.out.println(stringReversalSubstringValidator.isSubstringPresent("leetcode"));
        /*
         * 示例 2：
         * 输入：s = "abcba"
         * 输出：true
         * 解释：所有长度为 2 的子字符串 "ab"、"bc"、"cb"、"ba" 也都出现在 reverse(s) == "abcba" 中。
         */
        System.out.println(stringReversalSubstringValidator.isSubstringPresent("abcba"));
        /*
         * 示例 3：
         * 输入：s = "abcd"
         * 输出：false
         * 解释：字符串 s 中不存在满足「在其反转后的字符串中也出现」且长度为 2 的子字符串。
         */
        System.out.println(stringReversalSubstringValidator.isSubstringPresent("abcd"));
    }
}
