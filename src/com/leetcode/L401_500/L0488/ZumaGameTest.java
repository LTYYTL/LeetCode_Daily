package com.leetcode.L401_500.L0488;

public class ZumaGameTest {
    public static void main(String[] args) {
        ZumaGame zumaGame = new ZumaGame();
        /*
          示例 1：
          输入：board = "WRRBBW", hand = "RB"
          输出：-1
          解释：无法移除桌面上的所有球。可以得到的最好局面是：
          - 插入一个 'R' ，使桌面变为 WRRRBBW 。WRRRBBW -> WBBW
          - 插入一个 'B' ，使桌面变为 WBBBW 。WBBBW -> WW
          桌面上还剩着球，没有其他球可以插入。
         */
        System.out.println(zumaGame.findMinStep("WRRBBW", "RB"));
        /*
          示例 2：
          输入：board = "WWRRBBWW", hand = "WRBRW"
          输出：2
          解释：要想清空桌面上的球，可以按下述步骤：
          - 插入一个 'R' ，使桌面变为 WWRRRBBWW 。WWRRRBBWW -> WWBBWW
          - 插入一个 'B' ，使桌面变为 WWBBBWW 。WWBBBWW -> WWWW -> empty
          只需从手中出 2 个球就可以清空桌面。
         */
        System.out.println(zumaGame.findMinStep("WWRRBBWW", "WRBRW"));
        /*
          示例 3：
          输入：board = "G", hand = "GGGGG"
          输出：2
          解释：要想清空桌面上的球，可以按下述步骤：
          - 插入一个 'G' ，使桌面变为 GG 。
          - 插入一个 'G' ，使桌面变为 GGG 。GGG -> empty
          只需从手中出 2 个球就可以清空桌面。
         */
        System.out.println(zumaGame.findMinStep("G", "GGGGG"));
        /*
          示例 4：
          输入：board = "RBYYBBRRB", hand = "YRBGB"
          输出：3
          解释：要想清空桌面上的球，可以按下述步骤：
          - 插入一个 'Y' ，使桌面变为 RBYYYBBRRB 。RBYYYBBRRB -> RBBBRRB -> RRRB -> B
          - 插入一个 'B' ，使桌面变为 BB 。
          - 插入一个 'B' ，使桌面变为 BBB 。BBB -> empty
          只需从手中出 3 个球就可以清空桌面。
         */
        System.out.println(zumaGame.findMinStep("RBYYBBRRB", "YRBGB"));
    }
}
