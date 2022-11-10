package com.leetcode.L1601_1700.L1668;

public class MaxRepeatingSubstringTest {
    public static void main(String[] args) {
        MaxRepeatingSubstring maxRepeatingSubstring = new MaxRepeatingSubstring();
        /*
          示例 1：
          输入：sequence = "ababc", word = "ab"
          输出：2
          解释："abab" 是 "ababc" 的子字符串。
         */
        System.out.println(maxRepeatingSubstring.maxRepeating("ababc", "ab"));
        /*
          示例 2：
          输入：sequence = "ababc", word = "ba"
          输出：1
          解释："ba" 是 "ababc" 的子字符串，但 "baba" 不是 "ababc" 的子字符串。
         */
        System.out.println(maxRepeatingSubstring.maxRepeating("ababc", "ba"));
        /*
          示例 3：
          输入：sequence = "ababc", word = "ac"
          输出：0
          解释："ac" 不是 "ababc" 的子字符串。
         */
        System.out.println(maxRepeatingSubstring.maxRepeating("ababc", "ac"));
    }
}
