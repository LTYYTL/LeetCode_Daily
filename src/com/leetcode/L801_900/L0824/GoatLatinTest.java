package com.leetcode.L801_900.L0824;

public class GoatLatinTest {
    public static void main(String[] args) {
        GoatLatin goatLatin = new GoatLatin();
        /**
         * 示例 1：
         * 输入：sentence = "I speak Goat Latin"
         * 输出："Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
         */
        System.out.println(goatLatin.toGoatLatin("I speak Goat Latin"));
        /**
         * 示例 2：
         * 输入：sentence = "The quick brown fox jumped over the lazy dog"
         * 输出："heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
         */
        System.out.println(goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
