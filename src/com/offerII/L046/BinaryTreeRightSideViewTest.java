package com.offerII.L046;

import com.util.TreeNode;

public class BinaryTreeRightSideViewTest {
    public static void main(String[] args) {
        BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();
        /*
          示例 1:
          输入: [1,2,3,null,5,null,4]
          输出: [1,3,4]
         */
        System.out.println(binaryTreeRightSideView.rightSideView(new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)))));
        /*
          示例 2:
          输入: [1,null,3]
          输出: [1,3]
         */
        System.out.println(binaryTreeRightSideView.rightSideView(new TreeNode(1, null, new TreeNode(3))));
        /*
          示例 3:
          输入: []
          输出: []
         */
        System.out.println(binaryTreeRightSideView.rightSideView(null));
    }
}
