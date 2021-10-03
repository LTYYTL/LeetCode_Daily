package com.leetcode.L101_200.L0162;

public class FindPeakElementTest {
    public static void main(String[] args) {
        FindPeakElement findPeakElement = new FindPeakElement();
        /** * 示例 1：
         * 输入：nums = [1,2,3,1]
         * 输出：2
         * 解释：3 是峰值元素，你的函数应该返回其索引 2。
         */
        System.out.println(findPeakElement.findPeakElement(new int[]{1, 2, 3, 1}));
        /**
         * 示例 2：
         * 输入：nums = [1,2,1,3,5,6,4]
         * 输出：1 或 5
         * 解释：你的函数可以返回索引 1，其峰值元素为 2；
         *      或者返回索引 5， 其峰值元素为 6。
         */
        System.out.println(findPeakElement.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}
