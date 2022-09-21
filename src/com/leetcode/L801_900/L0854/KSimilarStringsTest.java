package com.leetcode.L801_900.L0854;

public class KSimilarStringsTest {
    public static void main(String[] args) {
        KSimilarStrings kSimilarStrings = new KSimilarStrings();
        /*
          示例 1：
          输入：s1 = "ab", s2 = "ba"
          输出：1
         */
        System.out.println(kSimilarStrings.kSimilarity("ab", "ba"));
        /*
          示例 2：
          输入：s1 = "abc", s2 = "bca"
          输出：2
         */
        System.out.println(new KSimilarStrings().kSimilarity("abc", "bca"));
    }
}
