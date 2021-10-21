package com.offerII.L051;

import com.util.TreeNode;

/**
 * 剑指 Offer II 051. 节点之和最大的路径
 * 路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。
 * 同一个节点在一条路径序列中 至多出现一次 。该路径 至少包含一个 节点，且不一定经过根节点。
 * 路径和 是路径中各节点值的总和。
 * 给你一个二叉树的根节点 root ，返回其 最大路径和 。
 *
 * 示例 1：
 * 输入：root = [1,2,3]
 * 输出：6
 * 解释：最优路径是 2 -> 1 -> 3 ，路径和为 2 + 1 + 3 = 6
 *
 * 示例 2：
 * 输入：root = [-10,9,20,null,null,15,7]
 * 输出：42
 * 解释：最优路径是 15 -> 20 -> 7 ，路径和为 15 + 20 + 7 = 42
 *
 * 提示：
 *
 * 树中节点数目范围是 [1, 3 * 104]
 * -1000 <= Node.val <= 1000
 */
public class BinaryTreeMaximumPathSum {
    int pathSum = Integer.MIN_VALUE;

    /**
     * 方法：递归
     * @param root
     * @return
     */
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return pathSum;
    }

    /**
     *  dfs 返回以该节点为端点的最大路径和
     * @param root
     * @return
     */
    private int dfs(TreeNode<Integer> root) {
        if (root == null)
            return 0;
        //左子树最大路径和
        int leftSum = dfs(root.left);
        //右子树最大路径和
        int rightSum = dfs(root.right);
        // 当前节点有四个选择：
        // 1）独立成线，直接返回自己的值
        // 2）跟左子节点合成一条路径
        // 3）跟右子节点合成一条路径
        int ret = Math.max(root.val,root.val + Math.max(leftSum,rightSum));
        // 4）以自己为桥梁，跟左、右子节点合并成一条路径
        pathSum = Math.max(pathSum,Math.max(ret,root.val + leftSum + rightSum));
        return ret;
    }
}
