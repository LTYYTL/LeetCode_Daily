package com.leetcode.L201_300.L0268;

public class MissingNumberTest {
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        /**
         * 示例 1：
         * 输入：nums = [3,0,1]
         * 输出：2
         * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
         */
        System.out.println(missingNumber.missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber.missingNumber_set(new int[]{3, 0, 1}));
        System.out.println(missingNumber.missingNumber_bit(new int[]{3, 0, 1}));
        System.out.println(missingNumber.missingNumber_math(new int[]{3, 0, 1}));
        /**
         * 示例 2：
         * 输入：nums = [0,1]
         * 输出：2
         * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
         */
        System.out.println(missingNumber.missingNumber(new int[]{0, 1}));
        System.out.println(missingNumber.missingNumber_set(new int[]{0, 1}));
        System.out.println(missingNumber.missingNumber_bit(new int[]{0, 1}));
        System.out.println(missingNumber.missingNumber_math(new int[]{0, 1}));
        /**
         * 示例 3：
         * 输入：nums = [9,6,4,2,3,5,7,0,1]
         * 输出：8
         * 解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。8 是丢失的数字，因为它没有出现在 nums 中。
         */
        System.out.println(missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber.missingNumber_set(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber.missingNumber_bit(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber.missingNumber_math(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        /**
         * 示例 4：
         * 输入：nums = [0]
         * 输出：1
         * 解释：n = 1，因为有 1 个数字，所以所有的数字都在范围 [0,1] 内。1 是丢失的数字，因为它没有出现在 nums 中。
         */
        System.out.println(missingNumber.missingNumber(new int[]{0}));
        System.out.println(missingNumber.missingNumber_set(new int[]{0}));
        System.out.println(missingNumber.missingNumber_bit(new int[]{0}));
        System.out.println(missingNumber.missingNumber_math(new int[]{0}));
    }
}
