package com.leetcode.L301_400.L0324;

import java.util.Arrays;

public class WiggleSortIITest {
    public static void main(String[] args) {
        WiggleSortII wiggleSortII = new WiggleSortII();
        /**
         * 示例 1：
         * 输入：nums = [1,5,1,1,6,4]
         * 输出：[1,6,1,5,1,4]
         * 解释：[1,4,1,5,1,6] 同样是符合题目要求的结果，可以被判题程序接受。
         */
        int[] nums = {1, 5, 1, 1, 6, 4};
        wiggleSortII.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        /**
         * 示例 2：
         * 输入：nums = [1,3,2,2,3,1]
         * 输出：[2,3,1,3,1,2]
         */
        nums = new int[]{1, 3, 2, 2, 3, 1};
        wiggleSortII.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
