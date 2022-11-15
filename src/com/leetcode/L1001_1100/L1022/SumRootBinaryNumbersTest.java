package com.leetcode.L1001_1100.L1022;

import com.util.TreeNode;

public class SumRootBinaryNumbersTest {
    public static void main(String[] args) {
        SumRootBinaryNumbers sumRootBinaryNumbers = new SumRootBinaryNumbers();
        /*
          示例 1：
          输入：root = [1,0,1,0,1,0,1]
          输出：22
          解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
         */
        System.out.println(sumRootBinaryNumbers.sumRootToLeaf(new TreeNode(1,
                new TreeNode(0, new TreeNode(0), new TreeNode(1)),
                new TreeNode(1, new TreeNode(0), new TreeNode(1)))));
        /*
          示例 2：
          输入：root = [0]
          输出：0
         */
        System.out.println(sumRootBinaryNumbers.sumRootToLeaf(new TreeNode(0)));
    }
}
