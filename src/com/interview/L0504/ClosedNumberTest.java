package com.interview.L0504;

import java.util.Arrays;

public class ClosedNumberTest {
    public static void main(String[] args) {
        ClosedNumber closedNumber = new ClosedNumber();
        /**
         * 示例1:
         *  输入：num = 2（或者0b10）
         *  输出：[4, 1] 或者（[0b100, 0b1]）
         */
        System.out.println(Arrays.toString(closedNumber.findClosedNumbers(2)));
        /**
         * 示例2:
         *  输入：num = 1
         *  输出：[2, -1]
         */
        System.out.println(Arrays.toString(closedNumber.findClosedNumbers(1)));
    }
}
