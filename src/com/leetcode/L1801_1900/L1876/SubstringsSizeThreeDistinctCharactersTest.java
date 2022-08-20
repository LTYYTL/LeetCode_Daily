package com.leetcode.L1801_1900.L1876;

public class SubstringsSizeThreeDistinctCharactersTest {

    public static void main(String[] args) {
        SubstringsSizeThreeDistinctCharacters substringsSizeThreeDistinctCharacters = new SubstringsSizeThreeDistinctCharacters();
        /*
          示例 1：
          输入：s = "xyzzaz"
          输出：1
          解释：总共有 4 个长度为 3 的子字符串："xyz"，"yzz"，"zza" 和 "zaz" 。
          唯一的长度为 3 的好子字符串是 "xyz" 。
         */
        System.out.println(substringsSizeThreeDistinctCharacters.countGoodSubstrings("xyzzaz"));
        /*
          示例 2：
          输入：s = "aababcabc"
          输出：4
          解释：总共有 7 个长度为 3 的子字符串："aab"，"aba"，"bab"，"abc"，"bca"，"cab" 和 "abc" 。
          好子字符串包括 "abc"，"bca"，"cab" 和 "abc" 。
         */
        System.out.println(substringsSizeThreeDistinctCharacters.countGoodSubstrings("aababcabc"));
    }
}
