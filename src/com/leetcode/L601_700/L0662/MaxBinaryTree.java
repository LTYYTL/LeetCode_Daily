package com.leetcode.L601_700.L0662;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 662. 二叉树最大宽度
 * 给你一棵二叉树的根节点 root ，返回树的 最大宽度 。
 * 树的 最大宽度 是所有层中最大的 宽度 。
 * 每一层的 宽度 被定义为该层最左和最右的非空节点（即，两个端点）之间的长度。
 * 将这个二叉树视作与满二叉树结构相同，两端点间会出现一些延伸到这一层的 null 节点，这些 null 节点也计入长度。
 * 题目数据保证答案将会在  32 位 带符号整数范围内。
 * <p>
 * 示例 1：
 * 输入：root = [1,3,2,5,3,null,9]
 * 输出：4
 * 解释：最大宽度出现在树的第 3 层，宽度为 4 (5,3,null,9) 。
 * <p>
 * 示例 2：
 * 输入：root = [1,3,2,5,null,null,9,6,null,7]
 * 输出：7
 * 解释：最大宽度出现在树的第 4 层，宽度为 7 (6,null,null,null,null,null,7) 。
 * <p>
 * 示例 3：
 * 输入：root = [1,3,2,5]
 * 输出：2
 * 解释：最大宽度出现在树的第 2 层，宽度为 2 (3,2) 。
 * <p>
 * 提示：
 * 树中节点的数目范围是 [1, 3000]
 * -100 <= Node.val <= 100
 */
public class MaxBinaryTree {
    /**
     * 方法：广度优先搜索
     */
    public int widthOfBinaryTree(TreeNode root) {
        // 空节点
        if (root == null)
            return 0;
        // 队列
        Queue<MyNode> queue = new LinkedList<>();
        // 放入节点
        queue.add(new MyNode(root, 1));

        // 结果
        int res = 0;
        // 遍历
        while (!queue.isEmpty()) {
            // 当前层节点个数
            int size = queue.size();
            // 最大索引
            int max = -1;
            // 最小索引
            int min = -1;
            // 遍历当前层
            for (int i = 0; i < size; i++) {
                // 当前节点
                MyNode cur = queue.poll();

                // 左子树存在
                if (cur.node.left != null) {
                    queue.add(new MyNode(cur.node.left, 2 * cur.index));
                }
                // 右子树存在
                if (cur.node.right != null) {
                    queue.add(new MyNode(cur.node.right, 2 * cur.index + 1));
                }

                // 记录当前层的最大和最小索引
                if (min == -1) {
                    min = cur.index;
                }
                max = cur.index;
            }
            // 记录最大宽度
            res = Math.max(res, max - min + 1);
        }

        return res;
    }

    class MyNode {
        private TreeNode node;
        private int index;

        public MyNode(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
}
