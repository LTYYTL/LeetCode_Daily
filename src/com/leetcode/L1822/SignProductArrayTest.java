package com.leetcode.L1822;

public class SignProductArrayTest {
    public static void main(String[] args) {
        SignProductArray signProductArray = new SignProductArray();
        /**
         * 示例 1：
         * 输入：nums = [-1,-2,-3,-4,3,2,1]
         * 输出：1
         * 解释：数组中所有值的乘积是 144 ，且 signFunc(144) = 1
         */
        System.out.println(signProductArray.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
        /**
         * 示例 2：
         * 输入：nums = [1,5,0,2,-3]
         * 输出：0
         * 解释：数组中所有值的乘积是 0 ，且 signFunc(0) = 0
         */
        System.out.println(signProductArray.arraySign(new int[]{1,5,0,2,-3}));
        /**
         * 示例 3：
         * 输入：nums = [-1,1,-1,1,-1]
         * 输出：-1
         * 解释：数组中所有值的乘积是 -1 ，且 signFunc(-1) = -1
         */
        System.out.println(signProductArray.arraySign(new int[]{-1,1,-1,1,-1}));
    }
}
