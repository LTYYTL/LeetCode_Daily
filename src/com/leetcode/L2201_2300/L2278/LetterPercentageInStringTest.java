package com.leetcode.L2201_2300.L2278;

public class LetterPercentageInStringTest {
    public static void main(String[] args) {
        LetterPercentageInString letterPercentageInString = new LetterPercentageInString();
        /*
         * 示例 1：
         * 输入：s = "foobar", letter = "o"
         * 输出：33
         * 解释：
         * 等于字母 'o' 的字符在 s 中占到的百分比是 2 / 6 * 100% = 33% ，向下取整，所以返回 33 。
         */
        System.out.println(letterPercentageInString.percentageLetter("foobar", 'o'));
        /*
         * 示例 2：
         * 输入：s = "jjjj", letter = "k"
         * 输出：0
         * 解释：
         * 等于字母 'k' 的字符在 s 中占到的百分比是 0% ，所以返回 0 。
         */System.out.println(letterPercentageInString.percentageLetter("jjjj", 'k'));

    }
}
