package com.offerII.L005;

public class MaximumProductWordLengthsTest {
    public static void main(String[] args) {
        MaximumProductWordLengths maximumProductWordLengths = new MaximumProductWordLengths();
        /*
          示例 1:
          输入: ["abcw","baz","foo","bar","xtfn","abcdef"]
          输出: 16
          解释: 这两个单词为 "abcw", "xtfn"。
         */
        System.out.println(maximumProductWordLengths.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
        /*
          示例 2:
          输入: ["a","ab","abc","d","cd","bcd","abcd"]
          输出: 4
          解释: 这两个单词为 "ab", "cd"。
         */
        System.out.println(maximumProductWordLengths.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
        /*
          示例 3:
          输入: ["a","aa","aaa","aaaa"]
          输出: 0
          解释: 不存在这样的两个单词。
         */
        System.out.println(maximumProductWordLengths.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }
}
