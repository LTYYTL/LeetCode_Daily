package com.leetcode.L401_500.L0424;

public class LongestRepeatingCharacterTest {
    public static void main(String[] args) {
        LongestRepeatingCharacter longestRepeatingCharacter = new LongestRepeatingCharacter();
        /**
         * 示例 1：
         * 输入：s = "ABAB", k = 2
         * 输出：4
         * 解释：用两个'A'替换为两个'B',反之亦然。
         */
        System.out.println(longestRepeatingCharacter.characterReplacement("ABAB", 2));
        /**
         * 示例 2：
         * 输入：s = "AABABBA", k = 1
         * 输出：4
         * 解释：
         * 将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
         * 子串 "BBBB" 有最长重复字母, 答案为 4。
         */
        System.out.println(longestRepeatingCharacter.characterReplacement("AABABBA", 1));
    }
}
