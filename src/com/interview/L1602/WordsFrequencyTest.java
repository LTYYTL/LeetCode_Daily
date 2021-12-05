package com.interview.L1602;

public class WordsFrequencyTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * WordsFrequency wordsFrequency = new WordsFrequency({"i", "have", "an", "apple", "he", "have", "a", "pen"});
         * wordsFrequency.get("you"); //返回0，"you"没有出现过
         * wordsFrequency.get("have"); //返回2，"have"出现2次
         * wordsFrequency.get("an"); //返回1
         * wordsFrequency.get("apple"); //返回1
         * wordsFrequency.get("pen"); //返回1
         */
        WordsFrequency wordsFrequency = new WordsFrequency(new String[]{"i", "have", "an", "apple", "he", "have", "a", "pen"});
        System.out.println(wordsFrequency.get("you"));
        System.out.println(wordsFrequency.get("have"));
        System.out.println(wordsFrequency.get("an"));
        System.out.println(wordsFrequency.get("apple"));
        System.out.println(wordsFrequency.get("pen"));


    }
}
