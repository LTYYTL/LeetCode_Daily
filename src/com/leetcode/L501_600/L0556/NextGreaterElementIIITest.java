package com.leetcode.L501_600.L0556;

import com.leetcode.L1_100.L0031.NextPermutation;

public class NextGreaterElementIIITest {
    public static void main(String[] args) {
        NextGreaterElementIII nextPermutation = new NextGreaterElementIII();
        /**
         * 示例 1：
         * 输入：n = 12
         * 输出：21
         */
        System.out.println(nextPermutation.nextGreaterElement(12));
        /**
         * 示例 2：
         * 输入：n = 21
         * 输出：-1
         */
        System.out.println(nextPermutation.nextGreaterElement(21));
    }
}
