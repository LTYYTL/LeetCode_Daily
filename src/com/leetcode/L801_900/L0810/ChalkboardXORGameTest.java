package com.leetcode.L801_900.L0810;

public class ChalkboardXORGameTest {
    public static void main(String[] args) {
        ChalkboardXORGame chalkboardXORGame = new ChalkboardXORGame();
        /* * 示例：
          输入: nums = [1, 1, 2]
          输出: false
          解释:
          Alice 有两个选择: 擦掉数字 1 或 2。
          如果擦掉 1, 数组变成 [1, 2]。剩余数字按位异或得到 1 XOR 2 = 3。那么 Bob 可以擦掉任意数字，因为 Alice 会成为擦掉最后一个数字的人，她总是会输。
          如果 Alice 擦掉 2，那么数组变成[1, 1]。剩余数字按位异或得到 1 XOR 1 = 0。Alice 仍然会输掉游戏。
         */
        System.out.println(chalkboardXORGame.xorGame(new int[]{1, 1, 2}));
    }
}
