package com.leetcode.L0485;

public class MaxConsecutiveOnesTest {
    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        /**
         * 示例 1:
         * 输入: [1,1,0,1,1,1]
         * 输出: 3
         * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
         */
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
