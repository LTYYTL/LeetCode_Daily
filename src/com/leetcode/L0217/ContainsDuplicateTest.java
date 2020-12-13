package com.leetcode.L0217;

public class ContainsDuplicateTest {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        /** * 示例 1:
         * 输入: [1,2,3,1]
         * 输出: true
         */
        //方法一：排序
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
        //方法二：set集合
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
        /**
         * 示例 2:
         * 输入: [1,2,3,4]
         * 输出: false
         */
        //方法一：排序
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,4}));
        //方法二：set集合
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,4}));
        /**
         * 示例 3:
         * 输入: [1,1,1,3,3,4,3,2,4,2]
         * 输出: true
         */
        //方法一：排序
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        //方法二：set集合
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
