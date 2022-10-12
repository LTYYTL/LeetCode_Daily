package com.leetcode.L1701_1800.L1790;

public class OneSwapStringsEqualTest {
    public static void main(String[] args) {
        OneSwapStringsEqual oneSwapStringsEqual = new OneSwapStringsEqual();
        /*
          示例 1：
          输入：s1 = "bank", s2 = "kanb"
          输出：true
          解释：例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
         */
        System.out.println(oneSwapStringsEqual.areAlmostEqual("bank", "kanb"));
        /*
          示例 2：
          输入：s1 = "attack", s2 = "defend"
          输出：false
          解释：一次字符串交换无法使两个字符串相等
         */
        System.out.println(oneSwapStringsEqual.areAlmostEqual("attack", "defend"));
        /*
          示例 3：
          输入：s1 = "kelb", s2 = "kelb"
          输出：true
          解释：两个字符串已经相等，所以不需要进行字符串交换
         */
        System.out.println(oneSwapStringsEqual.areAlmostEqual("kelb", "kelb"));
        /*
          示例 4：
          输入：s1 = "abcd", s2 = "dcba"
          输出：false
         */
        System.out.println(oneSwapStringsEqual.areAlmostEqual("abcd", "dcba"));
    }
}
