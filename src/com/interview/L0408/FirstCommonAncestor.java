package com.interview.L0408;

import com.util.TreeNode;

/**
 * 面试题 04.08. 首个共同祖先
 * 设计并实现一个算法，找出二叉树中某两个节点的第一个共同祖先。不得将其他的节点存储在另外的数据结构中。注意：这不一定是二叉搜索树。
 *
 * 例如，给定如下二叉树: root = [3,5,1,6,2,0,8,null,null,7,4]
 *     3
 *    / \
 *   5   1
 *  / \ / \
 * 6  2 0  8
 *   / \
 *  7   4
 *
 * 示例 1:
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 *
 * 示例 2:
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * 输出: 5
 * 解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
 *
 * 说明:
 * 所有节点的值都是唯一的。
 * p、q 为不同节点且均存在于给定的二叉树中。
 */
public class FirstCommonAncestor {
    /**
     * 方法：深度优先搜索
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 到底了还没找到，返回 null
        if (root == null) {
            return null;
        }
        // 如果找到了 p 或 q，返回它
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);  // left 记录 p 或 q 是在左子树找到的
        TreeNode right = lowestCommonAncestor(root.right, p, q); // right 记录 p 或 q 是在右子树找到的
        // 如果 left 和 right 都记录了找到的节点，那么肯定是一个记录了 p ，另一个记录了 q
        // 它们分别在以 root 为根的左右子树中，所以 root 就是它们的最近公共祖先
        if (left != null && right != null) {
            return root;
        }
        // 由于节点 p,q 一定在二叉树中，left和right不会同时为null
        // 若 left != null && right == null，说明在左子树中找到 p 或 q，而在右子树找不到 p 或 q，则剩下一个也在左子树
        // 所以 left 就是最近公共祖先
        // 另一种情况同理
        return (left != null) ? left : right;
    }
}
