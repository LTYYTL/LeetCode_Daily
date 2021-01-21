package com.leetcode.L0989;

public class AddArrayFormIntegerTest {
    public static void main(String[] args) {
        AddArrayFormInteger addArrayFormInteger = new AddArrayFormInteger();
        /**
         * 示例 1：
         * 输入：A = [1,2,0,0], K = 34
         * 输出：[1,2,3,4]
         * 解释：1200 + 34 = 1234
         */
        System.out.println(addArrayFormInteger.addToArrayForm(new int[]{1,2,0,0},34));
        /**
         * 示例 2：
         * 输入：A = [2,7,4], K = 181
         * 输出：[4,5,5]
         * 解释：274 + 181 = 455
         */
        System.out.println(addArrayFormInteger.addToArrayForm(new int[]{2,7,4},181));
        /**
         * 示例 3：
         * 输入：A = [2,1,5], K = 806
         * 输出：[1,0,2,1]
         * 解释：215 + 806 = 1021
         */
        System.out.println(addArrayFormInteger.addToArrayForm(new int[]{2,1,5},806));
        /**
         * 示例 4：
         * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
         * 输出：[1,0,0,0,0,0,0,0,0,0,0]
         * 解释：9999999999 + 1 = 10000000000
         */
        System.out.println(addArrayFormInteger.addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9},1));
    }

}
