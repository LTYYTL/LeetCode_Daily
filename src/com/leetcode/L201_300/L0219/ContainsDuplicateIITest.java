package com.leetcode.L201_300.L0219;

public class ContainsDuplicateIITest {
    public static void main(String[] args) {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        /**
         * 示例 1:
         * 输入: nums = [1,2,3,1], k = 3
         * 输出: true
         */
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        /**
         * 示例 2:
         * 输入: nums = [1,0,1,1], k = 1
         * 输出: true
         */
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        /**
         * 示例 3:
         * 输入: nums = [1,2,3,1,2,3], k = 2
         * 输出: false
         */
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
