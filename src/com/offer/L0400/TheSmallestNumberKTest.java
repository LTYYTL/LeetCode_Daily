package com.offer.L0400;

import java.util.Arrays;

public class TheSmallestNumberKTest {
    public static void main(String[] args) {
        TheSmallestNumberK theSmallestNumberK = new TheSmallestNumberK();
        /**
         * 示例 1：
         * 输入：arr = [3,2,1], k = 2
         * 输出：[1,2] 或者 [2,1]
         */
        System.out.println(Arrays.toString(theSmallestNumberK.getLeastNumbers(new int[]{3, 2, 1}, 2)));
        /**
         * 示例 2：
         * 输入：arr = [0,1,2,1], k = 1
         * 输出：[0]
         */
        System.out.println(Arrays.toString(theSmallestNumberK.getLeastNumbers(new int[]{0, 1, 2, 1}, 1)));
    }
}
