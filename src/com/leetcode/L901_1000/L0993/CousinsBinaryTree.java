package com.leetcode.L901_1000.L0993;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 993. 二叉树的堂兄弟节点
 * 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 * 如果二叉树的两个节点深度相同，但 父节点不同 ，则它们是一对堂兄弟节点。
 * 我们给出了具有唯一值的二叉树的根节点 root ，以及树中两个不同节点的值 x 和 y 。
 * 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true 。否则，返回 false。
 *
 * 示例 1：
 * 输入：root = [1,2,3,4], x = 4, y = 3
 * 输出：false
 *
 * 示例 2：
 * 输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
 * 输出：true
 *
 * 示例 3：
 * 输入：root = [1,2,3,null,4], x = 2, y = 3
 * 输出：false
 *
 * 提示：
 * 二叉树的节点数介于 2 到 100 之间。
 * 每个节点的值都是唯一的、范围为 1 到 100 的整数。
 */
public class CousinsBinaryTree {
    /**
     * 方法一：广度优先搜索
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        //这两个值任意一个都不会出现在根节点中
        if (root == null || root.val == x || root.val == y)
            return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //x的父节点
        TreeNode xFather = null;
        //y的父节点
        TreeNode yFather = null;
        //x的节点
        TreeNode xNode = null;
        //y的节点
        TreeNode yNode = null;

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                TreeNode cur = queue.poll();
                //查看左节点
                if (cur.left != null) {
                    queue.add(cur.left);
                    if (cur.left.val.equals(x)){
                        xNode = cur.left;
                        xFather = cur;
                    }
                    if (cur.left.val.equals(y)){
                        yNode = cur.left;
                        yFather = cur;
                    }
                }

                //查看右节点
                if (cur.right != null) {
                    queue.add(cur.right);
                    if (cur.right.val.equals(x)){
                        xNode = cur.right;
                        xFather = cur;
                    }
                    if (cur.right.val.equals(y)){
                        yNode = cur.right;
                        yFather = cur;
                    }
                }

                //两个节点都没找到，什么也不做
                if(xNode==null&&yNode==null){}
                //两个节点都找到了，那么判断它们是不是堂兄弟节点
                else if(xNode!=null&&yNode!=null){
                    //如果父亲结点不相等，说明是堂兄弟结点
                    return xFather!=yFather;
                }
                //这层遍历完了，但是有一个节点找到了，另外一个没找到
                else if(size==0)
                    return false;
            }
        }
        return false;
    }

    /**
     * 方法二：深度优先搜索
     */
    public boolean isCousins_dfs(TreeNode root, int x, int y) {
        int[] xi = dfs(root, null, 0, x);
        int[] yi = dfs(root, null, 0, y);
        return xi[1] == yi[1] && xi[0] != yi[0];
    }

    private int[] dfs(TreeNode root, TreeNode father, int depth, int t) {
        if (root == null) return new int[]{-1, -1}; // 使用 -1 代表为搜索不到 t
        if (root.val == t) {
            return new int[]{father != null ? father.val : 1, depth}; // 使用 1 代表搜索值 t 为 root
        }
        int[] l = dfs(root.left, root, depth + 1, t);
        if (l[0] != -1) return l;
        return dfs(root.right, root, depth + 1, t);
    }


}
