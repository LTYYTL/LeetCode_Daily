package com.leetcode.L1301_1400.L1367;

import com.util.ListNode;
import com.util.TreeNode;

public class TreeLinkedListNodeInBinaryTreeTest {
    public static void main(String[] args) {
        TreeLinkedListNodeInBinaryTree treeLinkedListNodeInBinaryTree = new TreeLinkedListNodeInBinaryTree();
        /*
         * 示例 1：
         * 输入：head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
         * 输出：true
         * 解释：树中蓝色的节点构成了与链表对应的子路径。
         */
        ListNode listNode = new ListNode();
        listNode.add(new int[]{4, 2, 8}, listNode);
        TreeNode treeNode = new TreeNode(new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3});
        System.out.println(treeLinkedListNodeInBinaryTree.isSubPath(listNode.next, treeNode.root));
        /*
         * 示例 2：
         * 输入：head = [1,4,2,6], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
         * 输出：true
         */
        listNode = new ListNode();
        listNode.add(new int[]{1, 4, 2, 6}, listNode);
        treeNode = new TreeNode(new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3});
        System.out.println(treeLinkedListNodeInBinaryTree.isSubPath(listNode.next, treeNode.root));
        /*
         * 示例 3：
         * 输入：head = [1,4,2,6,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
         * 输出：false
         * 解释：二叉树中不存在一一对应链表的路径。
         */
        listNode = new ListNode();
        listNode.add(new int[]{1, 4, 2, 6, 8}, listNode);
        treeNode = new TreeNode(new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3});
        System.out.println(treeLinkedListNodeInBinaryTree.isSubPath(listNode.next, treeNode.root));
    }
}
