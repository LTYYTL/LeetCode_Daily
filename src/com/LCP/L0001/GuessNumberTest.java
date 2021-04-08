package com.LCP.L0001;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        /** * 示例 1：
         * 输入：guess = [1,2,3], answer = [1,2,3]
         * 输出：3
         * 解释：小A 每次都猜对了。
         */
        System.out.println(guessNumber.game(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        /**
         * 示例 2：
         * 输入：guess = [2,2,3], answer = [3,2,1]
         * 输出：1
         * 解释：小A 只猜对了第二次。
         */
        System.out.println(guessNumber.game(new int[]{2,2,3}, new int[]{3,2,1}));
    }
}
