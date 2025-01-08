package com.leetcode.L2201_2300.L2264;

public class LargestThreeSameDigitsFinderTest {
    public static void main(String[] args) {
        LargestThreeSameDigitsFinder largestThreeSameDigitsFinder = new LargestThreeSameDigitsFinder();
        /*
         * 示例 1：
         * 输入：num = "6777133339"
         * 输出："777"
         * 解释：num 中存在两个优质整数："777" 和 "333" 。
         * "777" 是最大的那个，所以返回 "777" 。
         */
        System.out.println(largestThreeSameDigitsFinder.largestGoodInteger("6777133339"));
        /*
         * 示例 2：
         * 输入：num = "2300019"
         * 输出："000"
         * 解释："000" 是唯一一个优质整数。
         */
        System.out.println(largestThreeSameDigitsFinder.largestGoodInteger("2300019"));
        /*
         * 示例 3：
         * 输入：num = "42352338"
         * 输出：""
         * 解释：不存在长度为 3 且仅由一个唯一数字组成的整数。因此，不存在优质整数。
         */
        System.out.println(largestThreeSameDigitsFinder.largestGoodInteger("42352338"));
    }
}
