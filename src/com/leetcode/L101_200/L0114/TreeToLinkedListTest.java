package com.leetcode.L101_200.L0114;

import com.util.TreeNode;

public class TreeToLinkedListTest {
    public static void main(String[] args) {

        TreeToLinkedList treeToLinkedList = new TreeToLinkedList();
        /*
          示例 1：
          输入：root = [1,2,5,3,4,null,6]
          输出：[1,null,2,null,3,null,4,null,5,null,6]
         */
        TreeNode treeNode = new TreeNode(new Integer[]{1, 2, 5, 3, 4, null, 6}).root;
        treeToLinkedList.flatten(treeNode);
        System.out.println(treeNode);
        /*
          示例 2：
          输入：root = []
          输出：[]
         */
        treeToLinkedList.flatten(null);
        /*
          示例 3：
          输入：root = [0]
          输出：[0]
         */
        treeNode = new TreeNode(0);
        treeToLinkedList.flatten(treeNode);
        System.out.println(treeNode);
    }
}
