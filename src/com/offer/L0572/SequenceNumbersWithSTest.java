package com.offer.L0572;

import java.util.Arrays;

public class SequenceNumbersWithSTest {
    public static void main(String[] args) {
        SequenceNumbersWithS sequenceNumbersWithS = new SequenceNumbersWithS();
        /**
         * 示例 1：
         * 输入：target = 9
         * 输出：[[2,3,4],[4,5]]
         */
        for (int[] ints : sequenceNumbersWithS.findContinuousSequence(9)) {
            System.out.print(Arrays.toString(ints));
        }
        System.out.println();
        /**
         * 示例 2：
         * 输入：target = 15
         * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
         */
        for (int[] ints : sequenceNumbersWithS.findContinuousSequence(15)) {
            System.out.print(Arrays.toString(ints));
        }
    }
}
