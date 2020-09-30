package com.leetcode.L0701;

import com.util.TreeNode;

/**
 * 701. 二叉搜索树中的插入操作
 * 给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据保证，新值和原始二叉搜索树中的任意节点值都不同。
 * 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回任意有效的结果。
 *
 * 例如,
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和 插入的值: 5
 * 你可以返回这个二叉搜索树:
 *          4
 *        /   \
 *       2     7
 *      / \   /
 *     1   3 5
 * 或者这个树也是有效的:
 *          5
 *        /   \
 *       2     7
 *      / \
 *     1   3
 *          \
 *           4
 *
 * 提示：
 * 给定的树上的节点数介于 0 和 10^4 之间
 * 每个节点都有一个唯一整数值，取值范围从 0 到 10^8
 * -10^8 <= val <= 10^8
 * 新值和原始二叉搜索树中的任意节点值都不同
 */
public class InsertBST {
    /**
     * 方法一：递归
     * @param root
     * @param val
     * @return
     */
    public TreeNode insertIntoBST(TreeNode<Integer> root, int val) {
        //如果root为空，就直接创建一个新的节点
        if (root == null)
            return new TreeNode(val);
        //如果root节点的值大于val，说明值为val的节点应该在root
        //节点的左子树上
        if (root.val > val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);
        return root;
    }

    /**
     * 方法二：迭代
     * @param root
     * @param val
     * @return
     */
    public TreeNode insertIntoBST_Iteration(TreeNode<Integer> root , int val){
        TreeNode node = new TreeNode(val);
        //边界条件判断
        if (root == null)
            return node;
        TreeNode<Integer> cur = root;
        while (true) {
            //如果当前节点cur的值大于val，说明val值应该插入到
            //当前节点cur的左子树，否则就插入到当前节点cur的右子树
            if (cur.val > val) {
                //如果左子节点为空，就直接插入
                if (cur.left == null) {
                    cur.left = node;
                    break;
                }
                //如果左子节点为空，就继续往下找
                cur = cur.left;
            } else {//同上
                //如果右子节点为空，就直接插入
                if (cur.right == null) {
                    cur.right = node;
                    break;
                }
                //如果右子节点为空，就继续往下找
                cur = cur.right;
            }
        }
        return root;
    }
}
