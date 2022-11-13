package com.leetcode.L701_800.L0791;

public class CustomSortStringTest {
    public static void main(String[] args) {
        CustomSortString customSortString = new CustomSortString();
        /*
          示例 1:
          输入: order = "cba", s = "abcd"
          输出: "cbad"
          解释:
          “a”、“b”、“c”是按顺序出现的，所以“a”、“b”、“c”的顺序应该是“c”、“b”、“a”。
          因为“d”不是按顺序出现的，所以它可以在返回的字符串中的任何位置。“dcba”、“cdba”、“cbda”也是有效的输出。
         */
        System.out.println(customSortString.customSortString("cba", "abcd"));
        /*
          示例 2:
          输入: order = "cbafg", s = "abcd"
          输出: "cbad"
         */
        System.out.println(customSortString.customSortString("cbafg", "abcd"));
    }
}
