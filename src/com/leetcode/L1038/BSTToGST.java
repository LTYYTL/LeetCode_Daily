package com.leetcode.L1038;

import com.util.TreeNode;

import java.util.Stack;

/**
 * 1038. 从二叉搜索树到更大和树
 * 给出二叉 搜索 树的根节点，该二叉树的节点值各不相同，修改二叉树，使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 * 提醒一下，二叉搜索树满足下列约束条件：
 * 节点的左子树仅包含键 小于 节点键的节点。
 * 节点的右子树仅包含键 大于 节点键的节点。
 * 左右子树也必须是二叉搜索树。
 *
 * 示例：
 *                4
 *             /    \
 *           1      6
 *         /   \  /   \
 *        0    2 5    7
 *              \      \
 *              3       8
 * 输入：[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
 * 输出：[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
 *
 * 提示：
 * 树中的节点数介于 1 和 100 之间。
 * 每个节点的值介于 0 和 100 之间。
 * 给定的树为二叉搜索树。
 *
 * 注意：该题目与 538: https://leetcode-cn.com/problems/convert-bst-to-greater-tree/  相同
 */
public class BSTToGST {
    /**
     * 方法一：递归（反向中序遍历）
     * @param root
     * @return
     */
    int sum = 0;
    public TreeNode bstToGst(TreeNode<Integer> root) {
        //节点不为空
        if (root != null){
            //访问当前的节点的右子树，右子树的值大
            bstToGst(root.right);
            //当前节点的值=右孩子的值+当前节点的值
            sum += root.val;
            root.val = sum;
            //访问当前的节点的左子树，左子树的值小
            bstToGst(root.left);
        }
        return root;
    }


    /**
     * 方法二：迭代（反向中序遍历）
     * @param root
     * @return
     */
    public TreeNode bstToGst_Iteration(TreeNode<Integer> root){
        //用于中序遍历的栈
        Stack<TreeNode> stack = new Stack<>();
        TreeNode res = root;
        int pre = 0;

        while (!stack.isEmpty() || root!=null){
            //将右节点全部加入栈中
            while (root != null){
                stack.push(root);
                root = root.right;
            }
            //当前节点的值=右孩子的值+当前节点的值
            root = stack.pop();
            pre += root.val;
            root.val = pre;
            root = root.left;
        }
        return res;
    }
}
