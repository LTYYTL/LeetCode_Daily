package com.leetcode.L1701_1800.L1781;

public class SumBeautyStringTest {
    public static void main(String[] args) {
        SumBeautyString sumBeautyString = new SumBeautyString();
        /*
          示例 1：
          输入：s = "aabcb"
          输出：5
          解释：美丽值不为零的字符串包括 ["aab","aabc","aabcb","abcb","bcb"] ，每一个字符串的美丽值都为 1 。
         */
        System.out.println(sumBeautyString.beautySum("aabcb"));
        /*
          示例 2：
          输入：s = "aabcbaa"
          输出：17
         */
        System.out.println(sumBeautyString.beautySum("aabcbaa"));
    }
}
