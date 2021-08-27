package com.leetcode.L0543;

import com.util.TreeNode;

/**
 * 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
 */
public class DiameterBinaryTree {
    /**
     * 方法：递归
     * @param root
     * @return
     */
    int res = 0;
    public int diameterOfBinaryTree(TreeNode<Integer> root) {
        depth(root);
        return res;
    }

    private int depth(TreeNode<Integer> root) {
        if (root == null)
            return 0;
        int L = depth(root.left);//左子树的深度
        int R = depth(root.right);//右子树的深度
        res = Math.max(res,L+R);
        return Math.max(L,R)+1;//树的最大深度
    }
}
