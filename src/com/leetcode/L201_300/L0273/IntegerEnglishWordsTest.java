package com.leetcode.L201_300.L0273;

public class IntegerEnglishWordsTest {
    public static void main(String[] args) {
        IntegerEnglishWords integerEnglishWords = new IntegerEnglishWords();
        /*
          示例 1：
          输入：num = 123
          输出："One Hundred Twenty Three"
         */
        System.out.println(integerEnglishWords.numberToWords(123));
        /*
          示例 2：
          输入：num = 12345
          输出："Twelve Thousand Three Hundred Forty Five"
         */
        System.out.println(integerEnglishWords.numberToWords(12345));
        /*
          示例 3：
          输入：num = 1234567
          输出："One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
         */
        System.out.println(integerEnglishWords.numberToWords(1234567));
        /*
          示例 4：
          输入：num = 1234567891
          输出："One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"
         */
        System.out.println(integerEnglishWords.numberToWords(1234567891));
    }
}
