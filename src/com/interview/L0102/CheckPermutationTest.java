package com.interview.L0102;

public class CheckPermutationTest {
    public static void main(String[] args) {
        CheckPermutation checkPermutation = new CheckPermutation();
        /**
         * 示例 1：
         * 输入: s1 = "abc", s2 = "bca"
         * 输出: true
         */
        System.out.println(checkPermutation.CheckPermutation("abc", "bca"));
        /**
         * 示例 2：
         * 输入: s1 = "abc", s2 = "bad"
         * 输出: false
         */
        System.out.println(checkPermutation.CheckPermutation("abc", "bad"));
    }
}
