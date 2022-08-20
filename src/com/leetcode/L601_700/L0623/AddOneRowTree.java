package com.leetcode.L601_700.L0623;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 623. 在二叉树中增加一行
 * 给定一个二叉树的根 root 和两个整数 val 和 depth ，在给定的深度 depth 处添加一个值为 val 的节点行。
 * 注意，根节点 root 位于深度 1 。
 * <p>
 * 加法规则如下:
 * (1)给定整数 depth，对于深度为 depth - 1 的每个非空树节点 cur ，创建两个值为 val 的树节点作为 cur 的左子树根和右子树根。
 * (2)cur 原来的左子树应该是新的左子树根的左子树。
 * (3)cur 原来的右子树应该是新的右子树根的右子树。
 * (4)如果 depth == 1 意味着 depth - 1 根本没有深度，那么创建一个树节点，值 val 作为整个原始树的新根，而原始树就是新根的左子树。
 * <p>
 * 示例 1:
 * 输入: root = [4,2,6,3,1,5], val = 1, depth = 2
 * 输出: [4,1,1,2,null,null,6,3,1,5]
 * <p>
 * 示例 2:
 * 输入: root = [4,2,null,3,1], val = 1, depth = 3
 * 输出:  [4,2,null,1,1,3,null,null,1]
 * <p>
 * 提示:
 * 节点数在 [1, 104] 范围内
 * 树的深度在 [1, 104]范围内
 * -100 <= Node.val <= 100
 * -105 <= val <= 105
 * 1 <= depth <= the depth of tree + 1
 */
public class AddOneRowTree {
    /**
     * 方法：广度优先搜索
     *
     */
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        //空值情况
        if (root == null)
            return null;
        //深度是1
        if (depth == 1)
            return new TreeNode(val, root, null);

        //存放当前层节点
        Queue<TreeNode> queue = new LinkedList<>();
        //放入队列
        queue.add(root);

        //层数
        int speed = 1;
        //遍历
        while (!queue.isEmpty()) {
            //当前层节点个数
            int size = queue.size();
            //遍历
            for (int i = 0; i < size; i++) {
                //当前节点
                TreeNode cur = queue.poll();
                //目标层的上一层
                if (depth - 1 == speed) {
                    //创建新节点
                    TreeNode newLife = new TreeNode(val, cur.left, null);
                    TreeNode newRight = new TreeNode(val, null, cur.right);

                    //改变赋值
                    cur.left = newLife;
                    cur.right = newRight;
                } else {
                    //不是目标层，向下遍历
                    if (cur.left != null)
                        queue.add(cur.left);
                    if (cur.right != null)
                        queue.add(cur.right);
                }
            }
            //增加层数
            speed++;
        }

        return root;
    }
}
