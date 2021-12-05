package com.leetcode.L301_400.L0383;

public class RansomNoteTest {
    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        /**
         * 示例 1：
         * 输入：ransomNote = "a", magazine = "b"
         * 输出：false
         */
        System.out.println(ransomNote.canConstruct("a", "b"));
        /**
         * 示例 2：
         * 输入：ransomNote = "aa", magazine = "ab"
         * 输出：false
         */
        System.out.println(ransomNote.canConstruct("aa", "ab"));
        /**
         * 示例 3：
         * 输入：ransomNote = "aa", magazine = "aab"
         * 输出：true
         */
        System.out.println(ransomNote.canConstruct("aa", "aab"));
    }
}
