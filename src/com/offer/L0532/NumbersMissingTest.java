package com.offer.L0532;

public class NumbersMissingTest {
    public static void main(String[] args) {
        NumbersMissing numbersMissing = new NumbersMissing();
        /**
         * 示例 1:
         * 输入: [0,1,3]
         * 输出: 2
         */
        System.out.println(numbersMissing.missingNumber(new int[]{0, 1, 3}));
        /**
         * 示例 2:
         * 输入: [0,1,2,3,4,5,6,7,9]
         * 输出: 8
         */
        System.out.println(numbersMissing.missingNumber(new int[]{0,1,2,3,4,5,6,7,9}));
    }
}
