package com.leetcode.L1701_1800.L1748;

public class SumUniqueElementsTest {
    public static void main(String[] args) {
        SumUniqueElements sumUniqueElements = new SumUniqueElements();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3,2]
         * 输出：4
         * 解释：唯一元素为 [1,3] ，和为 4 。
         */
        System.out.println(sumUniqueElements.sumOfUnique(new int[]{1, 2, 3, 2}));
        /**
         * 示例 2：
         * 输入：nums = [1,1,1,1,1]
         * 输出：0
         * 解释：没有唯一元素，和为 0 。
         */
        System.out.println(sumUniqueElements.sumOfUnique(new int[]{1, 1, 1, 1, 1}));
        /**
         * 示例 3 ：
         * 输入：nums = [1,2,3,4,5]
         * 输出：15
         * 解释：唯一元素为 [1,2,3,4,5] ，和为 15 。
         */
        System.out.println(sumUniqueElements.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
}
