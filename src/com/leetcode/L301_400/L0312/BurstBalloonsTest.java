package com.leetcode.L301_400.L0312;

public class BurstBalloonsTest {
    public static void main(String[] args) {
        BurstBalloons burstBalloons = new BurstBalloons();
        /*
          示例 1：
          输入：nums = [3,1,5,8]
          输出：167
          解释：
          nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
          coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167
         */
        System.out.println(burstBalloons.maxCoins(new int[]{3, 1, 5, 8}));
        /*
          示例 2：
          输入：nums = [1,5]
          输出：10
         */
        System.out.println(burstBalloons.maxCoins(new int[]{1, 5}));
    }
}
