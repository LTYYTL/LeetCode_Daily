package com.leetcode.L1301_1400.L1338;

public class HalfArrayTest {
    public static void main(String[] args) {
        HalfArray halfArray = new HalfArray();
        /*
         * 示例 1：
         * 输入：arr = [3,3,3,3,5,5,5,2,2,7]
         * 输出：2
         * 解释：选择 {3,7} 使得结果数组为 [5,5,5,2,2]、长度为 5（原数组长度的一半）。
         * 大小为 2 的可行集合有 {3,5},{3,2},{5,2}。
         * 选择 {2,7} 是不可行的，它的结果数组为 [3,3,3,3,5,5,5]，新数组长度大于原数组的二分之一。
         */
        System.out.println(halfArray.minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}));
        /*
         * 示例 2：
         * 输入：arr = [7,7,7,7,7,7]
         * 输出：1
         * 解释：我们只能选择集合 {7}，结果数组为空。
         */
        System.out.println(halfArray.minSetSize(new int[]{7, 7, 7, 7, 7, 7}));
    }
}
