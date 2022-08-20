package com.leetcode.L1401_1500.L1446;

public class ConsecutiveCharactersTest {
    public static void main(String[] args) {
        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters();
        /*
          示例 1：
          输入：s = "leetcode"
          输出：2
          解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
         */
        System.out.println(consecutiveCharacters.maxPower("leetcode"));
        /*
          示例 2：
          输入：s = "abbcccddddeeeeedcba"
          输出：5
          解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
         */
        System.out.println(consecutiveCharacters.maxPower("abbcccddddeeeeedcba"));
        /*
          示例 3：
          输入：s = "triplepillooooow"
          输出：5
         */
        System.out.println(consecutiveCharacters.maxPower("triplepillooooow"));
        /*
          示例 4：
          输入：s = "hooraaaaaaaaaaay"
          输出：11
         */
        System.out.println(consecutiveCharacters.maxPower("hooraaaaaaaaaaay"));
        /*
          示例 5：
          输入：s = "tourist"
          输出：1
         */
        System.out.println(consecutiveCharacters.maxPower("tourist"));
    }
}
