package com.offerII.L046;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer II 046. 二叉树的右侧视图
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 *
 * 示例 1:
 * 输入: [1,2,3,null,5,null,4]
 * 输出: [1,3,4]
 *
 * 示例 2:
 * 输入: [1,null,3]
 * 输出: [1,3]
 *
 * 示例 3:
 * 输入: []
 * 输出: []
 *
 * 提示:
 * 二叉树的节点个数的范围是 [0,100]
 * -100 <= Node.val <= 100
 */
public class BinaryTreeRightSideView {
    /**
     * 方法：广度优先搜索
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        //空值情况
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //遍历
        while (!queue.isEmpty()){
            //当前层的节点
            int size = queue.size();
            for (int i = size - 1; i >= 0; i--) {
                TreeNode<Integer> cur = queue.poll();
                if (cur.left != null)
                    queue.add(cur.left);
                if (cur.right != null)
                    queue.add(cur.right);
                //当前层的最后一个
                if (i == 0)
                    res.add(cur.val);
            }
        }

        return res;
    }
}
