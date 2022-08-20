package com.leetcode.L1301_1400.L1382;

import com.util.TreeNode;

public class BalanceBinarySearchTreeTest {
    public static void main(String[] args) {
        BalanceBinarySearchTree balanceBinarySearchTree = new BalanceBinarySearchTree();
        /*
          示例：
          输入：root = [1,null,2,null,3,null,4,null,null]
          输出：[2,1,3,null,null,null,4]
          解释：这不是唯一的正确答案，[3,1,4,null,2,null,null] 也是一个可行的构造方案。
         */
        TreeNode rrr = new TreeNode(3, null, new TreeNode(4));
        TreeNode<Integer> rr = new TreeNode<>(2, null, rrr);
        TreeNode root = new TreeNode(1, null, rr);
        System.out.println(balanceBinarySearchTree.balanceBST(root));
    }
}
