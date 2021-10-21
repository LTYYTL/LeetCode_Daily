package com.offerII.L054;

import com.util.TreeNode;

import java.util.Stack;

/**
 * 剑指 Offer II 054. 所有大于等于节点的值之和
 * 给定一个二叉搜索树，请将它的每个节点的值替换成树中大于或者等于该节点值的所有节点值之和。
 *
 * 提醒一下，二叉搜索树满足下列约束条件：
 * 节点的左子树仅包含键 小于 节点键的节点。
 * 节点的右子树仅包含键 大于 节点键的节点。
 * 左右子树也必须是二叉搜索树。
 *
 * 示例 1：
 * 输入：root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
 * 输出：[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
 *
 * 示例 2：
 * 输入：root = [0,null,1]
 * 输出：[1,null,1]
 *
 * 示例 3：
 * 输入：root = [1,0,2]
 * 输出：[3,3,2]
 *
 * 示例 4：
 * 输入：root = [3,2,4,1]
 * 输出：[7,9,4,10]
 *
 * 提示：
 * 树中的节点数介于 0 和 104 之间。
 * 每个节点的值介于 -104 和 104 之间。
 * 树中的所有值 互不相同 。
 * 给定的树为二叉搜索树。
 *
 * 注意：
 * 本题与主站 538 题相同： https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 * 本题与主站 1038 题相同：https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class ConvertBSTToGreaterTree {
    /**
     * 方法一：递归（反向中序遍历）
     * @param root
     * @return
     */
    int sum = 0;
    public TreeNode convertBST(TreeNode<Integer> root) {
        //节点不为空
        if (root != null){
            //访问当前的节点的右子树，右子树的值大
            convertBST(root.right);
            //当前节点的值=右孩子的值+当前节点的值
            sum += root.val;
            root.val = sum;
            //访问当前的节点的左子树，左子树的值小
            convertBST(root.left);
        }
        return root;
    }

    /**
     * 方法二：迭代（反向中序遍历）
     * @param root
     * @return
     */
    public TreeNode convertBST_iteration(TreeNode<Integer> root){
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
