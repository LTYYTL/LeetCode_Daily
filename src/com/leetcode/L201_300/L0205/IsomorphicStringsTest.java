package com.leetcode.L201_300.L0205;

public class IsomorphicStringsTest {
    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        /* 示例 1:
         输入: s = "egg", t = "add"
         输出: true
         */
        System.out.println(isomorphicStrings.isIsomorphic("egg", "add"));
        /*
          示例 2:
          输入: s = "foo", t = "bar"
          输出: false
         */
        System.out.println(isomorphicStrings.isIsomorphic("foo", "bar"));
        /*
          示例 3:
          输入: s = "paper", t = "title"
          输出: true
         */
        System.out.println(isomorphicStrings.isIsomorphic("paper", "title"));
    }
}
