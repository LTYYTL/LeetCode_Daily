package com.leetcode.L601_700.L0617;

import com.util.TreeNode;

/**
 * 617. 合并二叉树
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 * 示例 1:
 * 输入:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * 输出:
 * 合并后的树:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 * 注意: 合并必须从两个树的根节点开始。
 */
public class MergeTwoBinaryTrees {
    /**
     * 方法：递归
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //如果两个节点都为空，直接返回空就行了
        if (t1 == null && t2 == null)
            return null;
        //如果t1节点为空，就返回t2节点
        if (t1 == null)
            return t2;
        //如果t2节点为空，就返回t1节点
        if (t2 == null)
            return t1;
        //走到这一步，说明两个节点都不为空，然后需要把这两个节点
        //合并成一个新的节点
        TreeNode newNode = new TreeNode(t1.val + t2.val);
        //当前节点t1和t2合并完之后，还要继续合并t1和t2的子节点
        newNode.left = mergeTrees(t1.left, t2.left);
        newNode.right = mergeTrees(t1.right, t2.right);
        return newNode;
    }
}
