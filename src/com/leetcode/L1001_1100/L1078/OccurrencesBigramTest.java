package com.leetcode.L1001_1100.L1078;

import java.util.Arrays;

public class OccurrencesBigramTest {
    public static void main(String[] args) {
        OccurrencesBigram occurrencesBigram = new OccurrencesBigram();
        /* * 示例 1：
          输入：text = "alice is a good girl she is a good student", first = "a", second = "good"
          输出：["girl","student"]
         */
        System.out.println(Arrays.toString(occurrencesBigram.findOcurrences("alice is a good girl she is a good student", "a", "good")));
        /*
          示例 2：
          输入：text = "we will we will rock you", first = "we", second = "will"
          输出：["we","rock"]
         */
        System.out.println(Arrays.toString(occurrencesBigram.findOcurrences("we will we will rock you", "we", "will")));

    }
}
