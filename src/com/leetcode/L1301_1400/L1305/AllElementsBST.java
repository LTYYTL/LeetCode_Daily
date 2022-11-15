package com.leetcode.L1301_1400.L1305;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1305. 两棵二叉搜索树中的所有元素
 * 给你 root1 和 root2 这两棵二叉搜索树。请你返回一个列表，其中包含 两棵树 中的所有整数并按 升序 排序。.
 * <p>
 * 示例 1：
 * 输入：root1 = [2,1,4], root2 = [1,0,3]
 * 输出：[0,1,1,2,3,4]
 * <p>
 * 示例 2：
 * 输入：root1 = [1,null,8], root2 = [8,1]
 * 输出：[1,1,8,8]
 * <p>
 * 提示：
 * 每棵树的节点数在 [0, 5000] 范围内
 * -105 <= Node.val <= 105
 */
public class AllElementsBST {
    /**
     * 方法：递归
     */
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();

        //中序遍历
        order(root1, res);
        order(root2, res);
        //排序
        Collections.sort(res);

        return res;
    }

    /**
     * 中序遍历
     */
    private void order(TreeNode root, List<Integer> res) {
        if (root == null)
            return;
        order(root.left, res);
        res.add(root.val);
        order(root.right, res);
    }


}
