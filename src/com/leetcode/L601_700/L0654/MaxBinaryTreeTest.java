package com.leetcode.L601_700.L0654;

public class MaxBinaryTreeTest {
    public static void main(String[] args) {
        MaxBinaryTree maxBinaryTree = new MaxBinaryTree();
        /*
          示例 1：
          输入：nums = [3,2,1,6,0,5]
          输出：[6,3,5,null,2,0,null,null,1]
          解释：递归调用如下所示：
          - [3,2,1,6,0,5] 中的最大值是 6 ，左边部分是 [3,2,1] ，右边部分是 [0,5] 。
              - [3,2,1] 中的最大值是 3 ，左边部分是 [] ，右边部分是 [2,1] 。
                  - 空数组，无子节点。
                  - [2,1] 中的最大值是 2 ，左边部分是 [] ，右边部分是 [1] 。
                      - 空数组，无子节点。
                      - 只有一个元素，所以子节点是一个值为 1 的节点。
              - [0,5] 中的最大值是 5 ，左边部分是 [0] ，右边部分是 [] 。
                  - 只有一个元素，所以子节点是一个值为 0 的节点。
                  - 空数组，无子节点。

         */
        System.out.println(maxBinaryTree.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}));
        /* 示例 2：
          输入：nums = [3,2,1]
          输出：[3,null,2,null,1]
         */
        System.out.println(maxBinaryTree.constructMaximumBinaryTree(new int[]{3, 2, 1}));
    }
}
