package com.leetcode.L801_900.L0877;

public class StoneGameTest {
    public static void main(String[] args) {
        StoneGame stoneGame = new StoneGame();
        /**
         * 示例：
         * 输入：[5,3,4,5]
         * 输出：true
         * 解释：
         * 亚历克斯先开始，只能拿前 5 颗或后 5 颗石子 。
         * 假设他取了前 5 颗，这一行就变成了 [3,4,5] 。
         * 如果李拿走前 3 颗，那么剩下的是 [4,5]，亚历克斯拿走后 5 颗赢得 10 分。
         * 如果李拿走后 5 颗，那么剩下的是 [3,4]，亚历克斯拿走后 4 颗赢得 9 分。
         * 这表明，取前 5 颗石子对亚历克斯来说是一个胜利的举动，所以我们返回 true 。
         */
        System.out.println(stoneGame.stoneGame(new int[]{5, 3, 4, 5}));
    }
}
