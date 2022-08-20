package com.leetcode.L101_200.L0152;

public class MaxProductSubTest {
    public static void main(String[] args) {
        MaxProductSub maxProductSub = new MaxProductSub();
        /*
          示例 1:
          输入: [2,3,-2,4]
          输出: 6
          解释: 子数组 [2,3] 有最大乘积 6。
         */
        System.out.println(maxProductSub.maxProduct(new int[]{2, 3, -2, 4}));
        /*
          示例 2:
          输入: [-2,0,-1]
          输出: 0
          解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
         */
        System.out.println(maxProductSub.maxProduct(new int[]{-2, 0, -1}));
    }
}
