package com.leetcode.L401_500.L0473;

public class MatchsticksSquareTest {
    public static void main(String[] args) {
        MatchsticksSquare matchsticksSquare = new MatchsticksSquare();
        /*
          示例 1:
          输入: matchsticks = [1,1,2,2,2]
          输出: true
          解释: 能拼成一个边长为2的正方形，每边两根火柴。
         */
        System.out.println(matchsticksSquare.makesquare(new int[]{1, 1, 2, 2, 2}));
        /*
          示例 2:
          输入: matchsticks = [3,3,3,3,4]
          输出: false
          解释: 不能用所有火柴拼成一个正方形。
         */
        System.out.println(matchsticksSquare.makesquare(new int[]{3, 3, 3, 3, 4}));
    }
}
