package com.leetcode.L0897;

import com.util.TreeNode;

public class IncreasingOrderSearchTreeTest {
    public static void main(String[] args) {
        IncreasingOrderSearchTree increasingOrderSearchTree = new IncreasingOrderSearchTree();
        /*** 示例 1：
         * 输入：root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
         * 输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
         */
        TreeNode<Integer> rlll = new TreeNode<>(1);
        TreeNode<Integer> rll = new TreeNode<>(2,rlll,null);
        TreeNode<Integer> rlr = new TreeNode<>(4);
        TreeNode<Integer> rl = new TreeNode<>(3,rll,rlr);

        TreeNode<Integer> rrrl = new TreeNode<>(7);
        TreeNode<Integer> rrrr = new TreeNode<>(9);
        TreeNode<Integer> rrr = new TreeNode<>(8,rrrl,rrrr);
        TreeNode<Integer> rr = new TreeNode<>(6,null,rrr);

        TreeNode<Integer> root = new TreeNode<>(5,rl,rr);
        System.out.println(increasingOrderSearchTree.increasingBST(root));
        /**
         * 示例 2：
         * 输入：root = [5,1,7]
         * 输出：[1,null,5,null,7]
         */
        TreeNode<Integer> rl1 = new TreeNode<>(1);
        TreeNode<Integer> rr1 = new TreeNode<>(7);
        TreeNode<Integer> root1 = new TreeNode<>(5,rl1,rr1);
        System.out.println(increasingOrderSearchTree.increasingBST_it(root1));
    }
}
