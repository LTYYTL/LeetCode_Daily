package com.interview.L0403;

import com.util.ListNode;
import com.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 面试题 04.03. 特定深度节点链表
 * 给定一棵二叉树，设计一个算法，创建含有某一深度上所有节点的链表（比如，若一棵树的深度为 D，则会创建出 D 个链表）。返回一个包含所有深度的链表的数组。
 *
 * 示例：
 * 输入：[1,2,3,4,5,null,7,8]
 *
 *         1
 *        /  \
 *       2    3
 *      / \    \
 *     4   5    7
 *    /
 *   8
 *
 * 输出：[[1],[2,3],[4,5,7],[8]]
 */
public class ListDepth {
    /**
     * 方法：广度优先搜索
     * @param tree
     * @return
     */
    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> res = new ArrayList<>();
        //空值情况
        if (tree == null)
            return new ListNode[0];
        //队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);

        //遍历
        while (!queue.isEmpty()){
            //当前层节点个数
            int size = queue.size();
            //层链表
            ListNode dummyHead = new ListNode(0);
            ListNode p = dummyHead;
            //遍历
            for (int i = 0; i < size; i++) {
                //当前节点
                TreeNode<Integer> cur = queue.poll();
                //左孩子不为空，放入队中
                if (cur.left != null)
                    queue.add(cur.left);
                //右子树不为空，放入队中
                if (cur.right != null)
                    queue.add(cur.right);
                //当前节点放入层链表中
                p.next = new ListNode(cur.val);
                p = p.next;
            }
            //所有都遍历完放入结果中
            res.add(dummyHead.next);
        }

        //转换成链表数组
        return res.toArray(new ListNode[res.size()]);
    }
}

