package com.leetcode.L1801_1900.L1827;

public class MinOperationsArrayTest {
    public static void main(String[] args) {
        MinOperationsArray minOperationsArray = new MinOperationsArray();
        /*
          示例 1：
          输入：nums = [1,1,1]
          输出：3
          解释：你可以进行如下操作：
          1) 增加 nums[2] ，数组变为 [1,1,2] 。
          2) 增加 nums[1] ，数组变为 [1,2,2] 。
          3) 增加 nums[2] ，数组变为 [1,2,3] 。
         */
        System.out.println(minOperationsArray.minOperations(new int[]{1, 1, 1}));
        /*
          示例 2：
          输入：nums = [1,5,2,4,1]
          输出：14
         */
        System.out.println(minOperationsArray.minOperations(new int[]{1, 5, 2, 4, 1}));
        /*
          示例 3：
          输入：nums = [8]
          输出：0
         */
        System.out.println(minOperationsArray.minOperations(new int[]{8}));
    }
}
