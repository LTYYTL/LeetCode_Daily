package com.leetcode.L601_700.L0645;

import java.util.Arrays;

public class SetMismatchTest {
    public static void main(String[] args) {
        SetMismatch setMismatch = new SetMismatch();
        /**
         * 示例 1：
         * 输入：nums = [1,2,2,4]
         * 输出：[2,3]
         */
        System.out.println(Arrays.toString(setMismatch.findErrorNums(new int[]{1, 2, 2, 4})));
        /**
         * 示例 2：
         * 输入：nums = [1,1]
         * 输出：[1,2]
         */
        System.out.println(Arrays.toString(setMismatch.findErrorNums(new int[]{1, 1})));
    }
}
