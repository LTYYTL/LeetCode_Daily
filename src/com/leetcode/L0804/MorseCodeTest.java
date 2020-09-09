package com.leetcode.L0804;

public class MorseCodeTest {
    public static void main(String[] args) {
        MorseCode morseCode = new MorseCode();

        /**
         * 例如:
         * 输入: words = ["gin", "zen", "gig", "msg"]
         * 输出: 2
         * 解释:
         * 各单词翻译如下:
         * "gin" -> "--...-."
         * "zen" -> "--...-."
         * "gig" -> "--...--."
         * "msg" -> "--...--."
         * 共有 2 种不同翻译, "--...-." 和 "--...--.".
         */
        String[] str = {"gin", "zen", "gig", "msg"};
        System.out.println(morseCode.uniqueMorseRepresentations(str));
    }
}
