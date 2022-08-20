package com.leetcode.L1701_1800.L1763;

public class LongNiceSubTest {
    public static void main(String[] args) {
        LongNiceSub longNiceSub = new LongNiceSub();
        /*
          示例 1：
          输入：s = "YazaAay"
          输出："aAa"
          解释："aAa" 是一个美好字符串，因为这个子串中仅含一种字母，其小写形式 'a' 和大写形式 'A' 也同时出现了。
          "aAa" 是最长的美好子字符串。
         */
        System.out.println(longNiceSub.longestNiceSubstring("YazaAay"));
        /*
          示例 2：
          输入：s = "Bb"
          输出："Bb"
          解释："Bb" 是美好字符串，因为 'B' 和 'b' 都出现了。整个字符串也是原字符串的子字符串。
         */
        System.out.println(longNiceSub.longestNiceSubstring("Bb"));
        /*
          示例 3：
          输入：s = "c"
          输出：""
          解释：没有美好子字符串。
         */
        System.out.println(longNiceSub.longestNiceSubstring("c"));
        /*
          示例 4：
          输入：s = "dDzeE"
          输出："dD"
          解释："dD" 和 "eE" 都是最长美好子字符串。
          由于有多个美好子字符串，返回 "dD" ，因为它出现得最早。
         */
        System.out.println(longNiceSub.longestNiceSubstring("dDzeE"));
    }
}
