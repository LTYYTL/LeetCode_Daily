package com.offer.L0571;

import java.util.Arrays;

public class TwoNumbersWithSTest {
    public static void main(String[] args) {
        TwoNumbersWithS twoNumbersWithS = new TwoNumbersWithS();
        /**
         * 示例 1：
         * 输入：nums = [2,7,11,15], target = 9
         * 输出：[2,7] 或者 [7,2]
         */
        System.out.println(Arrays.toString(twoNumbersWithS.twoSum(new int[]{2, 7, 11, 15}, 9)));
        /**
         * 示例 2：
         * 输入：nums = [10,26,30,31,47,60], target = 40
         * 输出：[10,30] 或者 [30,10]
         */
        System.out.println(Arrays.toString(twoNumbersWithS.twoSum(new int[]{10,26,30,31,47,60}, 40)));
    }
}
