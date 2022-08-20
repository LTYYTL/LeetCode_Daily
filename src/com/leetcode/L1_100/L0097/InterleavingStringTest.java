package com.leetcode.L1_100.L0097;

public class InterleavingStringTest {
    public static void main(String[] args) {
        InterleavingString interleavingString = new InterleavingString();
        /*
          示例 1：
          输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
          输出：true
         */
        System.out.println(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        /*
          示例 2：
          输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
          输出：false
         */
        System.out.println(interleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        /*
          示例 3：
          输入：s1 = "", s2 = "", s3 = ""
          输出：true
         */
        System.out.println(interleavingString.isInterleave("", "", ""));
    }
}
