package com.leetcode.L601_700.L0686;

public class RepeatedMatchTest {
    public static void main(String[] args) {
        RepeatedMatch repeatedMatch = new RepeatedMatch();
        /*
          示例 1：
          输入：a = "abcd", b = "cdabcdab"
          输出：3
          解释：a 重复叠加三遍后为 "abcdabcdabcd", 此时 b 是其子串。
         */
        System.out.println(repeatedMatch.repeatedStringMatch("abcd", "cdabcdab"));
        /*
          示例 2：
          输入：a = "a", b = "aa"
          输出：2
         */
        System.out.println(repeatedMatch.repeatedStringMatch("a", "aa"));
        /*
          示例 3：
          输入：a = "a", b = "a"
          输出：1
         */
        System.out.println(repeatedMatch.repeatedStringMatch("a", "a"));
        /*
          示例 4：
          输入：a = "abc", b = "wxyz"
          输出：-1
         */
        System.out.println(repeatedMatch.repeatedStringMatch("abc", "wxyz"));
    }
}
