package com.leetcode.L801_900.L0884;

import java.util.Arrays;

public class UncommonWordsSentencesTest {
    public static void main(String[] args) {
        UncommonWordsSentences uncommonWordsSentences = new UncommonWordsSentences();
        /*
          示例 1：
          输入：s1 = "this apple is sweet", s2 = "this apple is sour"
          输出：["sweet","sour"]
         */
        System.out.println(Arrays.toString(uncommonWordsSentences.uncommonFromSentences("this apple is sweet", "this apple is sour")));
        /*
          示例 2：
          输入：s1 = "apple apple", s2 = "banana"
          输出：["banana"]
         */
        System.out.println(Arrays.toString(uncommonWordsSentences.uncommonFromSentences("apple apple", "banana")));

    }
}
