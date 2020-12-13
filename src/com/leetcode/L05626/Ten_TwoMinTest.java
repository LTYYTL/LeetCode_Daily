package com.leetcode.L05626;

public class Ten_TwoMinTest {
    public static void main(String[] args) {
        Ten_TwoMin ten_twoMin = new Ten_TwoMin();
        /*** 示例 1：
         * 输入：n = "32"
         * 输出：3
         * 解释：10 + 11 + 11 = 32
         */
        System.out.println(ten_twoMin.minPartitions("32"));
        /**
         * 示例 2：
         * 输入：n = "82734"
         * 输出：8
         */
        System.out.println(ten_twoMin.minPartitions("82734"));
        /**
         * 示例 3：
         * 输入：n = "27346209830709182346"
         * 输出：9
         */
        System.out.println(ten_twoMin.minPartitions("27346209830709182346"));
    }
}
