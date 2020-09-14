package com.leetcode.L0028;

public class ImplementstrStrTest {
    public static void main(String[] args) {
        ImplementstrStr implementstrStr = new ImplementstrStr();
        /** * 示例 1:
         * 输入: haystack = "hello", needle = "ll"
         * 输出: 2
         */
        //方法一：sunday算法
        System.out.println(implementstrStr.strStr("hello","ll"));
        //方法二：kmp算法
        System.out.println(implementstrStr.strStr_kmp("hello","ll"));
        /**
         * 示例 2:
         * 输入: haystack = "aaaaa", needle = "bba"
         * 输出: -1
         */
        //方法一：sunday算法
        System.out.println(implementstrStr.strStr("aaaaa","bba"));
        //方法二：kmp算法
        System.out.println(implementstrStr.strStr_kmp("aaaaa","bba"));
    }
}
