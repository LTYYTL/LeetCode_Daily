package com.leetcode.L1401_1500.L1422;

public class MaxScoreStringTest {
    public static void main(String[] args) {
        MaxScoreString maxScoreString = new MaxScoreString();
        /*
          示例 1：
          输入：s = "011101"
          输出：5
          解释：
          将字符串 s 划分为两个非空子字符串的可行方案有：
          左子字符串 = "0" 且 右子字符串 = "11101"，得分 = 1 + 4 = 5
          左子字符串 = "01" 且 右子字符串 = "1101"，得分 = 1 + 3 = 4
          左子字符串 = "011" 且 右子字符串 = "101"，得分 = 1 + 2 = 3
          左子字符串 = "0111" 且 右子字符串 = "01"，得分 = 1 + 1 = 2
          左子字符串 = "01110" 且 右子字符串 = "1"，得分 = 2 + 1 = 3
         */
        System.out.println(maxScoreString.maxScore("011101"));
        /*
          示例 2：
          输入：s = "00111"
          输出：5
          解释：当 左子字符串 = "00" 且 右子字符串 = "111" 时，我们得到最大得分 = 2 + 3 = 5
         */
        System.out.println(maxScoreString.maxScore("00111"));
        /*
          示例 3：
          输入：s = "1111"
          输出：3
         */
        System.out.println(maxScoreString.maxScore("1111"));
    }
}
