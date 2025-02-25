package com.leetcode.L2501_2600.L2595;

import com.util.ArrayUtil;

public class OddEvenDigitCounterTest {
    public static void main(String[] args) {
        OddEvenDigitCounter oddEvenDigitCounter = new OddEvenDigitCounter();
        /*
         * 示例 1：
         * 输入：n = 50
         * 输出：[1,2]
         * 解释：
         * 50 的二进制表示是 110010。
         * 在下标 1，4，5 对应的值为 1。
         */
        System.out.println(ArrayUtil.toString(oddEvenDigitCounter.evenOddBit(50)));
        /*
         * 示例 2：
         * 输入：n = 2
         * 输出：[0,1]
         * 解释：
         * 2 的二进制表示是 10。
         * 只有下标 1 对应的值为 1。
         */
        System.out.println(ArrayUtil.toString(oddEvenDigitCounter.evenOddBit(2)));
    }
}
