package com.interview.L0405;

import com.util.TreeNode;

public class LegalBSTTest {
    public static void main(String[] args) {
        LegalBST legalBST = new LegalBST();
        /*
          示例 1:
          输入:
              2
             / \
            1   3
          输出: true
         */
        System.out.println(legalBST.isValidBST(new TreeNode<>(2, new TreeNode(1), new TreeNode(3))));
        /*
          示例 2:
          输入:
              5
             / \
            1   4
               / \
              3   6
          输出: false
          解释: 输入为: [5,1,4,null,null,3,6]。
               根节点的值为 5 ，但是其右子节点值为 4 。
         */
        System.out.println(legalBST.isValidBST(new TreeNode<>(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
    }
}
