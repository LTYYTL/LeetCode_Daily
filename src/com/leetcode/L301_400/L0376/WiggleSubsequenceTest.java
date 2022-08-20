package com.leetcode.L301_400.L0376;

public class WiggleSubsequenceTest {
    public static void main(String[] args) {
        WiggleSubsequence wiggleSubsequence = new WiggleSubsequence();
        /* 示例 1:
         输入: [1,7,4,9,2,5]
         输出: 6
         解释: 整个序列均为摆动序列。
         */
        System.out.println(wiggleSubsequence.wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5}));
        /*
          示例 2:
          输入: [1,17,5,10,13,15,10,5,16,8]
          输出: 7
          解释: 这个序列包含几个长度为 7 摆动序列，其中一个可为[1,17,10,13,10,16,8]。
         */
        System.out.println(wiggleSubsequence.wiggleMaxLength(new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8}));
        /*
          示例 3:
          输入: [1,2,3,4,5,6,7,8,9]
          输出: 2
         */
        System.out.println(wiggleSubsequence.wiggleMaxLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}
