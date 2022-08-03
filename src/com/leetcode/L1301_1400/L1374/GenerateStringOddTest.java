package com.leetcode.L1301_1400.L1374;

public class GenerateStringOddTest {
    public static void main(String[] args) {
        GenerateStringOdd generateStringOdd = new GenerateStringOdd();
        /**
         * 示例 1：
         * 输入：n = 4
         * 输出："pppz"
         * 解释："pppz" 是一个满足题目要求的字符串，因为 'p' 出现 3 次，且 'z' 出现 1 次。当然，还有很多其他字符串也满足题目要求，比如："ohhh" 和 "love"。
         */
        System.out.println(generateStringOdd.generateTheString(4));
        /**
         * 示例 2：
         * 输入：n = 2
         * 输出："xy"
         * 解释："xy" 是一个满足题目要求的字符串，因为 'x' 和 'y' 各出现 1 次。当然，还有很多其他字符串也满足题目要求，比如："ag" 和 "ur"。
         */
        System.out.println(generateStringOdd.generateTheString(2));
        /**
         * 示例 3：
         * 输入：n = 7
         * 输出："holasss"
         */
        System.out.println(generateStringOdd.generateTheString(7));
    }
}
