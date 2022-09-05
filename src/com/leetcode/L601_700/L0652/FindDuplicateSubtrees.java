package com.leetcode.L601_700.L0652;

import com.util.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 652. 寻找重复的子树
 * 给定一棵二叉树 root，返回所有重复的子树。
 * 对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。
 * 如果两棵树具有相同的结构和相同的结点值，则它们是重复的。
 * <p>
 * 示例 1：
 * 输入：root = [1,2,3,4,null,2,4,null,null,4]
 * 输出：[[2,4],[4]]
 * <p>
 * 示例 2：
 * 输入：root = [2,1,1]
 * 输出：[[1]]
 * <p>
 * 示例 3：
 * 输入：root = [2,2,2,3,null,3,null]
 * 输出：[[2,3],[3]]
 * <p>
 * 提示：
 * 树中的结点数在[1,10^4]范围内。
 * -200 <= Node.val <= 200
 */
public class FindDuplicateSubtrees {
    // 记录每个子树出现的次数
    private final Map<String, Integer> mono = new HashMap<>();
    // 结果集
    private final List<TreeNode> res = new LinkedList<>();

    /**
     * 方法：递归
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        // 递归
        traverse(root);
        return res;
    }

    private String traverse(TreeNode root) {
        // 空值
        if (root == null) {
            return "#";
        }
        // 左子树
        String left = traverse(root.left);
        // 右子树
        String right = traverse(root.right);

        // 序列化
        String subTree = left + "," + right + "," + root.val;

        // 获得次数
        int freq = mono.getOrDefault(subTree, 0);

        // 只记录一次
        if (freq == 1) {
            res.add(root);
        }

        // 增加次数
        mono.put(subTree, freq + 1);

        return subTree;

    }
}
