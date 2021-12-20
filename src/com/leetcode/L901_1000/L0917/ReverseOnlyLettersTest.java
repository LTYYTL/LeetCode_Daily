package com.leetcode.L901_1000.L0917;

public class ReverseOnlyLettersTest {
    public static void main(String[] args) {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        /**
         * 示例 1：
         * 输入："ab-cd"
         * 输出："dc-ba"
         */
        System.out.println(reverseOnlyLetters.reverseOnlyLetters("ab-cd"));
        /**
         * 示例 2：
         * 输入："a-bC-dEf-ghIj"
         * 输出："j-Ih-gfE-dCba"
         */
        System.out.println(reverseOnlyLetters.reverseOnlyLetters("a-bC-dEf-ghIj"));
        /**
         * 示例 3：
         * 输入："Test1ng-Leet=code-Q!"
         * 输出："Qedo1ct-eeLg=ntse-T!"
         */
        System.out.println(reverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
