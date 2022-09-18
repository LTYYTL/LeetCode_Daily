package com.leetcode.L1601_1700.L1624;

public class LargestEqualCharactersTest {
    public static void main(String[] args) {
        LargestEqualCharacters largestEqualCharacters = new LargestEqualCharacters();
        /*
          示例 1：
          输入：s = "aa"
          输出：0
          解释：最优的子字符串是两个 'a' 之间的空子字符串。
         */
        System.out.println(largestEqualCharacters.maxLengthBetweenEqualCharacters("aa"));
        /*
          示例 2：
          输入：s = "abca"
          输出：2
          解释：最优的子字符串是 "bc" 。
         */
        System.out.println(largestEqualCharacters.maxLengthBetweenEqualCharacters("abca"));
        /*
          示例 3：
          输入：s = "cbzxy"
          输出：-1
          解释：s 中不存在出现出现两次的字符，所以返回 -1 。
         */
        System.out.println(largestEqualCharacters.maxLengthBetweenEqualCharacters("cbzxy"));
        /*
          示例 4：
          输入：s = "cabbac"
          输出：4
          解释：最优的子字符串是 "abba" ，其他的非最优解包括 "bb" 和 "" 。
         */
        System.out.println(largestEqualCharacters.maxLengthBetweenEqualCharacters("cabbac"));
    }
}
