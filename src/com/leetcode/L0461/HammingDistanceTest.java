package com.leetcode.L0461;

public class HammingDistanceTest {
    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        /*** 示例:
         * 输入: x = 1, y = 4
         * 输出: 2
         * 解释:
         * 1   (0 0 0 1)
         * 4   (0 1 0 0)
         *        ↑   ↑
         */
        System.out.println(hammingDistance.hammingDistance(1, 4));
    }
}
