package com.leetcode.L1101_1200.L1189;

public class MaxNumberBalloonsTest {
    public static void main(String[] args) {
        MaxNumberBalloons maxNumberBalloons = new MaxNumberBalloons();
        /*
          示例 1：
          输入：text = "nlaebolko"
          输出：1
         */
        System.out.println(maxNumberBalloons.maxNumberOfBalloons("nlaebolko"));
        /*
          示例 2：
          输入：text = "loonbalxballpoon"
          输出：2
         */
        System.out.println(maxNumberBalloons.maxNumberOfBalloons("loonbalxballpoon"));
        /*
          示例 3：
          输入：text = "leetcode"
          输出：0
         */
        System.out.println(maxNumberBalloons.maxNumberOfBalloons("leetcode"));
    }
}
