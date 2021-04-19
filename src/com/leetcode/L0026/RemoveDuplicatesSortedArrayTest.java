package com.leetcode.L0026;

public class RemoveDuplicatesSortedArrayTest {
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
        /**
         * 示例 1：
         * 输入：nums = [1,1,2]
         * 输出：2, nums = [1,2]
         * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
         */
        System.out.println(removeDuplicatesSortedArray.removeDuplicates(new int[]{1, 1, 2}));
        /**
         * 示例 2：
         * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
         * 输出：5, nums = [0,1,2,3,4]
         * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
         */
        System.out.println(removeDuplicatesSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
