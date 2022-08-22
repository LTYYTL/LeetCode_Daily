package com.leetcode.L601_700.L0655;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 655. 输出二叉树
 * 给你一棵二叉树的根节点 root ，请你构造一个下标从 0 开始、大小为 m x n 的字符串矩阵 res ，用以表示树的 格式化布局 。构造此格式化布局矩阵需要遵循以下规则：
 * (1)树的 高度 为 height ，矩阵的行数 m 应该等于 height + 1 。
 * (2)矩阵的列数 n 应该等于 2height+1 - 1 。
 * (3)根节点 需要放置在 顶行 的 正中间 ，对应位置为 res[0][(n-1)/2] 。
 * (4)对于放置在矩阵中的每个节点，设对应位置为 res[r][c] ，将其左子节点放置在 res[r+1][c-2height-r-1] ，右子节点放置在 res[r+1][c+2height-r-1] 。
 * (5)继续这一过程，直到树中的所有节点都妥善放置。
 * (6)任意空单元格都应该包含空字符串 "" 。
 * 返回构造得到的矩阵 res 。
 * <p>
 * 示例 1：
 * 输入：root = [1,2]
 * 输出：
 * [["","1",""],
 * ["2","",""]]
 * <p>
 * 示例 2：
 * 输入：root = [1,2,3,null,4]
 * 输出：
 * [["","","","1","","",""],
 * ["","2","","","","3",""],
 * ["","","4","","","",""]]
 * <p>
 * 提示：
 * 树中节点数在范围 [1, 210] 内
 * -99 <= Node.val <= 99
 * 树的深度在范围 [1, 10] 内
 */
public class PrintBinaryTree {
    /**
     * 方法：深度优先搜索
     */
    public List<List<String>> printTree(TreeNode root) {
        // 获取深度
        int height = getHeight(root) - 1;
        // 结果集的大小
        int m = height + 1;
        int n = (1 << (height + 1)) - 1;
        // 结果
        List<List<String>> res = new ArrayList<>();
        // 初始化
        for (int i = 0; i < m; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add("");
            }
            res.add(row);
        }
        // 深度优先搜索
        dfs(res, root, 0, (n - 1) / 2, height);
        return res;
    }

    private void dfs(List<List<String>> res, TreeNode root, int r, int c, int height) {
        // 赋值
        res.get(r).set(c, "" + root.val);
        // 左子树
        if (root.left != null) {
            dfs(res, root.left, r + 1, c - (1 << (height - r - 1)), height);
        }
        // 右子树
        if (root.right != null) {
            dfs(res, root.right, r + 1, c + (1 << (height - r - 1)), height);
        }

    }

    /**
     * 计算深度
     */
    private int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left, right) + 1;
    }
}
