package com.leetcode.L3201_3300.L3297;

public class RearrangedSubstringCounterTest {
    public static void main(String[] args) {
        RearrangedSubstringCounter rearrangedSubstringCounter = new RearrangedSubstringCounter();
        /*
         * 示例 1：
         * 输入：word1 = "bcca", word2 = "abc"
         * 输出：1
         * 解释：
         * 唯一合法的子字符串是 "bcca" ，可以重新排列得到 "abcc" ，"abc" 是它的前缀。
         */
        System.out.println(rearrangedSubstringCounter.validSubstringCount("bcca", "abc"));
        /*
         * 示例 2：
         * 输入：word1 = "abcabc", word2 = "abc"
         * 输出：10
         * 解释：
         * 除了长度为 1 和 2 的所有子字符串都是合法的。
         */
        System.out.println(rearrangedSubstringCounter.validSubstringCount("abcabc", "abc"));
        /*
         * 示例 3：
         * 输入：word1 = "abcabc", word2 = "aaabc"
         * 输出：0
         */
        System.out.println(rearrangedSubstringCounter.validSubstringCount("abcabc", "aaabc"));

    }
}
