package com.offer.L0141;

public class CutRopeTest {
    public static void main(String[] args) {
        CutRope cutRope = new CutRope();
        /**
         * 示例 1：
         * 输入: 2
         * 输出: 1
         * 解释: 2 = 1 + 1, 1 × 1 = 1
         */
        System.out.println(cutRope.cuttingRope(2));
        /**
         * 示例 2:
         * 输入: 10
         * 输出: 36
         * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
         */
        System.out.println(cutRope.cuttingRope(10));
    }
}
