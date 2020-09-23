package com.leetcode.L0450;

import com.util.TreeNode;

/**
 * 450. 删除二叉搜索树中的节点
 * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。
 * 返回二叉搜索树（有可能被更新）的根节点的引用。
 *
 * 一般来说，删除节点可分为两个步骤：
 * 首先找到需要删除的节点；
 * 如果找到了，删除它。
 * 说明： 要求算法时间复杂度为 O(h)，h 为树的高度。
 *
 * 示例:
 * root = [5,3,6,2,4,null,7]
 * key = 3
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 * 给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
 * 一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
 *     5
 *    / \
 *   4   6
 *  /     \
 * 2       7
 *
 * 另一个正确答案是 [5,2,6,null,4,null,7]。
 *     5
 *    / \
 *   2   6
 *    \   \
 *     4   7
 */
public class DeleteNodeTToBST {
    /**
     * 方法：递归
     *
     * 1、如果root.val < key，那么继续从它的右子树中寻找并删除；
     * 2、如果root.val > key，那么继续从它的左子树中寻找并删除；
     * 3、如果root.val == key，为表述方便，记要删除的节点为keyNode，分三种情况
     * （1）若keyNode为叶子节点，那么删除后返回null给其父节点继承；
     * （2）若keyNode只有左子树，那么删除后返回key.left给其父节点继承；
     * （3）若keyNode只有右子树，那么删除后返回key.right给其父节点继承；
     * （4）若keyNode左右子树都有，可以寻找在中序遍历过程中，keyNode的前驱或者后继，然后用前驱或者后继的值代替其节点值，在将其前驱或者后继删除；
     * 4、如果最终root为null，说明找不到要删除的节点，应该返回原本的BST.
     *
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode<Integer> root, int key) {
        //空值情况
        if (root == null)
            return null;
        //当前节点值比删除的值大，向左子树找
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }
        //当前节点值比删除的值小，向右子树找
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }
        //到这里意味着已经查找到目标元素
        //右子树为空，返回当前节点的左子树
        if(root.right == null)
            return root.left;
        //左子树为空，返回当前节点的右子树
        if(root.left == null)
            return root.right;
        //寻找当前节点中序遍历的后继节点，即其右子树最左点
        TreeNode<Integer> mintree = root.right;
        while (mintree.left != null)
            mintree = mintree.left;
        //用后继节点值替代当前节点的值
        root.val = mintree.val;
        //删除后继节点，即本次删除结束
        root.right = deleteNode(root.right, root.val);
        return root;
    }


}
