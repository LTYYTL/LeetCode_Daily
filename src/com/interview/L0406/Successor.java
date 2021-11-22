package com.interview.L0406;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 04.06. 后继者
 * 设计一个算法，找出二叉搜索树中指定节点的“下一个”节点（也即中序后继）。
 *
 * 如果指定节点没有对应的“下一个”节点，则返回null。
 *
 * 示例 1:
 * 输入: root = [2,1,3], p = 1
 *   2
 *  / \
 * 1   3
 *
 * 输出: 2
 *
 * 示例 2:
 * 输入: root = [5,3,6,2,4,null,null,1], p = 6
 *       5
 *      / \
 *     3   6
 *    / \
 *   2   4
 *  /
 * 1
 * 输出: null
 */
public class Successor {
    /**
     * 方法：中序遍历
     * @param root
     * @param p
     * @return
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        List<TreeNode> list = new ArrayList<>();
        //中序遍历
        order(root,list);
        //遍历
        for (int i = 1; i < list.size(); i++) {
            //前一个节点
            TreeNode pre = list.get(i-1);
            //相等
            if (pre == p)
                return list.get(i);
        }

        return null;
    }

    /**
     * 中序遍历
     * @param root
     * @param list
     */
    private void order(TreeNode root, List<TreeNode> list) {
        if (root != null){
            order(root.left,list);
            list.add(root);
            order(root.right,list);
        }
    }


}
