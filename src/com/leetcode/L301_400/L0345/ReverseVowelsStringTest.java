package com.leetcode.L301_400.L0345;

public class ReverseVowelsStringTest {
    public static void main(String[] args) {
        ReverseVowelsString reverseVowelsString = new ReverseVowelsString();
        /*
          示例 1：
          输入："hello"
          输出："holle"
         */
        System.out.println(reverseVowelsString.reverseVowels("hello"));
        System.out.println(reverseVowelsString.reverseVowels_optimization("hello"));
        /*
          示例 2：
          输入："leetcode"
          输出："leotcede"
         */
        System.out.println(reverseVowelsString.reverseVowels("leetcode"));
        System.out.println(reverseVowelsString.reverseVowels_optimization("leetcode"));
    }
}
