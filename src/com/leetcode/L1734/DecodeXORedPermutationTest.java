package com.leetcode.L1734;

import java.util.Arrays;

public class DecodeXORedPermutationTest {
    public static void main(String[] args) {
        DecodeXORedPermutation decodeXORedPermutation = new DecodeXORedPermutation();
        /** * 示例 1：
         * 输入：encoded = [3,1]
         * 输出：[1,2,3]
         * 解释：如果 perm = [1,2,3] ，那么 encoded = [1 XOR 2,2 XOR 3] = [3,1]
         */
        System.out.println(Arrays.toString(decodeXORedPermutation.decode(new int[]{3, 1})));
        /**
         * 示例 2：
         * 输入：encoded = [6,5,4,6]
         * 输出：[2,4,1,5,3]
         */
        System.out.println(Arrays.toString(decodeXORedPermutation.decode(new int[]{6, 5, 4, 6})));
    }
}
