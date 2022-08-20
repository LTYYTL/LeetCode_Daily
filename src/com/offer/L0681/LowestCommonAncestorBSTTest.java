package com.offer.L0681;

import com.util.TreeNode;

public class LowestCommonAncestorBSTTest {
    public static void main(String[] args) {
        LowestCommonAncestorBST lowestCommonAncestorBST = new LowestCommonAncestorBST();
        /*
          示例 1:
          输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
          输出: 6
          解释: 节点 2 和节点 8 的最近公共祖先是 6。
         */

        TreeNode rlrl = new TreeNode(3);
        TreeNode rlrr = new TreeNode(5);

        TreeNode rlr = new TreeNode(4, rlrl, rlrr);
        TreeNode rll = new TreeNode(0);
        TreeNode rrl = new TreeNode(7);
        TreeNode rrr = new TreeNode(9);

        TreeNode rr = new TreeNode(8,rrl,rrr);
        TreeNode rl = new TreeNode(2,rll,rlr);

        TreeNode root = new TreeNode(6,rl,rr);

        System.out.println(lowestCommonAncestorBST.lowestCommonAncestor(root,new TreeNode<>(2),new TreeNode<>(8)));
    }
}
