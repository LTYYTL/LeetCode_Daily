package com.leetcode.L0767;

public class ReorganizeStringTest {
    public static void main(String[] args) {
        ReorganizeString reorganizeString = new ReorganizeString();
        /**
         * 示例 1:
         * 输入: S = "aab"
         * 输出: "aba"
         */
        //方法一：基于最大堆的贪心算法
        System.out.println(reorganizeString.reorganizeString("aab"));
        //方法二：基于计数的贪心算法
        System.out.println(reorganizeString.reorganizeString_count("aab"));
        /**
         * 示例 2:
         * 输入: S = "aaab"
         * 输出: ""
         */
        //方法一：基于最大堆的贪心算法
        System.out.println(reorganizeString.reorganizeString("aaab"));
        //方法二：基于计数的贪心算法
        System.out.println(reorganizeString.reorganizeString_count("aaab"));
    }
}
