package com.leetcode.L0105;

import com.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class PerOrderAndInOrder {
    Map<Integer,Integer> map = new HashMap<>();

    /**
     * 方法：递归
     * @param preorder 前序遍历
     * @param inorder  中序遍历
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //利用HashMapMap，以便查找节点的位置
        //利用中序遍历将树分成左右子树
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,preorder.length - 1,0,inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft >  preRight)
            return null;
        //前序遍历的第一个节点是根节点
        TreeNode root = new TreeNode(preorder[preLeft]);
        int preRootVal = preorder[preLeft];
        //根节点在中序遍历的位置
        int inMid = map.get(preRootVal);
        //左子树的节点个数
        int inLeftNum = inMid - inLeft;
        /*
                (1)前序左子树的范围说明:
                    从前序的第一个节点是根节点所以我们从第二个开始，到第一个节点+中序确定的左子树个数结束 preLeft+1 , preLeft+inLeftNum
                (2)前序右子树的范围说明:
                    从前序的第一个节点+中序确定的左子树节点个数+1开始，到前序的最后一个位置结束 preLeft+inLeftNum+1,preRight
                (3)中序左子树的范围说明:
                    从中序的第一个节点开始，到前序第二个的节点在中序中出现的位置-1结束（中序根节点的前一个） inLeft,inMid-1
                (4)中序右子树的范围说明:
                    从前序的第二个的节点在中序中出现的位置+1开始，到中序的最后一个位置结束 inMid+1,inRight

                前序左子树的范围[preLeft+1 , preL+inLeftNum] 中序左子树的范围[inL , inMid-1]
                前序右子树的范围[preLeft+inLeftNum+1 , preRight] 中序右子树的范围[inMid+1 , inRight]
         */
        //构建左子树
        root.left = helper(preorder, inorder, preLeft+1, preLeft+inLeftNum, inLeft, inMid - 1);
        //构建右子树
        root.right = helper(preorder, inorder, preLeft+inLeftNum + 1, preRight, inMid+1, inRight);
        return root;
    }
}
