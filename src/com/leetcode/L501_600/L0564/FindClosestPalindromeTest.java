package com.leetcode.L501_600.L0564;

public class FindClosestPalindromeTest {
    public static void main(String[] args) {
        FindClosestPalindrome findClosestPalindrome = new FindClosestPalindrome();
        /*
          示例 1:
          输入: n = "123"
          输出: "121"
         */
        System.out.println(findClosestPalindrome.nearestPalindromic("123"));
        /*
          示例 2:
          输入: n = "1"
          输出: "0"
          解释: 0 和 2是最近的回文，但我们返回最小的，也就是 0。
         */
        System.out.println(findClosestPalindrome.nearestPalindromic("1"));
    }
}
