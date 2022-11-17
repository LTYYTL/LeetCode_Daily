package com.leetcode.L701_800.L0792;

public class NumberMatchSubTest {
    public static void main(String[] args) {
        NumberMatchSub numberMatchSub = new NumberMatchSub();
        /*
          示例 1:
          输入: s = "abcde", words = ["a","bb","acd","ace"]
          输出: 3
          解释: 有三个是 s 的子序列的单词: "a", "acd", "ace"。
         */
        System.out.println(numberMatchSub.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
        /*
          示例 2:
          输入: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
          输出: 2
         */
        System.out.println(numberMatchSub.numMatchingSubseq("dsahjpjauf", new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}));
    }
}
