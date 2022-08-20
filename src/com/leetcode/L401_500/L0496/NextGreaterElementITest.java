package com.leetcode.L401_500.L0496;

import java.util.Arrays;

public class NextGreaterElementITest {
    public static void main(String[] args) {
        NextGreaterElementI nextGreaterElementI = new NextGreaterElementI();
        /* * 示例 1:
          输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
          输出: [-1,3,-1]
          解释:
              对于 num1 中的数字 4 ，你无法在第二个数组中找到下一个更大的数字，因此输出 -1 。
              对于 num1 中的数字 1 ，第二个数组中数字1右边的下一个较大数字是 3 。
              对于 num1 中的数字 2 ，第二个数组中没有下一个更大的数字，因此输出 -1 。
         */
        System.out.println(Arrays.toString(nextGreaterElementI.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
        /*
          示例 2:
          输入: nums1 = [2,4], nums2 = [1,2,3,4].
          输出: [3,-1]
          解释:
              对于 num1 中的数字 2 ，第二个数组中的下一个较大数字是 3 。
              对于 num1 中的数字 4 ，第二个数组中没有下一个更大的数字，因此输出 -1 。
         */
        System.out.println(Arrays.toString(nextGreaterElementI.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
    }
}
