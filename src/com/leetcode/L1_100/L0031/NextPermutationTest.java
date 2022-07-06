package com.leetcode.L1_100.L0031;

import java.util.Arrays;

public class NextPermutationTest {
    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3]
         * 输出：[1,3,2]
         */
        int[] num1 = {1, 3, 2};
        nextPermutation.nextPermutation(num1);
        System.out.println(Arrays.toString(num1));
        /**
         * 示例 2：
         * 输入：nums = [3,2,1]
         * 输出：[1,2,3]
         */
        int[] num2 = {3, 2, 1};
        nextPermutation.nextPermutation(num2);
        System.out.println(Arrays.toString(num2));
        /**
         * 示例 3：
         * 输入：nums = [1,1,5]
         * 输出：[1,5,1]
         */
        int[] num3 = {1, 1, 5};
        nextPermutation.nextPermutation(num3);
        System.out.println(Arrays.toString(num3));
    }
}
