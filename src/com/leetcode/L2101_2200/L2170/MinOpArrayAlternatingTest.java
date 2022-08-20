package com.leetcode.L2101_2200.L2170;

public class MinOpArrayAlternatingTest {
    public static void main(String[] args) {
        MinOpArrayAlternating minOpArrayAlternating = new MinOpArrayAlternating();
        /*
          示例 1：
          输入：nums = [3,1,3,2,4,3]
          输出：3
          解释：
          使数组变成交替数组的方法之一是将该数组转换为 [3,1,3,1,3,1] 。
          在这种情况下，操作数为 3 。
          可以证明，操作数少于 3 的情况下，无法使数组变成交替数组。
         */
        System.out.println(minOpArrayAlternating.minimumOperations(new int[]{3, 1, 3, 2, 4, 3}));
        /*
          示例 2：
          输入：nums = [1,2,2,2,2]
          输出：2
          解释：
          使数组变成交替数组的方法之一是将该数组转换为 [1,2,1,2,1].
          在这种情况下，操作数为 2 。
          注意，数组不能转换成 [2,2,2,2,2] 。因为在这种情况下，nums[0] == nums[1]，不满足交替数组的条件。
         */
        System.out.println(minOpArrayAlternating.minimumOperations(new int[]{1, 2, 2, 2, 2}));
    }
}
