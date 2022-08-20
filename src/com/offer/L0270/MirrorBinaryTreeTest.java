package com.offer.L0270;

import com.util.TreeNode;

public class MirrorBinaryTreeTest {
    public static void main(String[] args) {
        MirrorBinaryTree mirrorBinaryTree = new MirrorBinaryTree();
        /* * 例如输入：
               4
             /   \
            2     7
           / \   / \
          1   3 6   9

          镜像输出：
               4
             /   \
            7     2
           / \   / \
          9   6 3   1

          示例 1：
          输入：root = [4,2,7,1,3,6,9]
          输出：[4,7,2,9,6,3,1]
         */
        TreeNode rll = new TreeNode(1);
        TreeNode rlr = new TreeNode(3);
        TreeNode rl = new TreeNode(2, rll, rlr);

        TreeNode rrl = new TreeNode(6);
        TreeNode rrr = new TreeNode(9);
        TreeNode rr = new TreeNode(7, rrl, rrr);

        TreeNode root = new TreeNode(4, rl, rr);

        System.out.println(mirrorBinaryTree.mirrorTree(root));
    }
}
