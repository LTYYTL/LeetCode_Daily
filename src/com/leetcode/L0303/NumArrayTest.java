package com.leetcode.L0303;

public class NumArrayTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * 输入：
         * ["NumArray", "sumRange", "sumRange", "sumRange"]
         * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
         * 输出：
         * [null, 1, -1, -3]
         * 解释：
         * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
         * numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
         * numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
         * numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
         */
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2)); // return 1 ((-2) + 0 + 3)
        System.out.println(numArray.sumRange(2, 5)); // return -1 (3 + (-5) + 2 + (-1))
        System.out.println(numArray.sumRange(0, 5)); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
    }
}
