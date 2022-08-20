package com.offer.L0682;

import com.util.TreeNode;

public class LowestCommonAncestorBinaryTreeTest {
    public static void main(String[] args) {
        LowestCommonAncestorBinaryTree lowestCommonAncestorBinaryTree = new LowestCommonAncestorBinaryTree();
        /*
          示例 1：
          输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
          输出：3
          解释：节点 5 和节点 1 的最近公共祖先是节点 3 。
         */
        TreeNode<Integer> rrl = new TreeNode<>(0);
        TreeNode<Integer> rrr = new TreeNode<>(8);
        TreeNode<Integer> rr = new TreeNode<>(1, rrl, rrr);

        TreeNode<Integer> rlrl = new TreeNode<>(7);
        TreeNode<Integer> rlrr = new TreeNode<>(4);
        TreeNode<Integer> rll = new TreeNode<>(6);
        TreeNode<Integer> rlr = new TreeNode<>(2, rlrl, rlrr);
        TreeNode<Integer> rl = new TreeNode<>(5, rll, rlr);
        TreeNode<Integer> root = new TreeNode<>(3, rl, rr);

        System.out.println(lowestCommonAncestorBinaryTree.lowestCommonAncestor(root, rlrl, rlrr));
        /*
          示例 2：
          输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
          输出：5
          解释：节点 5 和节点 4 的最近公共祖先是节点 5 。因为根据定义最近公共祖先节点可以为节点本身。
         */
        /*
          示例 3：
          输入：root = [1,2], p = 1, q = 2
          输出：1
         */
    }

}
