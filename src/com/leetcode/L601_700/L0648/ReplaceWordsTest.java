package com.leetcode.L601_700.L0648;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWordsTest {
    public static void main(String[] args) {
        ReplaceWords replaceWords = new ReplaceWords();
        /**
         * 示例 1：
         * 输入：dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
         * 输出："the cat was rat by the bat"
         */
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("bat");
        list.add("rat");
        System.out.println(replaceWords.replaceWords(list, "the cattle was rattled by the battery"));
        /**
         * 示例 2：
         * 输入：dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
         * 输出："a a b c"
         */
        list.clear();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(replaceWords.replaceWords(list, "aadsfasf absbs bbab cadsfafs"));
        /**
         * 示例 3：
         * 输入：dictionary = ["a", "aa", "aaa", "aaaa"], sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"
         * 输出："a a a a a a a a bbb baba a"
         */
        list.clear();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        list.add("aaaa");
        System.out.println(replaceWords.replaceWords(list, "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"));
        /**
         * 示例 4：
         * 输入：dictionary = ["catt","cat","bat","rat"], sentence = "the cattle was rattled by the battery"
         * 输出："the cat was rat by the bat"
         */
        list.clear();
        list.add("catt");
        list.add("cat");
        list.add("bat");
        list.add("rat");
        System.out.println(replaceWords.replaceWords(list, "the cattle was rattled by the battery"));
        /**
         * 示例 5：
         * 输入：dictionary = ["ac","ab"], sentence = "it is abnormal that this solution is accepted"
         * 输出："it is ab that this solution is ac"
         */
        list.clear();
        list.add("ac");
        list.add("ab");
        System.out.println(replaceWords.replaceWords(list, "it is abnormal that this solution is accepted"));
    }
}
