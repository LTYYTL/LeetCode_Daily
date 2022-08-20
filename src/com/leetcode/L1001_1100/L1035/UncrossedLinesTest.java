package com.leetcode.L1001_1100.L1035;

public class UncrossedLinesTest {
    public static void main(String[] args) {
        UncrossedLines uncrossedLines = new UncrossedLines();
        /*
          示例 1：
          输入：nums1 = [1,4,2], nums2 = [1,2,4]
          输出：2
          解释：可以画出两条不交叉的线，如上图所示。
          但无法画出第三条不相交的直线，因为从 nums1[1]=4 到 nums2[2]=4 的直线将与从 nums1[2]=2 到 nums2[1]=2 的直线相交。
         */
        System.out.println(uncrossedLines.maxUncrossedLines(new int[]{1, 4, 2}, new int[]{1, 2, 4}));
        /*
          示例 2：
          输入：nums1 = [2,5,1,2,5], nums2 = [10,5,2,1,5,2]
          输出：3
         */
        System.out.println(uncrossedLines.maxUncrossedLines(new int[]{2, 5, 1, 2, 5}, new int[]{10, 5, 2, 1, 5, 2}));
        /*
          示例 3：
          输入：nums1 = [1,3,7,1,7,5], nums2 = [1,9,2,5,1]
          输出：2
         */
        System.out.println(uncrossedLines.maxUncrossedLines(new int[]{1, 3, 7, 1, 7, 5}, new int[]{1, 9, 2, 5, 1}));
    }
}
