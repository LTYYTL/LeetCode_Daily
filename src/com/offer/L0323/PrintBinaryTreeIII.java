package com.offer.L0323;

import com.util.TreeNode;

import java.util.*;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 * 提示：
 * 节点总数 <= 1000
 */
public class PrintBinaryTreeIII {
    /**
     * 方法：广度优先搜索
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        //空值判断
        if(root == null) return res;
        //加入根节点
        queue.offer(root);
        //层数
        int level = 1;
        //遍历队列
        while (!queue.isEmpty()){
            //层次节点个数
            int size = queue.size();
            //此层的list
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                //队头节点
                TreeNode cur = queue.poll();
                list.add(cur.val);
                //左孩子不为空，加入队列
                if (cur.left != null)
                    queue.offer(cur.left);
                //右孩子不为空，加入队列
                if (cur.right != null)
                    queue.offer(cur.right);
            }
            //偶数层反转
            if(level % 2 == 0){
                Collections.reverse(list);
            }
            res.add(list);
            //增加层数
            level++;
        }
        return res;
    }
}
