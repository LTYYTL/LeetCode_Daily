package com.offer.L0142;

public class CutRopeIITest {
    public static void main(String[] args) {
        CutRopeII cutRopeII = new CutRopeII();
        /*
          示例 1：
          输入: 2
          输出: 1
          解释: 2 = 1 + 1, 1 × 1 = 1
         */
        System.out.println(cutRopeII.cuttingRope(2));
        /*
          示例 2:
          输入: 10
          输出: 36
          解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
         */
        System.out.println(cutRopeII.cuttingRope(10));
    }
}
