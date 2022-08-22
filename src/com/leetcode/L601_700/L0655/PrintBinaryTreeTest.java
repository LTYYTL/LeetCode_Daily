package com.leetcode.L601_700.L0655;

import com.util.TreeNode;

public class PrintBinaryTreeTest {
    public static void main(String[] args) {
        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        /*
          示例 1：
          输入：root = [1,2]
          输出：
          [["","1",""],
           ["2","",""]]
         */
        System.out.println(printBinaryTree.printTree(new TreeNode(1, new TreeNode(2), null)));
        /*
          示例 2：
          输入：root = [1,2,3,null,4]
          输出：
          [["","","","1","","",""],
           ["","2","","","","3",""],
           ["","","4","","","",""]]
         */

    }
}
