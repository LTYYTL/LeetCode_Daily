package com.leetcode.L801_900.L0801;

public class MinSwapsSeqTest {
    public static void main(String[] args) {
        MinSwapsSeq minSwapsSeq = new MinSwapsSeq();
        /*
          示例 1:
          输入: nums1 = [1,3,5,4], nums2 = [1,2,3,7]
          输出: 1
          解释:
          交换 A[3] 和 B[3] 后，两个数组如下:
          A = [1, 3, 5, 7] ， B = [1, 2, 3, 4]
          两个数组均为严格递增的。
         */
        System.out.println(minSwapsSeq.minSwap(new int[]{1, 3, 5, 4}, new int[]{1, 2, 3, 7}));
        /*
          示例 2:
          输入: nums1 = [0,3,5,8,9], nums2 = [2,1,4,6,9]
          输出: 1
         */
        System.out.println(minSwapsSeq.minSwap(new int[]{0, 3, 5, 8, 9}, new int[]{2, 1, 4, 6, 9}));
    }
}
