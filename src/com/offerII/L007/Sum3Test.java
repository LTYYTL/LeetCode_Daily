package com.offerII.L007;

public class Sum3Test {
    public static void main(String[] args) {
        Sum3 sum3 = new Sum3();
        /*
          示例 1：
          输入：nums = [-1,0,1,2,-1,-4]
          输出：[[-1,-1,2],[-1,0,1]]
         */
        System.out.println(sum3.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        /*
          示例 2：
          输入：nums = []
          输出：[]
         */
        System.out.println(sum3.threeSum(new int[]{}));
        /*
          示例 3：
          输入：nums = [0]
          输出：[]
         */
        System.out.println(sum3.threeSum(new int[]{0}));
    }
}
