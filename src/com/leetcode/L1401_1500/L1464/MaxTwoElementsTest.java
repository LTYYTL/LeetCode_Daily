package com.leetcode.L1401_1500.L1464;

public class MaxTwoElementsTest {
    public static void main(String[] args) {
        MaxTwoElements maxTwoElements = new MaxTwoElements();
        /*
          示例 1：
          输入：nums = [3,4,5,2]
          输出：12
          解释：如果选择下标 i=1 和 j=2（下标从 0 开始），则可以获得最大值，(nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12 。
         */
        System.out.println(maxTwoElements.maxProduct(new int[]{3, 4, 5, 2}));
        /*
          示例 2：
          输入：nums = [1,5,4,5]
          输出：16
          解释：选择下标 i=1 和 j=3（下标从 0 开始），则可以获得最大值 (5-1)*(5-1) = 16 。
         */
        System.out.println(maxTwoElements.maxProduct(new int[]{1, 5, 4, 5}));
        /*
          示例 3：
          输入：nums = [3,7]
          输出：12
         */
        System.out.println(maxTwoElements.maxProduct(new int[]{3, 7}));
    }
}
