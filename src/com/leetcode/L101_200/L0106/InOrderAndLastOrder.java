package com.leetcode.L101_200.L0106;

import com.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 * 中序遍历 inorder = [9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class InOrderAndLastOrder {
    Map<Integer,Integer> map = new HashMap<>();
    /**
     * 方法：递归
     * @param inorder   中序遍历
     * @param postorder 后序遍历
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        //利用HashMap方便查找节点位置（索引）
        //利用中序来区分左右子数
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(inorder,postorder,0,inorder.length - 1,0,postorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int inorderLeft, int inorderRight, int postorderLeft, int postorderRight) {
        //数组无效
        if (inorderLeft > inorderRight)
            return null;
        //后序遍历的最后一个值，为根节点
        TreeNode root = new TreeNode(postorder[postorderRight]);
        int postRootVal = postorder[postorderRight];
        //寻找根节点在中序遍历的位置
        int inorderMin = map.get(postRootVal);
        //左子树的节点数量
        int inLeftNum = inorderMin - inorderLeft;
         /*
            （1）中序左子树的范围说明:
                从中序第一个节点开始，到后序遍历的最后一个节点在中序遍历位置的前一个节点结束 inorderLeft,inorderMin-1
            （2）中序右子树的范围说明:
                从后序遍历的最后一个节点在中序遍历位置的后一个节点开始，到中序的最后一个位置结束 inorderMin+1,inorderRight
            （3）后序左子树的范围说明:
                从后序的第一个的节点开始，到第一个节点+左子树的个数-1结束 postorderLeft,postorderLeft+inLeftNum-1
            （4）后序右子树的范围说明:
                从后序的第一个节点+左子树的个数开始，到到后序的最后一个位置-1结束 postorderLeft+inLeftNum,postorderRight-1

            中序左子树的范围[inorderLeft,inorderMin-1] 后序左子树的范围[postorderLeft,postorderLeft+inLeftNum-1]
            中序右子树的范围[inorderMin+1,inorderRight] 后序右子树的范围[postorderLeft+inLeftNum,postR-1]
        */
        root.left = helper(inorder, postorder, inorderLeft, inorderMin - 1, postorderLeft, postorderLeft + inLeftNum - 1);
        root.right = helper(inorder, postorder, inorderMin+1, inorderRight, postorderLeft+inLeftNum, postorderRight-1);
        return root;
    }
}
