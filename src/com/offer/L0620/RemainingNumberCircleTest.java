package com.offer.L0620;

public class RemainingNumberCircleTest {
    public static void main(String[] args) {
        RemainingNumberCircle remainingNumberCircle = new RemainingNumberCircle();
        /*
          示例 1：
          输入: n = 5, m = 3
          输出: 3
         */
        System.out.println(remainingNumberCircle.lastRemaining(5, 3));
        /*
          示例 2：
          输入: n = 10, m = 17
          输出: 2
         */
        System.out.println(remainingNumberCircle.lastRemaining(10, 17));
    }
}
