package com.leetcode.L301_400.L0321;

import java.util.Arrays;

public class CreateMaximumNumberTest {
    public static void main(String[] args) {
        CreateMaximumNumber createMaximumNumber = new CreateMaximumNumber();
        /*** 示例 1:
         * 输入:
         * nums1 = [3, 4, 6, 5]
         * nums2 = [9, 1, 2, 5, 8, 3]
         * k = 5
         * 输出:
         * [9, 8, 6, 5, 3]
         */
        System.out.println(Arrays.toString(createMaximumNumber.maxNumber(new int[]{3,4,6,5},new int[]{9, 1, 2, 5, 8, 3},5)));
    }
}
