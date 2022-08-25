package com.leetcode.L601_700.L0658;

public class FindKClosestElementsTest {
    public static void main(String[] args) {
        FindKClosestElements findKClosestElements = new FindKClosestElements();
        /*
          示例 1：
          输入：arr = [1,2,3,4,5], k = 4, x = 3
          输出：[1,2,3,4]
         */
        System.out.println(findKClosestElements.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
        /*
          示例 2：
          输入：arr = [1,2,3,4,5], k = 4, x = -1
          输出：[1,2,3,4]
         */
        System.out.println(findKClosestElements.findClosestElements(new int[]{0, 0, 1, 2, 3, 3, 4, 7, 7, 8}, 3, 5));
    }
}
