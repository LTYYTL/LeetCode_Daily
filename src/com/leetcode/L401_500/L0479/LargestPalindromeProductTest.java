package com.leetcode.L401_500.L0479;

public class LargestPalindromeProductTest {
    public static void main(String[] args) {
        LargestPalindromeProduct largestPalindromeProduct = new LargestPalindromeProduct();
        /*
          示例 1:
          输入：n = 2
          输出：987
          解释：99 x 91 = 9009, 9009 % 1337 = 987
         */
        System.out.println(largestPalindromeProduct.largestPalindrome(2));
        /*
          示例 2:
          输入： n = 1
          输出： 9
         */
        System.out.println(largestPalindromeProduct.largestPalindrome(1));
    }
}
