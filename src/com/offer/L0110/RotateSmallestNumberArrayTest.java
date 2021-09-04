package com.offer.L0110;

public class RotateSmallestNumberArrayTest {
    public static void main(String[] args) {
        RotateSmallestNumberArray rotateSmallestNumberArray = new RotateSmallestNumberArray();
        /**
         * 示例 1：
         * 输入：[3,4,5,1,2]
         * 输出：1
         */
        System.out.println(rotateSmallestNumberArray.minArray(new int[]{3, 4, 5, 1, 2}));
        /**
         * 示例 2：
         * 输入：[2,2,2,0,1]
         * 输出：0
         */
        System.out.println(rotateSmallestNumberArray.minArray(new int[]{2, 2, 2, 0, 1}));
    }
}
