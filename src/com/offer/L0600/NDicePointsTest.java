package com.offer.L0600;

import java.util.Arrays;

public class NDicePointsTest {
    public static void main(String[] args) {
        NDicePoints nDicePoints = new NDicePoints();
        /*
          示例 1:
          输入: 1
          输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
         */
        System.out.println(Arrays.toString(nDicePoints.dicesProbability(1)));
        /*
          示例 2:
          输入: 2
          输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778]
         */
        System.out.println(Arrays.toString(nDicePoints.dicesProbability(2)));
    }
}
