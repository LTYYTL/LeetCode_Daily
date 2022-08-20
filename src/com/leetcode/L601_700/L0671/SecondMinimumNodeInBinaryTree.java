package com.leetcode.L601_700.L0671;

import com.util.TreeNode;

import java.util.TreeSet;

/**
 * 671. 二叉树中第二小的节点
 * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
 * 更正式地说，root.val = min(root.left.val, root.right.val) 总成立。
 * 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
 *
 * 示例 1：
 * 输入：root = [2,2,5,null,null,5,7]
 * 输出：5
 * 解释：最小的值是 2 ，第二小的值是 5 。
 *
 * 示例 2：
 * 输入：root = [2,2,2]
 * 输出：-1
 * 解释：最小的值是 2, 但是不存在第二小的值。
 *
 * 提示：
 * 树中节点数目在范围 [1, 25] 内
 * 1 <= Node.val <= 231 - 1
 * 对于树中每个节点 root.val == min(root.left.val, root.right.val)
 */
public class SecondMinimumNodeInBinaryTree {
    /**
     * 方法一：深度优先搜索
     */
    int ans = -1;
    public int findSecondMinimumValue(TreeNode<Integer> root) {
        dfs(root, root.val);
        return ans;
    }
    void dfs(TreeNode<Integer> root, int cur) {
        if (root == null) return ;
        if (root.val != cur) {
            if (ans == -1) ans = root.val;
            else ans = Math.min(ans, root.val);
            return ;
        }
        dfs(root.left, cur);
        dfs(root.right, cur);
    }

    /**
     * 方法二：set集合
     */
    //存储所有节点的值
    TreeSet<Integer> set = new TreeSet<>();
    public int findSecondMinimumValue_set(TreeNode<Integer> root) {
        //获取所有值
        dfs(root);
        //set中只有一种值时，返回-1
        if (set.size() < 2)
            return -1;
        //返回第二小的值
        return set.higher(root.val);
    }

    private void dfs(TreeNode<Integer> root){
        if (root != null){
            dfs(root.left);
            set.add(root.val);
            dfs(root.right);
        }
    }

}
