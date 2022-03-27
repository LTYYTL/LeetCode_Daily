package com.leetcode.L601_700.L0682;

public class BaseballGameTest {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        /**
         * 示例 1：
         * 输入：ops = ["5","2","C","D","+"]
         * 输出：30
         * 解释：
         * "5" - 记录加 5 ，记录现在是 [5]
         * "2" - 记录加 2 ，记录现在是 [5, 2]
         * "C" - 使前一次得分的记录无效并将其移除，记录现在是 [5].
         * "D" - 记录加 2 * 5 = 10 ，记录现在是 [5, 10].
         * "+" - 记录加 5 + 10 = 15 ，记录现在是 [5, 10, 15].
         * 所有得分的总和 5 + 10 + 15 = 30
         */
        System.out.println(baseballGame.calPoints(new String[]{"5", "2", "C", "D", "+"}));
        /**
         * 示例 2：
         * 输入：ops = ["5","-2","4","C","D","9","+","+"]
         * 输出：27
         * 解释：
         * "5" - 记录加 5 ，记录现在是 [5]
         * "-2" - 记录加 -2 ，记录现在是 [5, -2]
         * "4" - 记录加 4 ，记录现在是 [5, -2, 4]
         * "C" - 使前一次得分的记录无效并将其移除，记录现在是 [5, -2]
         * "D" - 记录加 2 * -2 = -4 ，记录现在是 [5, -2, -4]
         * "9" - 记录加 9 ，记录现在是 [5, -2, -4, 9]
         * "+" - 记录加 -4 + 9 = 5 ，记录现在是 [5, -2, -4, 9, 5]
         * "+" - 记录加 9 + 5 = 14 ，记录现在是 [5, -2, -4, 9, 5, 14]
         * 所有得分的总和 5 + -2 + -4 + 9 + 5 + 14 = 27
         */
        System.out.println(baseballGame.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
        /**
         * 示例 3：
         * 输入：ops = ["1"]
         * 输出：1
         */
        System.out.println(baseballGame.calPoints(new String[]{"1"}));
    }
}
