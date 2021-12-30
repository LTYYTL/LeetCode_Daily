package com.leetcode.L801_900.L0846;

public class HandStraightsTest {
    public static void main(String[] args) {
        HandStraights handStraights = new HandStraights();
        /**
         * 示例 1：
         * 输入：hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
         * 输出：true
         * 解释：Alice 手中的牌可以被重新排列为 [1,2,3]，[2,3,4]，[6,7,8]。
         */
        System.out.println(handStraights.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
        /**
         * 示例 2：
         * 输入：hand = [1,2,3,4,5], groupSize = 4
         * 输出：false
         * 解释：Alice 手中的牌无法被重新排列成几个大小为 4 的组。
         */
        System.out.println(handStraights.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4));
    }
}
