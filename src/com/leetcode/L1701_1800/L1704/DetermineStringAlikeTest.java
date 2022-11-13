package com.leetcode.L1701_1800.L1704;

public class DetermineStringAlikeTest {
    public static void main(String[] args) {
        DetermineStringAlike determineStringAlike = new DetermineStringAlike();
        /*
          示例 1：
          输入：s = "book"
          输出：true
          解释：a = "bo" 且 b = "ok" 。a 中有 1 个元音，b 也有 1 个元音。所以，a 和 b 相似。
         */
        System.out.println(determineStringAlike.halvesAreAlike("book"));
        /*
          示例 2：
          输入：s = "textbook"
          输出：false
          解释：a = "text" 且 b = "book" 。a 中有 1 个元音，b 中有 2 个元音。因此，a 和 b 不相似。
          注意，元音 o 在 b 中出现两次，记为 2 个。
         */
        System.out.println(determineStringAlike.halvesAreAlike("textbook"));
    }
}
