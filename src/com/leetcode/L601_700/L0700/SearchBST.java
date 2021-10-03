package com.leetcode.L601_700.L0700;

import com.util.TreeNode;

/**
 * 700. 二叉搜索树中的搜索
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 *
 * 例如，
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 * 和值: 2
 * 你应该返回如下子树:
 *
 *       2
 *      / \
 *     1   3
 * 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
 */
public class SearchBST {
    /**
     * 方法一：递归
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode<Integer> root, int val) {
        //空值情况
        if (root == null)
            return null;
        //与当前节点值相等
        if (root.val == val) {
            return root;
        } else if (root.val > val) {
            //比当前节点值小，去左子树搜索
            return searchBST(root.left, val);
        } else  {
            //比当前节点值大，去右子树搜索
            return searchBST(root.right, val);
        }
    }

    /**
     * 方法二：迭代
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST_iteration(TreeNode<Integer> root, int val) {
        //节点不为空
        while (root != null){
            //与当前节点值相等
            if (root.val == val) {
                return root;
            } else if (root.val > val) {
                //比当前节点值小，去左子树搜索
                root = root.left;;
            } else  {
                //比当前节点值大，去右子树搜索
                root = root.right;
            }
        }
        return null;
    }
}
