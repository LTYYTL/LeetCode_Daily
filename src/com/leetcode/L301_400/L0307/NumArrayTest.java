package com.leetcode.L301_400.L0307;

public class NumArrayTest {
    public static void main(String[] args) {
        /**
         * 示例 1：
         * 输入：
         * ["NumArray", "sumRange", "update", "sumRange"]
         * [[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
         * 输出：
         * [null, 9, null, 8]
         * 解释：
         * NumArray numArray = new NumArray([1, 3, 5]);
         * numArray.sumRange(0, 2); // 返回 1 + 3 + 5 = 9
         * numArray.update(1, 2);   // nums = [1,2,5]
         * numArray.sumRange(0, 2); // 返回 1 + 2 + 5 = 8
         */
        NumArray numArray = new NumArray(new int[]{1,3,5});
        System.out.println(numArray.sumRange(0, 2));
        numArray.update(1,2);
        System.out.println(numArray.sumRange(0, 2));
    }
}
