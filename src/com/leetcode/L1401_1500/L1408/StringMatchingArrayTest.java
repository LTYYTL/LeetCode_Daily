package com.leetcode.L1401_1500.L1408;

public class StringMatchingArrayTest {
    public static void main(String[] args) {
        StringMatchingArray stringMatchingArray = new StringMatchingArray();
        /*
          示例 1：
          输入：words = ["mass","as","hero","superhero"]
          输出：["as","hero"]
          解释："as" 是 "mass" 的子字符串，"hero" 是 "superhero" 的子字符串。
          ["hero","as"] 也是有效的答案。
         */
        System.out.println(stringMatchingArray.stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
        /*
          示例 2：
          输入：words = ["leetcode","et","code"]
          输出：["et","code"]
          解释："et" 和 "code" 都是 "leetcode" 的子字符串。
         */
        System.out.println(stringMatchingArray.stringMatching(new String[]{"leetcode", "et", "code"}));
        /*
          示例 3：
          输入：words = ["blue","green","bu"]
          输出：[]
         */
        System.out.println(stringMatchingArray.stringMatching(new String[]{"blue", "green", "bu"}));
    }
}
