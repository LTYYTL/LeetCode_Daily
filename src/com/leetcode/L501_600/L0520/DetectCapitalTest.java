package com.leetcode.L501_600.L0520;

public class DetectCapitalTest {
    public static void main(String[] args) {
        DetectCapital detectCapital = new DetectCapital();
        /**
         * 示例 1：
         * 输入：word = "USA"
         * 输出：true
         */
        System.out.println(detectCapital.detectCapitalUse("USA"));
        /**
         * 示例 2：
         * 输入：word = "FlaG"
         * 输出：false
         */
        System.out.println(detectCapital.detectCapitalUse("FlaG"));
    }
}
