package com.leetcode.L1_100.L0094;

import com.util.TreeNode;

public class InOrderTest {
    public static void main(String[] args) {
        InOrder inOrder = new InOrder();
        /*
          示例:
          输入: [1,null,2,3]
             1
              \
               2
              /
             3
          输出: [1,3,2]
         */
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);

        root.right = r1;
        r1.left = r2;

        System.out.println(inOrder.inorderTraversal(root).toString());
        System.out.println(inOrder.inorderTraversal_NonRecursive(root).toString());
    }
}
