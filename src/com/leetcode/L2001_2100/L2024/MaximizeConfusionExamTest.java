package com.leetcode.L2001_2100.L2024;

public class MaximizeConfusionExamTest {
    public static void main(String[] args) {
        MaximizeConfusionExam maximizeConfusionExam = new MaximizeConfusionExam();
        /*
          示例 1：
          输入：answerKey = "TTFF", k = 2
          输出：4
          解释：我们可以将两个 'F' 都变为 'T' ，得到 answerKey = "TTTT" 。
          总共有四个连续的 'T' 。
         */
        System.out.println(maximizeConfusionExam.maxConsecutiveAnswers("TTFF", 2));
        /*
          示例 2：
          输入：answerKey = "TFFT", k = 1
          输出：3
          解释：我们可以将最前面的 'T' 换成 'F' ，得到 answerKey = "FFFT" 。
          或者，我们可以将第二个 'T' 换成 'F' ，得到 answerKey = "TFFF" 。
          两种情况下，都有三个连续的 'F' 。
         */
        System.out.println(maximizeConfusionExam.maxConsecutiveAnswers("TFFT", 1));
        /*
          示例 3：
          输入：answerKey = "TTFTTFTT", k = 1
          输出：5
          解释：我们可以将第一个 'F' 换成 'T' ，得到 answerKey = "TTTTTFTT" 。
          或者我们可以将第二个 'F' 换成 'T' ，得到 answerKey = "TTFTTTTT" 。
          两种情况下，都有五个连续的 'T' 。
         */
        System.out.println(maximizeConfusionExam.maxConsecutiveAnswers("TTFTTFTT", 1));
    }
}
