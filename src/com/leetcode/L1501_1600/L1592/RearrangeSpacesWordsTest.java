package com.leetcode.L1501_1600.L1592;

public class RearrangeSpacesWordsTest {
    public static void main(String[] args) {
        RearrangeSpacesWords rearrangeSpacesWords = new RearrangeSpacesWords();
        /*
          示例 1：
          输入：text = "  this   is  a sentence "
          输出："this   is   a   sentence"
          解释：总共有 9 个空格和 4 个单词。可以将 9 个空格平均分配到相邻单词之间，相邻单词间空格数为：9 / (4-1) = 3 个。
         */
        System.out.println(rearrangeSpacesWords.reorderSpaces("  this   is  a sentence "));
        /*
          示例 2：
          输入：text = " practice   makes   perfect"
          输出："practice   makes   perfect "
          解释：总共有 7 个空格和 3 个单词。7 / (3-1) = 3 个空格加上 1 个多余的空格。多余的空格需要放在字符串的末尾。
         */
        System.out.println(rearrangeSpacesWords.reorderSpaces(" practice   makes   perfect"));
        /*
          示例 3：
          输入：text = "hello   world"
          输出："hello   world"
         */
        System.out.println(rearrangeSpacesWords.reorderSpaces("hello   world"));
        /*
          示例 4：
          输入：text = "  walks  udp package   into  bar a"
          输出："walks  udp  package  into  bar  a "
         */
        System.out.println(rearrangeSpacesWords.reorderSpaces("  walks  udp package   into  bar a"));
        /*
          示例 5：
          输入：text = "a"
          输出："a"
         */
        System.out.println(rearrangeSpacesWords.reorderSpaces("a"));
    }
}
