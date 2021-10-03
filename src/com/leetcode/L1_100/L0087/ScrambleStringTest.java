package com.leetcode.L1_100.L0087;

public class ScrambleStringTest {
    public static void main(String[] args) {
        ScrambleString scrambleString = new ScrambleString();
        /**
         * 示例 1：
         * 输入：s1 = "great", s2 = "rgeat"
         * 输出：true
         * 解释：s1 上可能发生的一种情形是：
         * "great" --> "gr/eat" // 在一个随机下标处分割得到两个子字符串
         * "gr/eat" --> "gr/eat" // 随机决定：「保持这两个子字符串的顺序不变」
         * "gr/eat" --> "g/r / e/at" // 在子字符串上递归执行此算法。两个子字符串分别在随机下标处进行一轮分割
         * "g/r / e/at" --> "r/g / e/at" // 随机决定：第一组「交换两个子字符串」，第二组「保持这两个子字符串的顺序不变」
         * "r/g / e/at" --> "r/g / e/ a/t" // 继续递归执行此算法，将 "at" 分割得到 "a/t"
         * "r/g / e/ a/t" --> "r/g / e/ a/t" // 随机决定：「保持这两个子字符串的顺序不变」
         * 算法终止，结果字符串和 s2 相同，都是 "rgeat"
         * 这是一种能够扰乱 s1 得到 s2 的情形，可以认为 s2 是 s1 的扰乱字符串，返回 true
         */
        System.out.println(scrambleString.isScramble_dp("great", "rgeat"));
        /**
         * 示例 2：
         * 输入：s1 = "abcde", s2 = "caebd"
         * 输出：false
         */
        System.out.println(scrambleString.isScramble_dp("abcde", "caebd"));
        /**
         * 示例 3：
         * 输入：s1 = "a", s2 = "a"
         * 输出：true
         */
        System.out.println(scrambleString.isScramble_dp("a", "a"));
    }
}
