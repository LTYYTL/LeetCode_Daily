package com.leetcode.L0456;

public class Pattern132Test {
    public static void main(String[] args) {
        Pattern132 pattern132 = new Pattern132();
        /*** 示例 1：
         * 输入：nums = [1,2,3,4]
         * 输出：false
         * 解释：序列中不存在 132 模式的子序列。
         */
        System.out.println(pattern132.find132pattern(new int[]{1, 2, 3, 4}));
        /**
         * 示例 2：
         * 输入：nums = [3,1,4,2]
         * 输出：true
         * 解释：序列中有 1 个 132 模式的子序列： [1, 4, 2] 。
         */
        System.out.println(pattern132.find132pattern(new int[]{3,1,4,2}));
        /**
         * 示例 3：
         * 输入：nums = [-1,3,2,0]
         * 输出：true
         * 解释：序列中有 3 个 132 模式的的子序列：[-1, 3, 2]、[-1, 3, 0] 和 [-1, 2, 0] 。
         */
        System.out.println(pattern132.find132pattern(new int[]{-1,3,2,0}));
    }
}
