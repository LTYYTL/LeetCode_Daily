package com.leetcode.L901_1000.L0926;

public class FlipStringMonotoneIncreasingTest {
    public static void main(String[] args) {
        FlipStringMonotoneIncreasing flipStringMonotoneIncreasing = new FlipStringMonotoneIncreasing();
        /**
         * 示例 1：
         * 输入："00110"
         * 输出：1
         * 解释：我们翻转最后一位得到 00111.
         */
        System.out.println(flipStringMonotoneIncreasing.minFlipsMonoIncr("00110"));
        /**
         * 示例 2：
         * 输入："010110"
         * 输出：2
         * 解释：我们翻转得到 011111，或者是 000111。
         */
        System.out.println(flipStringMonotoneIncreasing.minFlipsMonoIncr("010110"));
        /**
         * 示例 3：
         * 输入："00011000"
         * 输出：2
         * 解释：我们翻转得到 00000000。
         */
        System.out.println(flipStringMonotoneIncreasing.minFlipsMonoIncr("00011000"));
    }
}
