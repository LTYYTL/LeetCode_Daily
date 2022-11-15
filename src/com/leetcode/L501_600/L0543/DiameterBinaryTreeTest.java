package com.leetcode.L501_600.L0543;

import com.util.TreeNode;

public class DiameterBinaryTreeTest {
    public static void main(String[] args) {
        DiameterBinaryTree diameterBinaryTree = new DiameterBinaryTree();
        /*
          示例 :
          给定二叉树

                    1
                   / \
                  2   3
                 / \
                4   5
          返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
         */
        TreeNode rll = new TreeNode(4);
        TreeNode rlr = new TreeNode(5);
        TreeNode rl = new TreeNode(2, rll, rlr);
        TreeNode rr = new TreeNode(3);
        TreeNode root = new TreeNode(1, rl, rr);
        System.out.println(diameterBinaryTree.diameterOfBinaryTree(root));
    }
}
