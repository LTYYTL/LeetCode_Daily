package com.leetcode.L601_700.L0617;

import com.util.TreeNode;

public class MergeTwoBinaryTreesTest {
    public static void main(String[] args) {
        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        /*
         示例 1:
         输入:
         Tree 1                     Tree 2
         1                         2
         / \                       / \
         3   2                     1   3
         /                           \   \
         5                             4   7
         输出:
         合并后的树:
         3
         / \
         4   5
         / \   \
         5   4   7
         注意: 合并必须从两个树的根节点开始。
         */

        TreeNode<Integer> t1ll = new TreeNode<>(5);
        TreeNode<Integer> t1l = new TreeNode<>(3, t1ll, null);
        TreeNode<Integer> t1r = new TreeNode<>(2);
        TreeNode<Integer> t1 = new TreeNode<>(1, t1l, t1r);

        TreeNode<Integer> t2lr = new TreeNode<>(4);
        TreeNode<Integer> t2rr = new TreeNode<>(7);
        TreeNode<Integer> t2l = new TreeNode<>(1, null, t2lr);
        TreeNode<Integer> t2r = new TreeNode<>(3, null, t2rr);
        TreeNode<Integer> t2  = new TreeNode<>(2,t2l,t2r);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println(mergeTwoBinaryTrees.mergeTrees(t1,t2));
    }
}
