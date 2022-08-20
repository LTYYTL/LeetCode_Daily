package com.offer.L0007;

public class RebuildBinaryTreeTest {
    public static void main(String[] args) {
        RebuildBinaryTree rebuildBinaryTree = new RebuildBinaryTree();
        /*
          例如，给出
          前序遍历 preorder = [3,9,20,15,7]
          中序遍历 inorder = [9,3,15,20,7]
          返回如下的二叉树：
              3
             / \
            9  20
              /  \
             15   7
         */
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        System.out.println(rebuildBinaryTree.buildTree(preorder, inorder));
    }
}
