package com.leetcode.L801_900.L0809;

public class ExpressiveWordsTest {
    public static void main(String[] args) {
        ExpressiveWords expressiveWords = new ExpressiveWords();
        /*
          示例：
          输入：
          s = "heeellooo"
          words = ["hello", "hi", "helo"]
          输出：1
          解释：
          我们能通过扩张 "hello" 的 "e" 和 "o" 来得到 "heeellooo"。
          我们不能通过扩张 "helo" 来得到 "heeellooo" 因为 "ll" 的长度小于 3 。
         */
        System.out.println(expressiveWords.expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"}));
    }
}
