package com.offer.L0370;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 37. 序列化二叉树
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 * 你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，
 * 你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * 提示：输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 *
 * 示例：
 * 输入：root = [1,2,3,null,null,4,5]
 * 输出：[1,2,3,null,null,4,5]
 *
 * 注意：本题与主站 297 题相同：<a href="https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/">https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/</a>
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode<Integer> root) {
        //空值情况
        if (root == null)
            return "[]";
        //结果集
        StringBuilder res = new StringBuilder("[");

        //所需队列，将根节点存入
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //队列为空，退出循环
        while (!queue.isEmpty()){
            //队头的节点
            TreeNode cur = queue.poll();
            //当前节点不为空，将左右节点放入队列
            //当前节点为空，直接存入null
            if (cur != null){
                res.append(cur.val).append(",");
                queue.add(cur.left);
                queue.add(cur.right);
            }else{
                res.append("null,");
            }
        }
        //除去最后一个"，"
        res.deleteCharAt(res.length()-1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //空值情况
        if (data.equals("[]"))
            return null;
        //去除“[”，“]”并将字符串按照“，”分割
        String[] vals = data.substring(1, data.length() - 1).split(",");
        //新建根节点
        TreeNode<Integer> root = new TreeNode<>(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //控制指针
        int i = 1;
        while (!queue.isEmpty()){
            //队头的节点
            TreeNode cur = queue.poll();
            //当前指针指向的不为null,可将其放到左节点，并加入队列
            if (!vals[i].equals("null")){
                cur.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(cur.left);
            }
            //移动指针
            i++;

            //当前指针指向的不为null,可将其放到左节点，并加入队列
            if (!vals[i].equals("null")){
                cur.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(cur.right);
            }
            //移动指针
            i++;
        }
        return root;
    }
}
