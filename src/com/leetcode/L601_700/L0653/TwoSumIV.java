package com.leetcode.L601_700.L0653;


import com.util.TreeNode;

import java.util.*;

/**
 * 653. 两数之和 IV - 输入 BST
 * 给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 *
 * 示例 1：
 * 输入: root = [5,3,6,2,4,null,7], k = 9
 * 输出: true
 *
 * 示例 2：
 * 输入: root = [5,3,6,2,4,null,7], k = 28
 * 输出: false
 *
 * 示例 3：
 * 输入: root = [2,1,3], k = 4
 * 输出: true
 *
 * 示例 4：
 * 输入: root = [2,1,3], k = 1
 * 输出: false
 *
 * 示例 5：
 * 输入: root = [2,1,3], k = 3
 * 输出: true
 *
 * 提示:
 * 二叉树的节点个数的范围是  [1, 104].
 * -104 <= Node.val <= 104
 * root 为二叉搜索树
 * -105 <= k <= 105
 */
public class TwoSumIV {
    /**
     * 方法一：双指针
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
     */
    private void order(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        order(root.left, list);
        list.add(root.val);
        order(root.right, list);
    }

    /**
     * 方法二：set集合
     */
    public boolean findTarget_set(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //层序遍历
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            //判断是否存在值
            if (set.contains(k - cur.val))
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
