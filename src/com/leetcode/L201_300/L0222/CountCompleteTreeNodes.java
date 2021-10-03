package com.leetcode.L201_300.L0222;

import com.util.TreeNode;

/**
 * 222. 完全二叉树的节点个数
 * 给出一个完全二叉树，求出该树的节点个数。
 * 说明：
 * 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。
 *
 * 示例:
 * 输入:
 *     1
 *    / \
 *   2   3
 *  / \  /
 * 4  5 6
 * 输出: 6
 */
public class CountCompleteTreeNodes {
    /**
     * 方法一：递归
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        //空值情况
        if (root == null)
            return 0;
        //一个节点一个节点累加计算
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    /**
     * 方法：利用完全二叉树性质
     * @param root
     * @return
     */
    public int countNodes_CT(TreeNode root){
        if (root == null)
            return 0;
        //左子树高度
        int left = countLevel(root.left);
        //右子树高度
        int right = countLevel(root.right);
        //（1）left == right。
        // 这说明，左子树一定是满二叉树，因为节点已经填充到右子树了，左子树必定已经填满了。
        // 所以左子树的节点总数我们可以直接得到，是 2^left - 1，加上当前这个 root 节点，
        // 则正好是 2^left。再对右子树进行递归统计。
        //（2）left != right。说明此时最后一层不满，但倒数第二层已经满了，可以直接得到右子树的节点个数。
        // 同理，右子树节点 +root 节点，总数为 2^right。再对左子树进行递归查找。
        if (left == right){
            return countNodes_CT(root.right) + (1 << left);
        }else {
            return countNodes_CT(root.left) + (1 << right);
        }
    }

    /**
     * 计算高度
     * @param root
     * @return
     */
    private int countLevel(TreeNode root) {
        int level = 0;
        while (root != null){
            level++;
            root = root.left;
        }

        return level;
    }
}
