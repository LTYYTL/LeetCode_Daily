package com.leetcode.L3301_3400.L3375;

public class ArrayToKMinOperationsTest {
    public static void main(String[] args) {
        ArrayToKMinOperations arrayToKMinOperations = new ArrayToKMinOperations();
        /*
         * 示例 1：
         * 输入：nums = [5,2,5,4,5], k = 2
         * 输出：2
         * 解释：
         * 依次选择合法整数 4 和 2 ，将数组全部变为 2 。
         */
        System.out.println(arrayToKMinOperations.minOperations(new int[]{5, 2, 5, 4, 5}, 2));
        /*
         * 示例 2：
         * 输入：nums = [2,1,2], k = 2
         * 输出：-1
         * 解释：
         * 没法将所有值变为 2 。
         */
        System.out.println(arrayToKMinOperations.minOperations(new int[]{2, 1, 2}, 2));
        /*
         * 示例 3：
         * 输入：nums = [9,7,5,3], k = 1
         * 输出：4
         * 解释：
         * 依次选择合法整数 7 ，5 ，3 和 1 ，将数组全部变为 1 。
         */
        System.out.println(arrayToKMinOperations.minOperations(new int[]{9,7,5,3}, 1));
    }
}
