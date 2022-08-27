package com.leetcode.L601_700.L0662;

import com.util.TreeNode;

public class MaxBinaryTreeTest {
    public static void main(String[] args) {
        MaxBinaryTree maxBinaryTree = new MaxBinaryTree();
        /* * 示例 1：
          输入：root = [1,3,2,5,3,null,9]
          输出：4
          解释：最大宽度出现在树的第 3 层，宽度为 4 (5,3,null,9) 。
         */
        System.out.println(
                maxBinaryTree.widthOfBinaryTree(
                        new TreeNode(1,
                                new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                                new TreeNode(2, null, new TreeNode(9))
                        )
                )
        );
        /*
          示例 2：
          输入：root = [1,3,2,5,null,null,9,6,null,7]
          输出：7
          解释：最大宽度出现在树的第 4 层，宽度为 7 (6,null,null,null,null,null,7) 。
         */
        /*
          示例 3：
          输入：root = [1,3,2,5]
          输出：2
          解释：最大宽度出现在树的第 2 层，宽度为 2 (3,2) 。
         */
        System.out.println(
                maxBinaryTree.widthOfBinaryTree(
                        new TreeNode(1,
                                new TreeNode(3, new TreeNode(5), null),
                                new TreeNode(2)
                        )
                )
        );
    }
}
