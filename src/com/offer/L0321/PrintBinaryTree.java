package com.offer.L0321;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 *
 * [3,9,20,15,7]
 *
 *
 * 提示：
 *
 * 节点总数 <= 1000
 */
public class PrintBinaryTree {
    /**
     * 方法：广度优先搜索
     * @param root
     * @return
     */
    public int[] levelOrder(TreeNode root) {
        //空值判断
        if(root == null) return new int[0];
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        //加入根节点
        queue.offer(root);
        //遍历队列
        while (!queue.isEmpty()){
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
        //放入数组中
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
