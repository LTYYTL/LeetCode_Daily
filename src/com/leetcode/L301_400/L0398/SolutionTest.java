package com.leetcode.L301_400.L0398;

public class SolutionTest {
    public static void main(String[] args) {
        /**
         * 示例:
         * int[] nums = new int[] {1,2,3,3,3};
         * Solution solution = new Solution(nums);
         * // pick(3) 应该返回索引 2,3 或者 4。每个索引的返回概率应该相等。
         * solution.pick(3);
         * // pick(1) 应该返回 0。因为只有nums[0]等于1。
         * solution.pick(1);
         */
        Solution solution = new Solution(new int[]{1,2,3,3,3});
        System.out.println(solution.pick(3));
        System.out.println(solution.pick(1));
    }
}
