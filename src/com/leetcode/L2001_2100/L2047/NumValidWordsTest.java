package com.leetcode.L2001_2100.L2047;

public class NumValidWordsTest {
    public static void main(String[] args) {
        NumValidWords numValidWords = new NumValidWords();
        /*
          示例 1：
          输入：sentence = "cat and  dog"
          输出：3
          解释：句子中的有效单词是 "cat"、"and" 和 "dog"
         */
        System.out.println(numValidWords.countValidWords(" o6 t"));
        /*
          示例 2：
          输入：sentence = "!this  1-s b8d!"
          输出：0
          解释：句子中没有有效单词
          "!this" 不是有效单词，因为它以一个标点开头
          "1-s" 和 "b8d" 也不是有效单词，因为它们都包含数字
         */
        System.out.println(numValidWords.countValidWords("!this  1-s b8d!"));
        /*
          示例 3：
          输入：sentence = "alice and  bob are playing stone-game10"
          输出：5
          解释：句子中的有效单词是 "alice"、"and"、"bob"、"are" 和 "playing"
          "stone-game10" 不是有效单词，因为它含有数字
         */
        System.out.println(numValidWords.countValidWords("alice and  bob are playing stone-game10"));
        /*
          示例 4：
          输入：sentence = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener."
          输出：6
          解释：句子中的有效单词是 "he"、"bought"、"pencils,"、"erasers,"、"and" 和 "pencil-sharpener."
         */
        System.out.println(numValidWords.countValidWords("he bought 2 pencils, 3 erasers, and 1  pencil-sharpener."));
    }
}
