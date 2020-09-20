package com.leetcode.L0090;

public class SubsetsIITest {
    public static void main(String[] args) {
        SubsetsII subsetsII = new SubsetsII();
        /**
         * 示例:
         * 输入: [1,2,2]
         * 输出:
         * [
         *   [2],
         *   [1],
         *   [1,2,2],
         *   [2,2],
         *   [1,2],
         *   []
         * ]
         */
        int[] nums = {1,2,2};
        System.out.println(subsetsII.subsetsWithDup(nums).toString());
    }
}
