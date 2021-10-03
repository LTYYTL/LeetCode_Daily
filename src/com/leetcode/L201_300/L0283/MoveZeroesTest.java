package com.leetcode.L201_300.L0283;

import java.util.Arrays;

public class MoveZeroesTest {
    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        /**
         * 示例:
         * 输入: [0,1,0,3,12]
         * 输出: [1,3,12,0,0]
         */
        int[] nums = {0,1,0,3,12};
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
