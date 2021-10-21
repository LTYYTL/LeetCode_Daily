package com.offerII.L056;

import com.util.TreeNode;

import java.util.*;

/**
 * 剑指 Offer II 056. 二叉搜索树中两个节点之和
 * 给定一个二叉搜索树的 根节点 root 和一个整数 k , 请判断该二叉搜索树中是否存在两个节点它们的值之和等于 k 。假设二叉搜索树中节点的值均唯一。
 *
 * 示例 1：
 * 输入: root = [8,6,10,5,7,9,11], k = 12
 * 输出: true
 * 解释: 节点 5 和节点 7 之和等于 12
 *
 * 示例 2：
 * 输入: root = [8,6,10,5,7,9,11], k = 22
 * 输出: false
 * 解释: 不存在两个节点值之和为 22 的节点
 *
 * 提示：
 * 二叉树的节点个数的范围是  [1, 104].
 * -104 <= Node.val <= 104
 * root 为二叉搜索树
 * -105 <= k <= 105
 *
 * 注意：本题与主站 653 题相同： https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/
 */
public class TwoSumIV {
    /**
     * 方法一：双指针
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        //中序遍历集合
        order(root,list);
        //双指针，寻找目标值
        int left = 0;
        int right = list.size() - 1;
        while (left < right){
            int sum = list.get(left) + list.get(right);
            if (sum == k)
                return true;
            else if (sum > k)
                right--;
            else
                left++;
        }

        return false;
    }

    /**
     * 中序遍历
     * @param root
     * @param list
     */
    private void order(TreeNode<Integer> root, List<Integer> list) {
        if (root == null)
            return;
        order(root.left,list);
        list.add(root.val);
        order(root.right, list);
    }

    /**
     * 方法二：set集合
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget_set(TreeNode<Integer> root, int k) {
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //层序遍历
        while (!queue.isEmpty()){
            TreeNode<Integer> cur = queue.poll();
            //判断是否存在值
            if (set.contains(k-cur.val))
                return true;
            set.add(cur.val);
            if (cur.left != null)
                queue.add(cur.left);
            if (cur.right != null)
                queue.add(cur.right);
        }
        return false;
    }
}
