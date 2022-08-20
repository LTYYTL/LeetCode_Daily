package com.leetcode.L201_300.L0260;


import java.util.Arrays;

public class SingleNumberIIITest {
    public static void main(String[] args) {
        SingleNumberIII singleNumberIII = new SingleNumberIII();
        /*
          示例 1：
          输入：nums = [1,2,1,3,2,5]
          输出：[3,5]
          解释：[5, 3] 也是有效的答案。
         */
        System.out.println(Arrays.toString(singleNumberIII.singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
        /*
          示例 2：
          输入：nums = [-1,0]
          输出：[-1,0]
         */
        System.out.println(Arrays.toString(singleNumberIII.singleNumber(new int[]{-1, 0})));
        /*
          示例 3：
          输入：nums = [0,1]
          输出：[1,0]
         */
        System.out.println(Arrays.toString(singleNumberIII.singleNumber(new int[]{1, 0})));
    }
}
