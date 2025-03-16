package com.leetcode.L3101_3200.L3110;


public class StringScoreTest {
    public static void main(String[] args) {
        StringScore stringScore = new StringScore();
        /*
         * 示例 1：
         * 输入：s = "hello"
         * 输出：13
         * 解释：
         * s 中字符的 ASCII 码分别为：'h' = 104 ，'e' = 101 ，'l' = 108 ，'o' = 111 。所以 s 的分数为 |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13 。
         */
        System.out.println(stringScore.scoreOfString("hello"));
        /*
         * 示例 2：
         * 输入：s = "zaz"
         * 输出：50
         * 解释：
         * s 中字符的 ASCII 码分别为：'z' = 122 ，'a' = 97 。所以 s 的分数为 |122 - 97| + |97 - 122| = 25 + 25 = 50 。
         */
        System.out.println(stringScore.scoreOfString("zaz"));
    }
}
