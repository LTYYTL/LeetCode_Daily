package com.offerII.L009;

public class SubarrayProductLessThanKTest {
    public static void main(String[] args) {
        SubarrayProductLessThanK subarrayProductLessThanK = new SubarrayProductLessThanK();
        /**
         * 示例 1:
         * 输入: nums = [10,5,2,6], k = 100
         * 输出: 8
         * 解释: 8个乘积小于100的子数组分别为: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]。
         * 需要注意的是 [10,5,2] 并不是乘积小于100的子数组。
         */
        System.out.println(subarrayProductLessThanK.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
        /**
         * 示例 2:
         * 输入: nums = [1,2,3], k = 0
         * 输出: 0
         */
        System.out.println(subarrayProductLessThanK.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0));
    }
}
