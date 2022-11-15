package com.leetcode.L601_700.L0687;

import com.util.TreeNode;

/**
 * 687. 最长同值路径
 * 给定一个二叉树的 root ，返回 最长的路径的长度 ，这个路径中的 每个节点具有相同值 。 这条路径可以经过也可以不经过根节点。
 * 两个节点之间的路径长度 由它们之间的边数表示。
 * <p>
 * 示例 1:
 * 输入：root = [5,4,5,1,1,5]
 * 输出：2
 * <p>
 * 示例 2:
 * 输入：root = [1,4,5,4,4,5]
 * 输出：2
 * <p>
 * 提示:
 * 树的节点数的范围是 [0, 104]
 * -1000 <= Node.val <= 1000
 * 树的深度将不超过 1000
 */
public class LongestUnivaluePath {
    /**
     * 方法：后序遍历
     */
    //结果集
    private int res = 0;

    public int longestUnivaluePath(TreeNode root) {
        //空值
        if (root == null)
            return 0;
        //后序遍历
        maxLen(root, root.val);
        return res;
    }

    /**
     * 后序遍历
     */
    private int maxLen(TreeNode root, int parVal) {
        //空值
        if (root == null)
            return 0;

        //左子树长度
        int left = maxLen(root.left, root.val);
        //右子树长度
        int right = maxLen(root.right, root.val);

        //记录最大值
        res = Math.max(res, left + right);
        //不相等
        if (root.val != parVal)
            return 0;
        //获取最大长度
        return Math.max(left, right) + 1;
    }
}
