package com.offer.L0322;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 提示：
 * 节点总数 <= 1000
 * 注意：本题与主站 102 题相同：https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class PrintBinaryTreeII {
    /**
     * 方法：广度优先搜索
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        //空值判断
        if(root == null) return res;
        //加入根节点
        queue.offer(root);
        //遍历队列
        while (!queue.isEmpty()){
            //层次节点个数
            int size = queue.size();
            //此层的list
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                //队头节点
                TreeNode<Integer> cur = queue.poll();
                list.add(cur.val);
                //左孩子不为空，加入队列
                if (cur.left != null)
                    queue.offer(cur.left);
                //右孩子不为空，加入队列
                if (cur.right != null)
                    queue.offer(cur.right);
            }
            res.add(list);
        }
        return res;
    }
}
