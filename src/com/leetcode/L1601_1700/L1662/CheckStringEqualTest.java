package com.leetcode.L1601_1700.L1662;

public class CheckStringEqualTest {
    public static void main(String[] args) {
        CheckStringEqual checkStringEqual = new CheckStringEqual();
        /*
          示例 1：
          输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
          输出：true
          解释：
          word1 表示的字符串为 "ab" + "c" -> "abc"
          word2 表示的字符串为 "a" + "bc" -> "abc"
          两个字符串相同，返回 true
         */
        System.out.println(checkStringEqual.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        /*
          示例 2：
          输入：word1 = ["a", "cb"], word2 = ["ab", "c"]
          输出：false
         */
        System.out.println(checkStringEqual.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        /*
          示例 3：
          输入：word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
          输出：true
         */
        System.out.println(checkStringEqual.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }
}
