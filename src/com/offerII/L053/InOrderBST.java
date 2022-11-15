package com.offerII.L053;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer II 053. 二叉搜索树中的中序后继
 * 给定一棵二叉搜索树和其中的一个节点 p ，找到该节点在树中的中序后继。如果节点没有中序后继，请返回 null 。
 * 节点 p 的后继是值比 p.val 大的节点中键值最小的节点，即按中序遍历的顺序节点 p 的下一个节点。
 *
 * 示例 1：
 * 输入：root = [2,1,3], p = 1
 * 输出：2
 * 解释：这里 1 的中序后继是 2。请注意 p 和返回值都应是 TreeNode 类型。
 *
 * 示例 2：
 * 输入：root = [5,3,6,2,4,null,null,1], p = 6
 * 输出：null
 * 解释：因为给出的节点没有中序后继，所以答案就返回 null 了。
 *
 * 提示：
 * 树中节点的数目在范围 [1, 104] 内。
 * -105 <= Node.val <= 105
 * 树中各节点的值均保证唯一。
 *
 * 注意：本题与主站 285 题相同： <a href="https://leetcode-cn.com/problems/inorder-successor-in-bst/">https://leetcode-cn.com/problems/inorder-successor-in-bst/</a>
 */
public class InOrderBST {
    /**
     * 方法：递归
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        //结果集
        List<TreeNode> list = new ArrayList<>();
        //中序遍历
        order(root,list);
        //遍历列表
        for (int i = 0; i < list.size(); i++) {
            TreeNode cur = list.get(i);
            //当前节点为目标节点，且有后继的情况
            if (cur == p && i+1 < list.size())
                return list.get(i+1);
        }
        return null;
    }

    /**
     * 中序遍历
     */
    private void order(TreeNode root, List<TreeNode> list) {
        if (root == null)
            return;
        order(root.left,list);
        list.add(root);
        order(root.right,list);
    }

    /**
     * 方法二：迭代
     */
    public TreeNode inorderSuccessor_iteration(TreeNode root, TreeNode p) {
        // ans : 记录当前比 p 节点大的节点
        TreeNode ans = null;
        // 在二叉搜索树中进行搜索
        while (root != null) {
            // 如果当前节点 > p，则更新当前比 p 节点大的节点 ans , 同时去左子树进行搜索
            if (root.val > p.val) {
                ans = root;
                root = root.left;
            } else {// 如果当前节点 < p , 则到右子树进行搜索
                root = root.right;
            }
        }
        // 当搜寻结束后，ans 保存的就是最近的比 p 节点大的节点。
        return ans;
    }
}
