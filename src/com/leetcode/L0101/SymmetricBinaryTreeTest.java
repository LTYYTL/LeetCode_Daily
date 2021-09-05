package com.leetcode.L0101;

import com.util.TreeNode;

public class SymmetricBinaryTreeTest {
    public static void main(String[] args) {
        SymmetricBinaryTree symmetricBinaryTree = new SymmetricBinaryTree();
        /** * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
         *     1
         *    / \
         *   2   2
         *  / \ / \
         * 3  4 4  3
         * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
         *     1
         *    / \
         *   2   2
         *    \   \
         *    3    3
         *
         * 示例 1：
         * 输入：root = [1,2,2,3,4,4,3]
         * 输出：true
         */
        TreeNode rll = new TreeNode(3);
        TreeNode rlr = new TreeNode(4);
        TreeNode rl = new TreeNode(2,rll,rlr);

        TreeNode rrl = new TreeNode(4);
        TreeNode rrr = new TreeNode(3);
        TreeNode rr = new TreeNode(2,rrl,rrr);

        TreeNode root = new TreeNode(1,rl,rr);

        System.out.println(symmetricBinaryTree.isSymmetric(root));
    }
}
